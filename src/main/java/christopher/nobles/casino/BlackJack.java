package christopher.nobles.casino;

import static java.lang.String.valueOf;

public class BlackJack extends CardGame  {
    int bet = 0;

    private Deck deck = new Deck(DeckType.STANDARD);
    private Deck hand = new Deck(DeckType.HAND);
    private Deck shuffled = new Deck (DeckType.SHUFFLED);

    public void runGame(){
        Display.renderBlackJackStart();
        deal();
    }

    public void deal(){
        deck.drawDown(4, shuffled.shuffledDeck, hand.hand);
        Display.playerHand(hand.hand);
    }

}
