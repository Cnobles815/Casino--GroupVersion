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
        int expectedRank = 1;
        int actualId = ace.getRank();
        assertEquals("The value should be 1", expectedRank, actualId);

        Suit expectedSuit = Suit.CLUBS;
        Suit actualSuit = ace.getSuit();
        assertEquals("The suit should be CLUBS" , expectedSuit, actualSuit);
    }

    @Test
    public void clubKingTest(){
        Deck deck = new Deck(DeckType.STANDARD);
        Card king = deck.standardDeck.get(12);
        int expectedRank = 13;
        int actualRank = king.getRank();
        assertEquals("The value should be 13", expectedRank, actualRank);

        Suit expectedSuit = Suit.CLUBS;
        Suit actualSuit = king.getSuit();
        assertEquals("The suit should be CLUBS", expectedSuit, actualSuit);
    }

    @Test
    public void diamondAceTest(){
        Deck deck = new Deck(DeckType.STANDARD);
        Card ace = deck.standardDeck.get(13);
        int expectedRank = 1;
        int actualRank = ace.getRank();
        assertEquals("The value should be 1", expectedRank, actualRank);

        Suit expectedSuit = Suit.DIAMONDS;
        Suit actualSuit = ace.getSuit();
        assertEquals("The suit should be DIAMONDS", expectedSuit, actualSuit);
    }

    @Test
    public void diamondKingTest(){
        Deck deck = new Deck(DeckType.STANDARD);
        Card king = deck.standardDeck.get(25);
        int expectedRank = 13;
        int actualRank = king.getRank();
        assertEquals("The value should be 13", expectedRank, actualRank);

        Suit expectedSuit = Suit.DIAMONDS;
        Suit actualSuit = king.getSuit();
        assertEquals("The suit should be DIAMONDS", expectedSuit, actualSuit);
    }

    @Test
    public void heartsAceTest(){
        Deck deck = new Deck(DeckType.STANDARD);
        Card ace = deck.standardDeck.get(26);
        int expectedRank = 1;
        int actualRank = ace.getRank();
        assertEquals("The value should be 1" , expectedRank, actualRank);

        Suit expectedSuit = Suit.HEARTS;
        Suit actualSuit = ace.getSuit();
        assertEquals("The suit should be HEARTS" , expectedSuit, actualSuit);
    }

    @Test
    public void heartsKingTest(){
        Deck deck = new Deck(DeckType.STANDARD);
        Card king = deck.standardDeck.get(38);
        int expectedRank = 13;
        int actualRank = king.getRank();
        assertEquals("The value should be 13", expectedRank, actualRank);

        Suit expectedSuit = Suit.HEARTS;
        Suit actualSuit = king.getSuit();
        assertEquals("The suit should be HEARTS" , expectedSuit, actualSuit);
    }

    @Test
    public void spadesAceTest(){
        Deck deck = new Deck(DeckType.STANDARD);
        Card ace = deck.standardDeck.get(39);
        int expectedRank = 1;
        int actualRank = ace.getRank();
        assertEquals("The value should be 1", expectedRank, actualRank);

        Suit expectedSuit = Suit.SPADES;
        Suit actualSuit = ace.getSuit();
        assertEquals("The suit should be SPADES", expectedSuit, actualSuit);
    }

    @Test
    public void spadesKingTest(){
        Deck deck = new Deck(DeckType.STANDARD);
        Card king = deck.standardDeck.get(51);
        int expectedRank = 13;
        int actualRank = king.getRank();
        assertEquals("The value should be 13", expectedRank, actualRank );

        Suit expectedSuit = Suit.SPADES;
        Suit actualSuit = king.getSuit();
        assertEquals("The suit should be SPADES", expectedSuit, actualSuit);
    }
}
