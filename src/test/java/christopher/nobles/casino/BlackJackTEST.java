package christopher.nobles.casino;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by christophernobles on 10/13/16.
 */
public class BlackJackTEST {

    @Test
    public void dealTest(){
        Deck shuffled = new Deck(DeckType.SHUFFLED);
        Deck hand = new Deck(DeckType.HAND);
        BlackJack testJack = new BlackJack();

        testJack.deal(4, shuffled.shuffledDeck, hand.hand);
        Display.playerHand(hand.hand);
        int expected = 4;
        int actual = hand.hand.size();
        assertEquals("The value should be 4" , expected, actual);
    }
}
