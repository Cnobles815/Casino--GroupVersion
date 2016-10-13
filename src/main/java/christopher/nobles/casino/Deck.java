package christopher.nobles.casino;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    ArrayList<Card> standardDeck;
    ArrayList<Card> hand;
    ArrayList<Card> shuffledDeck;



    Deck(DeckType type) {
        shuffledDeck = new ArrayList<Card>();
        standardDeck = new ArrayList<Card>();
        hand = new ArrayList<Card>();

        switch (type) {
            case STANDARD:
                for (int i = 0; i <= 12; i++) {standardDeck.add(i , new Card(Suit.CLUBS, i + 1));}
                for (int i = 13; i <= 25; i++) {standardDeck.add(i , new Card(Suit.DIAMONDS, i - 12));}
                for (int i = 26; i <= 38; i++) {standardDeck.add(i , new Card(Suit.HEARTS, i - 25));}
                for (int i = 39; i < 52; i++) {standardDeck.add(i , new Card(Suit.SPADES, i - 38));}
                break;
            case SHUFFLED:
                for (int i = 0; i <= 12; i++) {shuffledDeck.add(i , new Card(Suit.CLUBS, i + 1));}
                for (int i = 13; i <= 25; i++) {shuffledDeck.add(i , new Card(Suit.DIAMONDS, i - 12));}
                for (int i = 26; i <= 38; i++) {shuffledDeck.add(i , new Card(Suit.HEARTS, i - 25));}
                for (int i = 39; i < 52; i++) {shuffledDeck.add(i , new Card(Suit.SPADES, i - 38));}
                shuffleDeck(shuffledDeck);
                break;
            case DOUBLESTANDARD:
                for (int i = 0; i <= 12; i++) {shuffledDeck.add(i , new Card(Suit.CLUBS, i + 1));}
                for (int i = 13; i <= 25; i++) {shuffledDeck.add(i , new Card(Suit.DIAMONDS, i - 12));}
                for (int i = 26; i <= 38; i++) {shuffledDeck.add(i , new Card(Suit.HEARTS, i - 25));}
                for (int i = 39; i < 52; i++) {shuffledDeck.add(i , new Card(Suit.SPADES, i - 38));}
        }
    }



    public void shuffleDeck(ArrayList<Card> deck){
        Collections.shuffle(deck);
    }

    public void drawDown(int drawNum, Deck deck){
        for (int i = 0; i < drawNum; i++){
            hand.add(standardDeck.get(i));
        }
    }
}
//TODO LEGACY CODE DO NOT REMOVE
/*      Card clubsAce = new Card(Suit.CLUBS, 1);
        Card clubsTwo = new Card(Suit.CLUBS, 2);
        Card clubsThree = new Card(Suit.CLUBS, 3);
        Card clubsFour = new Card(Suit.CLUBS, 4);
        Card clubsFive = new Card(Suit.CLUBS, 5);
        Card clubsSix = new Card(Suit.CLUBS, 6);
        Card clubsSeven = new Card(Suit.CLUBS, 7);
        Card clubsEight = new Card(Suit.CLUBS, 8);
        Card clubsNine = new Card(Suit.CLUBS, 9);
        Card clubsTen = new Card(Suit.CLUBS, 10);
        Card clubsJack = new Card (Suit.CLUBS, 11);
        Card clubsQuenn = new Card(Suit.CLUBS, 12);
        Card clubsKing = new Card(Suit.CLUBS, 13);

        Card diamondsAce = new Card(Suit.DIAMONDS, 1);
        Card diamondsTwo = new Card(Suit.DIAMONDS, 2);
        Card diamondsThree = new Card(Suit.DIAMONDS, 3);
        Card diamondsFour = new Card(Suit.DIAMONDS, 4);
        Card diamondsFive = new Card(Suit.DIAMONDS, 5);
        Card diamondsSix = new Card(Suit.DIAMONDS, 6);
        Card diamondsSeven = new Card(Suit.DIAMONDS, 7);
        Card diamondsEight = new Card(Suit.DIAMONDS, 8);
        Card diamondsNine = new Card(Suit.DIAMONDS, 9);
        Card diamondsTen = new Card(Suit.DIAMONDS, 10);
        Card diamondsJack = new Card(Suit.DIAMONDS, 11);
        Card diamondsQuenn = new Card(Suit.DIAMONDS, 12);
        Card diamondsKing = new Card(Suit.DIAMONDS, 13);

        Card heartsAce = new Card(Suit.HEARTS, 1);
        Card heartsTwo = new Card(Suit.HEARTS, 2);
        Card heartsThree = new Card(Suit.HEARTS, 3);
        Card heartsFour = new Card(Suit.HEARTS, 4);
        Card heartsFive = new Card(Suit.HEARTS, 5);
        Card heartsSix = new Card(Suit.HEARTS, 6);
        Card heartsSeven = new Card(Suit.HEARTS, 7);
        Card heartsEight = new Card(Suit.HEARTS, 8);
        Card heartsNine = new Card(Suit.HEARTS, 9);
        Card heartsTen = new Card(Suit.HEARTS, 10);
        Card heartsJack = new Card(Suit.HEARTS, 11);
        Card heartsQueen = new Card(Suit.HEARTS, 12);
        Card heartsKing = new Card(Suit.HEARTS, 13);

        Card spadesAce = new Card(Suit.SPADES, 1);
        Card spadesTwo = new Card(Suit.SPADES, 2);
        Card spadesThree = new Card(Suit.SPADES, 3);
        Card spadesFour = new Card(Suit.SPADES, 4);
        Card spadesFive = new Card(Suit.SPADES, 5);
        Card spadesSix = new Card(Suit.SPADES, 6);
        Card spadesSeven = new Card(Suit.SPADES, 7);
        Card spadesEight = new Card(Suit.SPADES, 8);
        Card spadesNine = new Card(Suit.SPADES, 9);
        Card spadesTen = new Card(Suit.SPADES, 10);
        Card spadesJack = new Card(Suit.SPADES, 11);
        Card spadesQueen = new Card(Suit.SPADES, 12);
        Card spadesKing = new Card(Suit.SPADES, 13);
*/

