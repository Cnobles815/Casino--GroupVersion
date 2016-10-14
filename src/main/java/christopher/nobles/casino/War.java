package christopher.nobles.casino;

import java.util.ArrayList;

import static christopher.nobles.casino.DeckType.HAND;
import static christopher.nobles.casino.DeckType.SHUFFLED;

/**
 * Created by christophernobles on 10/14/16.
 */
public class War extends CardGame {
    double playerWager;
    double setting;
    short choice;

    Deck dealerShuffled = new Deck(SHUFFLED);
    Deck currentHand = new Deck(HAND);

    public void runGame(){
        belowPlayerBalance();
        Display.doubleNewLine();
        Display.timeStamp();
        Display.renderWarWelcome();
        Display.singleNewLine();
        deal(1, dealerShuffled.shuffledDeck, currentHand.hand);
        Display.playerHand(currentHand.hand);
        Display.doubleNewLine();
        Display.renderHighLowBetPrompt();
        setWager();
        compareCards();
        playAgain();
    }

    public void runGameAgain(){
        Display.timeStamp();
        belowPlayerBalance();
        discard(currentHand.hand, 0);
        deal(1, dealerShuffled.shuffledDeck, currentHand.hand);
        Display.playerHand(currentHand.hand);
        Display.doubleNewLine();
        Display.renderWarWelcome();
        setWager();
        compareCards();
        playAgain();
    }

    public double inputSet(){
        setting = UserInput.getUserInputDbl();
        return setting;
    }

    public double setWager (){
        //Display.renderWagerPrompt();
        setting = UserInput.getUserInputDbl();
        playerWager = setting;
        return playerWager;
    }

    public double getWager(){
        return playerWager;
    }

    public void deal(int cardNum, ArrayList<Card> from, ArrayList<Card> to){
        dealerShuffled.drawDown(cardNum, from, to);
    }

    public void discard(ArrayList<Card> target, int index){
        target.remove(index);
    }

    public boolean compareCards(){
        boolean winLoss;
        if ((currentHand.hand.get(0).getRank()) <= ((dealerShuffled.shuffledDeck.get(0).getRank())))
        {
            winLoss = true;
            PlayerCollection.playerList.get(0).changeBalance(playerWager);
            Display.highLowWin();
            Display.playerBalance();
        }else{
            winLoss = false;
            PlayerCollection.playerList.get(0).changeBalance(-playerWager);
            Display.highLowLoss();
            Display.playerBalance();
        }

        return winLoss;
    }

    public void playAgain(){
        CasinoEngine casinoEngine = new CasinoEngine();
        Display.renderPlayAgainPrompt();
        choice = UserInput.getUserInputShort();

        switch (choice){
            case 1:
                runGameAgain();
                break;
            case 2:
                casinoEngine.recursiveMenu();
        }
    }
}
