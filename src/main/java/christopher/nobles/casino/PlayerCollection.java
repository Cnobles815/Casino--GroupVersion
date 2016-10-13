package christopher.nobles.casino;

import java.util.ArrayList;

public class PlayerCollection {
    public static ArrayList<Player> playerList = new ArrayList<Player>();

    static void addPlayer(Player player){
        playerList.add(player);
    }
}
