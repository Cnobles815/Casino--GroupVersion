package christopher.nobles.casino;

public class CardGame implements Game {


    public void runGame() {

    }

    public void belowPlayerBalance() {
        if (PlayerCollection.playerList.get(0).getBalance() == 0) {
            Display.renderNoMoneyAlert();
            CasinoEngine.exit();
        } else if(PlayerCollection.playerList.get(0).getBalance() < 0){
            Display.debt();
            CasinoEngine.exit();
        }
    }


    public void increasePlayerBalance(double increaseBy) {

    }
}
