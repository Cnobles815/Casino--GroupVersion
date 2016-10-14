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
    public void doubleStandardDeckLengthTest(){
        Deck deck = new Deck(DeckType.DOUBLESTANDARD);
        int expected = 105;
        int actual = deck.dsDeck.size();
        assertEquals("The value should be 104", expected, actual);
    }

    @Test
    public void standardClubAceTest(){
        Deck deck = new Deck(DeckType.STANDARD);
        Card ace = deck.standardDeck.get(0);
        int expectedRank = 1;
        int actualRank = ace.getRank();
        assertEquals("The value should be 1", expectedRank, actualRank);

        Suit expectedSuit = Suit.CLUBS;
        Suit actualSuit = ace.getSuit();
        assertEquals("The suit should be CLUBS" , expectedSuit, actualSuit);
    }

    @Test
    public void standardClubKingTest(){
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
    public void standardDiamondAceTest(){
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
    public void standardDiamondKingTest(){
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
    public void standardHeartsAceTest(){
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
    public void standardHeartsKingTest(){
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
    public void standardSpadesAceTest(){
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
    public void standardSpadesKingTest(){
        Deck deck = new Deck(DeckType.STANDARD);
        Card king = deck.standardDeck.get(51);
        int expectedRank = 13;
        int actualRank = king.getRank();
        assertEquals("The value should be 13", expectedRank, actualRank );

        Suit expectedSuit = Suit.SPADES;
        Suit actualSuit = king.getSuit();
        assertEquals("The suit should be SPADES", expectedSuit, actualSuit);
    }


    @Test
    public void doubleStandardClubAceTest(){
        Deck deck = new Deck(DeckType.DOUBLESTANDARD);
        //first - Ace of Clubs
        //last - King of Spades
        Card ace = deck.dsDeck.get(53);
        int expectedRank = 1;
        int actualRank = ace.getRank();
        assertEquals("The value should be 1", expectedRank, actualRank);

        Suit expectedSuit = Suit.CLUBS;
        Suit actualSuit = ace.getSuit();
        assertEquals("The suit should be CLUBS", expectedSuit, actualSuit);
    }

    @Test
    public void doubleStandardClubKingTest(){
        Deck deck = new Deck(DeckType.DOUBLESTANDARD);
        Card king = deck.dsDeck.get(65);
        int expectedRank = 13;
        int actualRank = king.getRank();
        assertEquals("The rank should be 13", expectedRank, actualRank);

        Suit expectedSuit = Suit.CLUBS;
        Suit actualSuit = king.getSuit();
        assertEquals("The suit should be CLUBS", expectedSuit, actualSuit);
    }

    @Test
    public void doubleStandardDiamondsAce(){
        Deck deck = new Deck(DeckType.DOUBLESTANDARD);
        Card ace = deck.dsDeck.get(66);
        int expectedRank = 1;
        int actualRank = ace.getRank();
        assertEquals("The rank should be 1", expectedRank, actualRank);

        Suit expectedSuit = Suit.DIAMONDS;
        Suit actualSuit = ace.getSuit();
        assertEquals("The suit should be DIAMONDS", expectedSuit, actualSuit);
    }

    @Test
    public void doubleStandardDiamondsKing(){
        Deck deck = new Deck(DeckType.DOUBLESTANDARD);
        Card king = deck.dsDeck.get(78);
        int expectedRank = 13;
        int actualRank = king.getRank();
        assertEquals("The rank should be 13", expectedRank, actualRank);

        Suit expectedSuit = Suit.DIAMONDS;
        Suit actualSuit = king.getSuit();
        assertEquals("The suit should be DIAMONDS", expectedSuit, actualSuit);
    }

    @Test
    public void doubleStandardHeartsAce(){
        Deck deck = new Deck(DeckType.DOUBLESTANDARD);
        Card ace = deck.dsDeck.get(79);
        int expectedRank = 1;
        int actualRank = ace.getRank();
        assertEquals("The rank should be 1", expectedRank, actualRank);

        Suit expectedSuit = Suit.HEARTS;
        Suit actualSuit = ace.getSuit();
        assertEquals("The suit should be HEARTS", expectedSuit, actualSuit);
    }

    @Test
    public void doubleStandardHeartsKing(){
        Deck deck = new Deck(DeckType.DOUBLESTANDARD);
        Card king = deck.dsDeck.get(91);
        int expectedRank = 13;
        int actualRank = king.getRank();
        assertEquals("The rank should be 13", expectedRank, actualRank);

        Suit expectedSuit = Suit.HEARTS;
        Suit actualSuit = king.getSuit();
        assertEquals("The suit should be HEARTS", expectedSuit, actualSuit);
    }

    @Test
    public void doubleStandardSpadesAce(){
        Deck deck = new Deck(DeckType.DOUBLESTANDARD);
        Card ace = deck.dsDeck.get(92);
        int expectedRank = 1;
        int actualRank = ace.getRank();
        assertEquals("The rank should be 1" , expectedRank, actualRank);

        Suit expectedSuit = Suit.SPADES;
        Suit actualSuit = ace.getSuit();
        assertEquals("The suit should be SPADES", expectedSuit, actualSuit);
    }

    @Test
    public void doubleStandardSpadesKing(){
        Deck deck = new Deck(DeckType.DOUBLESTANDARD);
        Card king = deck.dsDeck.get(104);
        int expectedRank = 13;
        int actualRank = king.getRank();
        assertEquals("The rank should be 13", expectedRank, actualRank);

        Suit expectedSuit = Suit.SPADES;
        Suit actualSuit = king.getSuit();
        assertEquals("The suit should be SPADES", expectedSuit, actualSuit);
    }

    @Test
    public void dealTest(){
        Deck testDeck = new Deck(DeckType.STANDARD);
        Deck testHand = new Deck(DeckType.HAND);

        int expectedRank = 1;
        int actualRank = (testDeck.drawDown(1, testDeck.standardDeck, testHand.hand));
        assertEquals("The value should be 1", expectedRank, actualRank);
    }
}
