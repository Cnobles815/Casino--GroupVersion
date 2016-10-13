package christopher.nobles.casino;

public interface Game {
    public void runGame();
    public void belowPlayerBalance(double balCheck);
    public void increasePlayerBalance(double increaseBy);
}
