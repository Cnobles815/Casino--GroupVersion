package christopher.nobles.casino;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserInputTEST {
    static final double DELTA_TOLERANCE = .0001;
    @Test
    public void getUserInputStrTEST(){
        UserInput userInput = new UserInput();
        String expected = "Test";
        String actual = userInput.getUserInputStr();
        assertEquals("The return should be Test", expected, actual);
    }

    @Test
    public void getUserInputIntTEST(){
        UserInput userInput = new UserInput();
        int expected = 5;
        int actual = userInput.getUserInputInt();
        assertEquals("The value should be 5", expected, actual);
    }

    @Test
    public void getUserInputDoubleTEST(){
        UserInput userInput = new UserInput();
        double expected = 2.5;
        double actual = userInput.getUserInputDbl();
        assertEquals("The value should be 2.5", expected, actual, DELTA_TOLERANCE);
    }
}
