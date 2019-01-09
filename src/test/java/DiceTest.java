import org.junit.Before;
import org.junit.Test;
import parents.Dice;

import static org.junit.Assert.assertEquals;

public class DiceTest {

    Dice dice;

    @Before
    public void before() {
        dice = new Dice();
    }

//    @Test
//    public void testRNG() {
//        assertEquals(2, dice.rollD4());
//    }

}

