package christopher.nobles.casino;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by christophernobles on 10/12/16.
 */
public class BasicSlotsTEST {

    @Test
    public void pullTEST(){
        BasicSlots basicSlots = new BasicSlots();
        String expected = "5 5 5";
        String actual = basicSlots.pull();
        assertEquals("The value should be 5 5 5", expected, actual);
    }
}
