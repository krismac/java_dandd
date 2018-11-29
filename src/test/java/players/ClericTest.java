package players;

import compositions.PowerType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;


    @Before
    public void before(){
        cleric = new Cleric("Cedric");
    }

    @Test
    public void hasArmour(){
        assertEquals(5, cleric.getArmour());
    }

    @Test //agility
    public void hasPower(){
        assertEquals(PowerType.DULLWEAPON, cleric.getPower());
    }

    @Test
    public void hasHealth(){
        assertEquals(12, cleric.getHealth());
    }

    @Test
    public void hasToken(){ assertEquals(0, cleric.getBackpack().size());
    }

    @Test
    public void hasName(){
        assertEquals("Cedric", cleric.getName());
    }
}
