package christopher.nobles.casino;

/**
 * Created by christophernobles on 10/10/16.
 */
public class Card {
    private final Suit suit;
    private final int id;

    Card(Suit suit, int id){
        this.suit = suit;
        this.id = id;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getId() {
        return id;
    }
}
