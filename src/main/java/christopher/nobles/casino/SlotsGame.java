package christopher.nobles.casino;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by christophernobles on 10/11/16.
 */
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

    public void belowPlayerBalance(double balCheck) {

    }

    public void increasePlayerBalance(double increaseBy) {

    }


}
