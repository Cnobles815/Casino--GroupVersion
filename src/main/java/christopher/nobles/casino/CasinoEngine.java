package christopher.nobles.casino;

/**
 * Created by christophernobles on 10/11/16.
 */
public class CasinoEngine {
    int choice;

    UserInput userInput = new UserInput();

     public void startCasino(){
         Display.timeStamp();
        Display.welcome();
         Display.mainMenu();
         choice = userInput.getUserInput();
         userInput.getUserInput();

    }

    public void addPlayer(){

    }

}
