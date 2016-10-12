package christopher.nobles.casino;

import java.util.Scanner;

/**
 * Created by christophernobles on 10/11/16.
 */
public class UserInput {
    Scanner userInput = new Scanner(System.in);

    String strIn = "";
    int intIn = 0;
    double doubleIn = 0.0;



    public String getUserInput(String input){
        strIn = userInput.next();
        return strIn;
    }

    public int getUserInput(int input){
        intIn = userInput.nextInt();
        return intIn;
    }

    public double getUserInput(double input){
        doubleIn = userInput.nextDouble();
        return doubleIn;
    }


}
