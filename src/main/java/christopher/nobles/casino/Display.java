package christopher.nobles.casino;
import java.util.ArrayList;
import java.util.Date;

import static java.lang.String.valueOf;

public class Display {
    static Date date = new Date();

    static void renderWelcome(){
        printLn("        \nWelcome to to Nobles Casino! \nYou're here because you don't like your money very much. \nFortunately for you, Nobles Casino is ready and willing to take it from you!");
    }

    static void renderMainMenu(){
        printLn("     \n|     [[MAIN MENU]]" +
                " \n| [1] - Create Account" +
                " \n| [2] - Existing Player" +
                " \n| [3] - Games Menu" +
                " \n| [4] - Account Options" +
                " \n| [5] - Exit(No Refunds)");
    }

    static public void dealerHand(ArrayList<Card> arrayList){
        printLn("Dealer's current card.");
        printLn(valueOf(arrayList.get(0)));
    }

    static void playerHand(ArrayList<Card> arrayList){
        printLn("Your current hand.");
        printLn(valueOf(arrayList));
    }

    static void timeStamp() {
        printLn(String.format((char)27 + "[34;1m%76s",date.toString()));
        printLn((char)27 + "[0m");
    }
    
    static void renderSlotsWelcome(){
        printLn("Is it random? Is it rigged? You don't care. Pull the lever.");
    }

    static String printLn(String output) {
        System.out.println(output);
        return output;
    }

    static String print(String output) {
        System.out.print(output);
        return output;
    }

    static double printDbl(double output) {
        System.out.println(output);
        return output;
    }

    static void clearScreen(){
        System.out.flush();
    }

    static void renderGamesMenu(){
        timeStamp();
        printLn("\nWe have quite a few ways for you to lose money here. Pick one." +
                " \n|     [[GAMES MENU]]" +
                " \n| [1] - Slots(Basic)" +
                " \n| [2] - Blackjack" +
                " \n| [3] - HighLow" +
                " \n| [4] - Return to Main Menu");
    }

    void renderNoAccountAlert(){
            printLn("Now you know you don't have an account big fella." +
                "\nNobody calls you X big fella." +
                "\nThe streets don't call you anything but late big fella." +
                "\nMake an account! Make an account.");
    }

    void renderAccountCreationPrompt(){
        printLn("You might as well say your name is 'Charity'." +
                "\nAnd how much do you want in your wallet to start?" +
                "\nDon't try and tell me you're gonna drop over a grand in here." +
                "\nDon't do that big fella. Don't get me started on you big fella." +
                "\n            [[ENTER NAME/STARTING BALANCE]]");
    }

    static void renderBringItDownAlert(){
        printLn("Woah there big fella." +
                "\nYou know you can't afford that much big fella." +
                "\nBring it down under 1k big fella." +
                "\nYou know you borrowed that money big fella." +
                "\nYou know that wallet is a rental big fella." +
                "\nYou ain't pay Tommy back yet big fella." +
                "\nBring it down. I said bring it down big fella!");
    }

    static void renderExistingAccountAlert(){
        printLn("YOU ALREADY HAVE AN ACCOUNT BIG FELLA." +
                "\nWe got your name big fella don't try this." +
                "\nDon't try this. Just go on home big fella." +
                "\nYou don't need two accounts big fella." +
                "\nYou don't even have a savings account fella.");
    }

    static void renderNoMoneyAlert(){
        printLn("YOU RAN OUT OF MONEY! GET OUT!");
    }

    static void renderBlackJackStart() {
        printLn("Take a seat at the table. Look closely at this table." +
                "\nVery soon, you won't be able to afford this table." +
                "\nPLACE YOUR BET!");
    }

    static void renderWagerPrompt(){
        printLn("How much are you willing to lose right now?" +
                "\nI'll let you choose this time.");
    }

    static void renderHighLowWelcome(){
        printLn("This game is simple." +
                "\nYou still won't win. So lets make this interesting somehow." +
                "\nThis time, you can decide how much you lose every time you give away money.");
    }

    static void renderHighLowBetPrompt(){
        printLn("How much are you willing to waste?");
    }

    static void highLowWin(){
        printLn("You guessed correctly." +
                "\nBut you still only guessed.");
    }

    static void playerBalance(){
        printLn(PlayerCollection.playerList.get(0).getName()+ ", " + "your current balance is: ");
        printDbl(PlayerCollection.playerList.get(0).getBalance());
    }

    static void highLowLoss(){
        printLn("Hah. You lost." +
                "\n HAH!");
    }

    static void singleNewLine(){
        printLn("\n");
    }

    static void doubleNewLine(){
        printLn("\n\n");
    }

    static void trippleNewLine(){
        printLn("\n\n\n");
    }

    static void renderPlayAgainPrompt(){
        printLn("Do you want to try again?" +
                "\n[1] - Play Again" +
                "\n[2] - Back to Main Menu");
    }

    static void debt(){
        printLn("NOW YOU'RE IN DEBT!" +
                "\nGET OUT!");
    }

    static void renderUnderConstructionAlert(){
        printLn("This game either is not finished or under construction." +
                "\nPlease choose a different way to give away your money.");
    }


}
