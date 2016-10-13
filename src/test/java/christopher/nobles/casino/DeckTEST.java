package christopher.nobles.casino;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTEST {

    @Test
    public void standardDeckLengthTest(){
        Deck deck = new Deck(DeckType.STANDARD);
        int expected = 52;
        int actual = deck.standardDeck.size();
        assertEquals("The value should be 52" , expected, actual);
    }

    @Test
    public void shuffledDeckLengthTest(){
        Deck deck = new Deck(DeckType.SHUFFLED);
        int expected = 52;
        int actual = deck.shuffledDeck.size();
        assertEquals("The value should be 52" , expected, actual);
    }

    @Test
    public void clubAceTest(){
        Deck deck = new Deck(DeckType.STANDARD);
        //first - Ace of Clubs
        //last - King of Spades
        Card ace = deck.standardDeck.get(0);
        int expectedId = 1;
        int actualId = ace.getId();
        assertEquals("The value should be 1", expectedId, actualId);

        Suit expectedSuit = Suit.CLUBS;
        Suit actualSuit = ace.getSuit();
        assertEquals("The suit should be CLUBS" , expectedSuit, actualSuit);
    }

    @Test
    public void clubKingTest(){
        Deck deck = new Deck(DeckType.STANDARD);
        Card king = deck.standardDeck.get(12);
        int expectedId = 13;
        int actualId = king.getId();
        assertEquals("The value should be 13", expectedId, actualId);

        Suit expectedSuit = Suit.CLUBS;
        Suit actualSuit = king.getSuit();
        assertEquals("The suit should be CLUBS", expectedSuit, actualSuit);
    }

    @Test
    public void diamondAceTest(){
        Deck deck = new Deck(DeckType.STANDARD);
        Card ace = deck.standardDeck.get(13);
        int expectedId = 1;
        int actualId = ace.getId();
        assertEquals("The value should be 1", expectedId, actualId);

        Suit expectedSuit = Suit.DIAMONDS;
        Suit actualSuit = ace.getSuit();
        assertEquals("The suit should be DIAMONDS", expectedSuit, actualSuit);
    }

    @Test
    public void diamondKingTest(){
        Deck deck = new Deck(DeckType.STANDARD);
        Card king = deck.standardDeck.get(25);
        int expectedId = 13;
        int actualId = king.getId();
        assertEquals("The value should be 13", expectedId, actualId);

        Suit expectedSuit = Suit.DIAMONDS;
        Suit actualSuit = king.getSuit();
        assertEquals("The suit should be DIAMONDS", expectedSuit, actualSuit);
    }

    @Test
    public void heartsAceTest(){
        Deck deck = new Deck(DeckType.STANDARD);
        Card ace = deck.standardDeck.get(26);
        int expectedId = 1;
        int actualId = ace.getId();
        assertEquals("The value should be 1" , expectedId, actualId);

        Suit expectedSuit = Suit.HEARTS;
        Suit actualSuit = ace.getSuit();
        assertEquals("The suit should be HEARTS" , expectedSuit, actualSuit);
    }

    @Test
    public void heartsKingTest(){
        Deck deck = new Deck(DeckType.STANDARD);
        Card king = deck.standardDeck.get(38);
        int expectedId = 13;
        int actualId = king.getId();
        assertEquals("The value should be 13", expectedId, actualId);

        Suit expectedSuit = Suit.HEARTS;
        Suit actualSuit = king.getSuit();
        assertEquals("The suit should be HEARTS" , expectedSuit, actualSuit);
    }

    @Test
    public void spadesAceTest(){
        Deck deck = new Deck(DeckType.STANDARD);
        Card ace = deck.standardDeck.get(39);
        int expectedId = 1;
        int actualId = ace.getId();
        assertEquals("The value should be 1", expectedId, actualId);

        Suit expectedSuit = Suit.SPADES;
        Suit actualSuit = ace.getSuit();
        assertEquals("The suit should be SPADES", expectedSuit, actualSuit);
    }

    @Test
    public void spadesKingTest(){
        Deck deck = new Deck(DeckType.STANDARD);
        Card king = deck.standardDeck.get(51);
        int expectedId = 13;
        int actualId = king.getId();
        assertEquals("The value should be 13", expectedId, actualId );

        Suit expectedSuit = Suit.SPADES;
        Suit actualSuit = king.getSuit();
        assertEquals("The suit should be SPADES", expectedSuit, actualSuit);
    }
}
