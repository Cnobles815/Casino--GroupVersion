package christopher.nobles.casino;

public class CasinoEngine {
    int choice;


    MenuLogic menuLogic = new MenuLogic();

    static void exit(){}

    public void startCasino(){
         Display.timeStamp();
         Display.renderWelcome();
         Display.renderMainMenu();
         choice = UserInput.getUserInputInt();
         menuLogic.mainMenuLogic(choice);
    }

    public void startGamesMenu(){
        Display.renderGamesMenu();
        choice = UserInput.getUserInputInt();
        menuLogic.gamesMenuLogic(choice);
    }

    public void recursiveMenu(){
        Display.timeStamp();
        Display.renderMainMenu();
        choice = UserInput.getUserInputInt();
        menuLogic.mainMenuLogic(choice);
    }

    public void addPlayer(){

    }

}
