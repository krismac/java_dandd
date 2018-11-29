package players;

import compositions.PowerType;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Graham");
    }

    @Test
    public void hasArmour(){ assertEquals(4, barbarian.getArmour());
    }

    @Test //agility
    public void hasPower(){
        assertEquals(PowerType.SAVAGEATTACK, barbarian.getPower());
    }

    @Test
    public void hasHealth(){
        assertEquals(14, barbarian.getHealth());
    }

    @Test
    public void hasToken(){
        assertEquals(0, barbarian.getBackpack().size());
    }

    @Test
    public void hasWeapon(){
        assertEquals(8, barbarian.getWeapon());
    }

    @Test
    public void hasName(){
        assertEquals("Graham", barbarian.getName());
    }

}
