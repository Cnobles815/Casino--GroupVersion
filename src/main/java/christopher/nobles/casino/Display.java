package christopher.nobles.casino;
import java.util.Date;

public class Display {

    static Date date = new Date();

    static public void welcome(){
        print("        \n\nWelcome to to Nobles Casino. \nYou're here because you don't like your money very much. \nFortunately for you, Nobles Casino is ready and willing to take it from you!");
    }

    static public void mainMenu(){
        print("     \n \n|     [[MAIN MENU]] \n| [1] - Create Account \n| [2] - Existing Player \n| [3] - Games Menu \n| [4] - Account Options");
    }

    static public void dealerHand(){
        print("");
    }

    static public void playerHand(){
        print("");
    }

    static public void timeStamp() {
        print(String.format((char)27 + "[34;1m%76s",date.toString()));
        print((char)27 + "[0m");
    }

    static public String print(String output){
        System.out.println(output);
        return output;
    }

}
