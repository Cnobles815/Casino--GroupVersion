package christopher.nobles.casino;

public class Player {
    double balance;
    String name;

    Card hand; //TODO ask about this!
    CasinoEngine casinoEngine = new CasinoEngine();

    Player(String startName, double startBalance) {
        if (PlayerCollection.playerList.size() == 0) {
            if (startBalance > 1000) {
                Display.bringItDown();
                casinoEngine.startCasino();
            }
            if (startBalance <= 1000) {
                this.balance = startBalance;
                this.name = startName;
            }
        }
            if (PlayerCollection.playerList.size() > 0)  {
                Display.existingAccount();
            }
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
