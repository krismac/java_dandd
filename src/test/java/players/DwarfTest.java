package players;

import compositions.PowerType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Massive");
    }

    @Test
    public void hasArmour(){
        assertEquals(5, dwarf.getArmour());
    }

    @Test //agility
    public void hasPower(){
        assertEquals(PowerType.AGILITY, dwarf.getPower());
    }

    @Test
    public void hasHealth(){
        assertEquals(12, dwarf.getHealth());
    }

    @Test
    public void hasToken(){ assertEquals(0, dwarf.getBackpack().size());
    }

    @Test
    public void hasName(){ assertEquals("Massive", dwarf.getName());
    }
}
