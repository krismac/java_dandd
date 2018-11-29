package enemies;

import compositions.PowerType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void before(){
        orc = new Orc("Balbour");

    }

    @Test
    public void hasName() {
        assertEquals("Balbour", orc.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(12, orc.getHealth());
    }

    @Test
    public void hasArmour(){
        assertEquals(5, orc.getArmour());
    }

    @Test //agility
    public void hasPower(){
        assertEquals(PowerType.AGILITY, orc.getPower());
    }

}
