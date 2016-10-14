package christopher.nobles.casino;

import java.util.Scanner;

public class UserInput {
    static Scanner userInput = new Scanner(System.in);

    static String strIn = "";
    static int intIn = 0;
    static double doubleIn = 0.0;
    static short shortIn = 0;

    static public String getUserInputStr(){
        strIn = userInput.next();
        return strIn;
    }

    static public int getUserInputInt(){
        intIn = userInput.nextInt();
        return intIn;
    }

    static public double getUserInputDbl(){
        doubleIn = userInput.nextDouble();
        return doubleIn;
    }

    static public short getUserInputShort(){
        shortIn = userInput.nextShort();
        return shortIn;
    }
}
