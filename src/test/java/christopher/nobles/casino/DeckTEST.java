package christopher.nobles.casino;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by christophernobles on 10/12/16.
 */
public class DeckTEST {

    @Test
    public void deckLengthTest(){
        Deck deck = new Deck();

        int expected = 52;
        int actual = deck.standardDeck.length;
        assertEquals("The value should be 52" , expected, actual);
    }

    @Test
    public void clubAceTest(){
        Deck deck = new Deck();
        //first - Ace of Clubs
        //last - King of Spades
        Card ace = deck.standardDeck[0];
        int expectedId = 1;
        int actualId = ace.getId();
        assertEquals("The value should be 1", expectedId, actualId);

        Suit expectedSuit = Suit.CLUBS;
        Suit actualSuit = ace.getSuit();
        assertEquals("The suit should be CLUBS" , expectedSuit, actualSuit);
    }

    @Test
    public void clubKingTest(){
        Deck deck = new Deck();

        Card king = deck.standardDeck[12];
        int expectedId = 13;
        int actualId = king.getId();
        assertEquals("The value should be 13", expectedId, actualId);

        Suit expectedSuit = Suit.CLUBS;
        Suit actualSuit = king.getSuit();
        assertEquals("The suit should be CLUBS", expectedSuit, actualSuit);
    }

    @Test
    public void diamondAceTest(){
        Deck deck = new Deck();

        Card ace = deck.standardDeck[13];
        int expectedId = 1;
        int actualId = ace.getId();
        assertEquals("The value should be 1", expectedId, actualId);

        Suit expectedSuit = Suit.DIAMONDS;
        Suit actualSuit = ace.getSuit();
        assertEquals("The suit should be DIAMONDS", expectedSuit, actualSuit);
    }

    @Test
    public void diamondKingTest(){
        Deck deck = new Deck();

        Card king = deck.standardDeck[25];
        int expectedId = 13;
        int actualId = king.getId();
        assertEquals("The value should be 13", expectedId, actualId);

        Suit expectedSuit = Suit.DIAMONDS;
        Suit actualSuit = king.getSuit();
        assertEquals("The suit should be DIAMONDS", expectedSuit, actualSuit);
    }

    @Test
    public void heartsAceTest(){
        Deck deck = new Deck();

        Card ace = deck.standardDeck[26];
        int expectedId = 1;
        int actualId = ace.getId();
        assertEquals("The value should be 1" , expectedId, actualId);

        Suit expectedSuit = Suit.HEARTS;
        Suit actualSuit = ace.getSuit();
        assertEquals("The suit should be HEARTS" , expectedSuit, actualSuit);
    }

    @Test
    public void heartsKingTest(){
        Deck deck = new Deck();

        Card king = deck.standardDeck[38];
        int expectedId = 13;
        int actualId = king.getId();
        assertEquals("The value should be 13", expectedId, actualId);

        Suit expectedSuit = Suit.HEARTS;
        Suit actualSuit = king.getSuit();
        assertEquals("The suit should be HEARTS" , expectedSuit, actualSuit);
    }

    @Test
    public void spadesAceTest(){
        Deck deck = new Deck();

        Card ace = deck.standardDeck[39];
        int expectedId = 1;
        int actualId = ace.getId();
        assertEquals("The value should be 1", expectedId, actualId);

        Suit expectedSuit = Suit.SPADES;
        Suit actualSuit = ace.getSuit();
        assertEquals("The suit should be SPADES", expectedSuit, actualSuit);
    }

    @Test
    public void spadesKingTest(){
        Deck deck = new Deck();

        Card king = deck.standardDeck[51];
        int expectedId = 13;
        int actualId = king.getId();
        assertEquals("The value should be 13", expectedId, actualId );

        Suit expectedSuit = Suit.SPADES;
        Suit actualSuit = king.getSuit();
        assertEquals("The suit should be SPADES", expectedSuit, actualSuit);
    }



}
