package christopher.nobles.casino;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by christophernobles on 10/12/16.
 */
public class PlayerTEST {
    static final double DELTA_TOLERANCE = .0001;

    @Test
    public void getPlayerBalanceTEST(){
        Player player = new Player("Anna", 2.5);
        double expected = 2.5;
        double actual = player.getBalance();
        assertEquals("The value should be 2.5", expected, actual, DELTA_TOLERANCE);
    }

    @Test
    public void getPlayerNameTEST(){
        Player player = new Player("Bell", 2.5);
        String expected = "Bell";
        String actual = player.getName();
        assertEquals("The name should be Bell", expected, actual);
    }

    @Test
    public void setPlayerNameTEST(){
        Player player = new Player("Cait" , 2.5);
        String expected = "Catherine";
        String actual = player.setName("Catherine");
        assertEquals("The name should be Catherine", expected, actual);
    }

    @Test
    public void setPlayerBalanceTEST(){
        Player player = new Player("Dani", 2.5);
        double expected = 3.5;
        double actual = player.setBalance(3.5);
        assertEquals("The value should be 3.5", expected, actual, DELTA_TOLERANCE);
    }
}
