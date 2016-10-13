package christopher.nobles.casino;

public class Card {
    private final Suit suit;
    private final int rank;

    Card(Suit suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() { return suit; }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString(){
        return this.rank + " of " + this.suit;
    }
}
