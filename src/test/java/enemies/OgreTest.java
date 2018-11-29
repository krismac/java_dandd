package enemies;

import compositions.PowerType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {

    Ogre ogre;


    @Before
    public void before(){
        ogre = new Ogre("Kraz");
    }

    @Test
    public void hasName () {
        assertEquals("Kraz", ogre.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(14, ogre.getHealth());
    }

    @Test   //armour - 8
    public void hasArmour(){
        assertEquals(8, ogre.getArmour());
    }

    @Test //power - spell resistance
    public void hasPower(){
        assertEquals(PowerType.SPELLRESISTANCE, ogre.getPower());
    }

}