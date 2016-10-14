package christopher.nobles.casino;

import static christopher.nobles.casino.UserInput.*;

public class MenuLogic {
    BlackJack blackJack = new BlackJack();
    BasicSlots slots = new BasicSlots();
    HighLow highLow = new HighLow();

    public void mainMenuLogic(int choice){
        CasinoEngine casinoEngine = new CasinoEngine();
        Display display = new Display();

        String name;
        double balance = 0;
        switch (choice) {
            case 1:         //create account
                display.renderAccountCreationPrompt();
                name = getUserInputStr();
                balance = getUserInputDbl();
                Player player = new Player(name, balance);
                PlayerCollection.addPlayer(player);
                casinoEngine.recursiveMenu();
                break;
            case 2:
                break;
            case 3:          //games menu
                if (PlayerCollection.playerList.isEmpty()){
                    display.renderNoAccountAlert();
                    casinoEngine.recursiveMenu();
                }
                casinoEngine.gamesMenu();
                break;
            case 4:

                break;
            case 5:
                CasinoEngine.exit();
                break;
        }
    }

    public void gamesMenuLogic(int choice) {
        CasinoEngine casinoEngine = new CasinoEngine();
        switch (choice) {
            case 1:
                slots.runGame();
                break;
            case 2:
                blackJack.unfinishedGame();
                break;
            case 3:
                highLow.runGame();
                break;
            case 4:
                casinoEngine.recursiveMenu();
                break;
            default:

        }
    }
}
