package christopher.nobles.casino;

import java.util.ArrayList;

public class BlackJack extends CardGame  {

    int bet = 0;


    private Deck hand = new Deck(DeckType.HAND);
    private Deck dealerShuffled = new Deck (DeckType.SHUFFLED);

    public void runGame(){
        Display.renderBlackJackStart();
        deal(5, dealerShuffled.shuffledDeck, hand.hand);
    }

    public void deal(int cardNum, ArrayList<Card> from, ArrayList<Card> to){
        dealerShuffled.drawDown(cardNum, from, to);
        Display.playerHand(hand.hand);
    }

}
