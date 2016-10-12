package christopher.nobles.casino;

/**
 * Created by christophernobles on 10/12/16.
 */
public class BasicSlots extends SlotsGame {
    static int left = 0;
    static int center = 0;
    static int right = 0;

    @Override
    public void runGame(){
        Display.print("Welcome to the slot machine. \nOut of all of the ways to give away your money... \nThis is the least interesting. Pull the lever.");
        pull();
    }

    public String pull(){
         left = column1.nextInt(10);
         center = column2.nextInt(10);
         right = column3.nextInt(10);

        Display.print(left, center, right);

        return left + " " + center + " " + right;
    }

    public void compare(int left, int center, int right){
        if (left == right && right == center){
            Display.print("Cha-ching!");
                    pull();}
            else {Display.print("You suck.");
        }

    }
}
