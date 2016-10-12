package christopher.nobles.casino;

/**
 * Created by christophernobles on 10/12/16.
 */
public class Player {
    double balance;
    String name;
    Card hand; //TODO ask about this!

    Player(String startName, double startBalance){
        this.balance = startBalance;
        this.name = startName;
    }

    public double getBalance() {
        return balance;
    }

    public double setBalance(double balance) {
        this.balance = balance;
        return this.balance;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return this.name;
    }

}
