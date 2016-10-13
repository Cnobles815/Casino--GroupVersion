package christopher.nobles.casino;
import java.util.Date;

public class Display {
    static Date date = new Date();

    static public void renderWelcome(){
        print("        \nWelcome to to Nobles Casino! \nYou're here because you don't like your money very much. \nFortunately for you, Nobles Casino is ready and willing to take it from you!");
    }

    static public void renderMainMenu(){
        print("     \n|     [[MAIN MENU]]" +
                " \n| [1] - Create Account" +
                " \n| [2] - Existing Player" +
                " \n| [3] - Games Menu" +
                " \n| [4] - Account Options" +
                " \n| [5] - Exit(No Refunds)");
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
    
    static public void renderSlotsWelcome(){
        print("Is it random? Is it rigged? You don't care. Pull the lever.");
    }

    static public String print(String output) {
        System.out.println(output);
        return output;
    }

    static public double printDbl(double output) {
        System.out.println(output);
        return output;
    }

    static public void clearScreen(){
        System.out.flush();
    }

    public static void renderGamesMenu(){
        timeStamp();
        print("\nWe have quite a few ways for you to lose money here. Pick one." +
                " \n|     [[GAMES MENU]]" +
                " \n| [1] - Slots(Basic)" +
                " \n| [2] - Blackjack" +
                " \n| [3] - Crazy8" +
                " \n| [4] - Return to Main Menu");
    }

    public void triedToGoToGamesMenuWithNoAccount(){
            print("Now you know you don't have an account big fella." +
                "\nNobody calls you X big fella." +
                "\nThe streets don't call you anything but late big fella." +
                "\nMake an account! Make an account.");
    }

    public void accountCreation(){
        print("You might as well say your name is 'Charity'." +
                "\nAnd how much do you want in your wallet to start?" +
                "\nDon't try and tell me you're gonna drop over a grand in here." +
                "\nDon't do that big fella. Don't get me started on you big fella." +
                "\n            [[ENTER NAME/STARTING BALANCE]]");
    }

    public static void bringItDown(){
        print("Woah there big fella." +
                "\nYou know you can't afford that much big fella." +
                "\nBring it down under 1k big fella." +
                "\nYou know you borrowed that money big fella." +
                "\nYou know that wallet is a rental big fella." +
                "\nYou ain't pay Tommy back yet big fella." +
                "\nBring it down. I said bring it down big fella!");
    }

    public static void existingAccount(){
        print("YOU ALREADY HAVE AN ACCOUNT BIG FELLA." +
                "\nWe got your name big fella don't try this." +
                "\nDon't try this. Just go home big fella." +
                "\nYou don't need two accounts big fella." +
                "\nYou don't even have a savings account fella.");
    }

    public static void noMoMoney(){
        print("YOU RAN OUT OF MONEY! GET OUT!");
    }
}
