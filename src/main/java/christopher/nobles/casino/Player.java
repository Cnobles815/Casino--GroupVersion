package christopher.nobles.casino;

/**
 * Created by christophernobles on 10/12/16.
 */
public class Player {
    double balance;
    String name;
    Card hand; //TODO ask about this!
    CasinoEngine casinoEngine = new CasinoEngine();


    Player(String startName, double startBalance){
        if (startBalance > 1000){
            Display.print("Woah there big fella." +
                    "\nYou know you can't afford that much big fella." +
                    "\nBring it down under 1k big fella." +
                    "\nYou know you borrowed that money big fella." +
                    "\nYou know that wallet is a rental big fella." +
                    "\nYou ain't pay Tommy back yet big fella." +
                    "\nBring it donw. I said bring it down big fella!");
            casinoEngine.startCasino();}
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

    public double changeBalance(double amount) {
        double newBalance = getBalance() + amount;
        setBalance(newBalance);

        return newBalance;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return this.name;
    }

}
