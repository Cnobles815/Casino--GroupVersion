package christopher.nobles.casino;

import java.security.SecureRandom;

public class SlotsGame implements Game {
    static SecureRandom column1 = new SecureRandom();
    static SecureRandom column2 = new SecureRandom();
    static SecureRandom column3 = new SecureRandom();

    public int getColumn1(){
        return column1.nextInt(10);
    }

    public int getColumn2(){
        return column2.nextInt(10);
    }

    public int getColumn3(){
        return column3.nextInt(10);
    }

    public void runGame() {

    }

    public void belowPlayerBalance() {
        if (PlayerCollection.playerList.get(0).getBalance() <= 0) {
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
