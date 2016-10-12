package christopher.nobles.casino;
import java.security.SecureRandom;

/**
 * Created by christophernobles on 10/12/16.
 */
public class BasicSlots extends SlotsGame {
    private int left = 0;
    private int center = 0;
    private int right = 0;
    private int choice = 0;


    @Override
    public void runGame(){
        Display.print("Welcome to the slot machine. \nOut of all of the ways to give away your money... \nThis is the least interesting. Pulling the lever.");
        pull();
    }

    public String pull(){
          setLeft(getColumn1());
          setCenter(getColumn2());
          setRight(getColumn3());
        Display.timeStamp();
        Display.print("\n\n" + left + "||" + center + "||" + right);
        compare(left, center, right);

        return left + " " + center + " " + right;
    }

    public void compare(int left, int center, int right){
        if (left == right && right == center){
            Display.print("Cha-ching!");
                    pull();}
            else {Display.print("You suck.");
            Display.print("Give us more money?");
            Display.print("| [1] - Yes\n| [2] - No");
            choice = UserInput.getUserInputInt();
            if (choice == 1){
                pull();}
                else CasinoEngine.exit();
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
