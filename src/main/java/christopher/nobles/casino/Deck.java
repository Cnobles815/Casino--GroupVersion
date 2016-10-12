package christopher.nobles.casino;

import java.util.HashMap;

/**
 * Created by christophernobles on 10/11/16.
 */
public class Deck {

    Card[] standardDeck = new Card[54];


    Deck() {

        int suitCount = 0;
        int cardCount = 0;

        for (int i = 0; i < 12; i++) {
            if (i < 12) {
                standardDeck[i] = new Card(Suits.CLUBS, i);
            }
        }

        for (int i = 13; i < 26; i++) {
            if (i < 26) {
                standardDeck[i] = new Card(Suits.DIAMONDS, i);
            }
        }

        for (int i = 27; i < 40; i++) {
            if (i < 27) {
                standardDeck[i] = new Card(Suits.HEARTS, i);
            }
        }

        for (int i = 41; i < 54; i++) {
            if (i < 54) {
                standardDeck[i] = new Card(Suits.SPADES, i);
            }
        }
    }

}





//TODO LEGACY CODE DO NOT REMOVE



//        Card clubsAce = new Card(Suits.CLUBS, 1);
//        Card clubsTwo = new Card(Suits.CLUBS, 2);
//        Card clubsThree = new Card(Suits.CLUBS, 3);
//        Card clubsFour = new Card(Suits.CLUBS, 4);
//        Card clubsFive = new Card(Suits.CLUBS, 5);
//        Card clubsSix = new Card(Suits.CLUBS, 6);
//        Card clubsSeven = new Card(Suits.CLUBS, 7);
//        Card clubsEight = new Card(Suits.CLUBS, 8);
//        Card clubsNine = new Card(Suits.CLUBS, 9);
//        Card clubsTen = new Card(Suits.CLUBS, 10);
//        Card clubsJack = new Card (Suits.CLUBS, 11);
//        Card clubsQuenn = new Card(Suits.CLUBS, 12);
//        Card clubsKing = new Card(Suits.CLUBS, 13);
//
//        Card diamondsAce = new Card(Suits.DIAMONDS, 1);
//        Card diamondsTwo = new Card(Suits.DIAMONDS, 2);
//        Card diamondsThree = new Card(Suits.DIAMONDS, 3);
//        Card diamondsFour = new Card(Suits.DIAMONDS, 4);
//        Card diamondsFive = new Card(Suits.DIAMONDS, 5);
//        Card diamondsSix = new Card(Suits.DIAMONDS, 6);
//        Card diamondsSeven = new Card(Suits.DIAMONDS, 7);
//        Card diamondsEight = new Card(Suits.DIAMONDS, 8);
//        Card diamondsNine = new Card(Suits.DIAMONDS, 9);
//        Card diamondsTen = new Card(Suits.DIAMONDS, 10);
//        Card diamondsJack = new Card(Suits.DIAMONDS, 11);
//        Card diamondsQuenn = new Card(Suits.DIAMONDS, 12);
//        Card diamondsKing = new Card(Suits.DIAMONDS, 13);
//
//        Card heartsAce = new Card(Suits.HEARTS, 1);
//        Card heartsTwo = new Card(Suits.HEARTS, 2);
//        Card heartsThree = new Card(Suits.HEARTS, 3);
//        Card heartsFour = new Card(Suits.HEARTS, 4);
//        Card heartsFive = new Card(Suits.HEARTS, 5);
//        Card heartsSix = new Card(Suits.HEARTS, 6);
//        Card heartsSeven = new Card(Suits.HEARTS, 7);
//        Card heartsEight = new Card(Suits.HEARTS, 8);
//        Card heartsNine = new Card(Suits.HEARTS, 9);
//        Card heartsTen = new Card(Suits.HEARTS, 10);
//        Card heartsJack = new Card(Suits.HEARTS, 11);
//        Card heartsQueen = new Card(Suits.HEARTS, 12);
//        Card heartsKing = new Card(Suits.HEARTS, 13);
//
//        Card spadesAce = new Card(Suits.SPADES, 1);
//        Card spadesTwo = new Card(Suits.SPADES, 2);
//        Card spadesThree = new Card(Suits.SPADES, 3);
//        Card spadesFour = new Card(Suits.SPADES, 4);
//        Card spadesFive = new Card(Suits.SPADES, 5);
//        Card spadesSix = new Card(Suits.SPADES, 6);
//        Card spadesSeven = new Card(Suits.SPADES, 7);
//        Card spadesEight = new Card(Suits.SPADES, 8);
//        Card spadesNine = new Card(Suits.SPADES, 9);
//        Card spadesTen = new Card(Suits.SPADES, 10);
//        Card spadesJack = new Card(Suits.SPADES, 11);
//        Card spadesQueen = new Card(Suits.SPADES, 12);
//        Card spadesKing = new Card(Suits.SPADES, 13);


