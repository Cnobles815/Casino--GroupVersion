package christopher.nobles.casino;

/**
 * Created by christophernobles on 10/12/16.
 */
public class MenuLogic {
    BlackJack blackJack = new BlackJack();
    BasicSlots slots = new BasicSlots();




    public void mainMenuLogic(int choice){
        CasinoEngine casinoEngine = new CasinoEngine();
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                casinoEngine.startGamesMenu();
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }

    public void gamesMenuLogic(int choice) {
        switch (choice) {
            case 1:
                blackJack.runGame();
                break;
            case 2:
                slots.runGame();
                break;
            case 3:
                break;
            case 4:
                break;
            default:

        }
    }
}
