package christopher.nobles.casino;

/**
 * Created by christophernobles on 10/11/16.
 */
public interface Game {
    public void runGame();
    public void belowPlayerBalance(double balCheck);
    public void increasePlayerBalance(double increaseBy);
}
