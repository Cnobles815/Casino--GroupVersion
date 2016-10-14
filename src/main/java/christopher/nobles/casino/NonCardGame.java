package christopher.nobles.casino;

public class NonCardGame implements Game {
    public void runGame() {

    }

    public void belowPlayerBalance() {

    }

    public void increasePlayerBalance(double increaseBy) {
        if (PlayerCollection.playerList.get(0).getBalance() <= 0) {
            Display.renderNoMoneyAlert();
            CasinoEngine.exit();
        } else if(PlayerCollection.playerList.get(0).getBalance() < 0){
            Display.debt();
            CasinoEngine.exit();
        }

    }
}
