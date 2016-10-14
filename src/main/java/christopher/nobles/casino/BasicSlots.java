package christopher.nobles.casino;

public class BasicSlots extends SlotsGame {
    private int left = 0;
    private int center = 0;
    private int right = 0;
    private int choice = 0;

    @Override
    public void runGame(){
        Display.printLn("Welcome to the slot machine. \nOut of all of the ways to give away your money... \nThis is the least interesting. Pulling the lever.");
        pull();
    }

    public String pull(){
        PlayerCollection.playerList.get(0).changeBalance(-5);
        belowPlayerBalance();
          setLeft(getColumn1());
          setCenter(getColumn2());
          setRight(getColumn3());
        Display.timeStamp();
        Display.printLn("\n\n" + left + "||" + center + "||" + right);
        compare(left, center, right);
        return left + " " + center + " " + right;
    }

    public void compare(int left, int center, int right){
        CasinoEngine casinoEngine = new CasinoEngine();
        if (left == right && right == center){
            Display.printLn("Cha-ching!");
            PlayerCollection.playerList.get(0).changeBalance(10);
            pull();}
            else {Display.printLn("You suck.");
                Display.printDbl(PlayerCollection.playerList.get(0).getBalance());
                Display.printLn("Give us more money?");
                Display.printLn("| [1] - Yes\n| [2] - No");
                choice = UserInput.getUserInputInt();
                    if (choice == 1){
                        belowPlayerBalance();
                        pull();
                    }
                    else if (choice == 2) {
                        Display.clearScreen();
                        casinoEngine.recursiveMenu();
                    }
            }
    }


    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getCenter() {
        return center;
    }

    public void setCenter(int center) {
        this.center = center;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

}
