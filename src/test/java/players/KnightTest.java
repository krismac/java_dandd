package players;

import compositions.PowerType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Pig Perciville");
    }

    @Test
    public void hasArmour(){
        assertEquals(8, knight.getArmour());
    }

    @Test //agility
    public void hasPower(){
        assertEquals(PowerType.DEFEND, knight.getPower());
    }

    @Test
    public void hasHealth(){
        assertEquals(12, knight.getHealth());
    }

    @Test
    public void hasToken(){
        assertEquals(0, knight.getBackpack().size());
    }

    @Test
    public void hasName(){
        assertEquals("Pig Perciville", knight.getName());
    }

}
