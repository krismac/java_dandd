package enemies;

import compositions.Armour;
import compositions.PowerType;
import compositions.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {

    Ogre ogre;
    Weapon weapon;
    Armour armour;


    @Before
    public void before(){
        weapon = new Weapon("Club", 10);
        armour = new Armour("Plate", 8);
        ogre = new Ogre("Kraz", armour, weapon);
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
    public void hasArmourName(){
        assertEquals("Plate", ogre.getArmourName());
    }

    @Test
    public void hasArmourValue() {
        assertEquals(8, ogre.getArmourValue());
    }

    @Test
    public void hasWeaponName() {
        assertEquals("Club", ogre.getWeaponName());
    }

    @Test
    public void hasWeaponValue() {
        assertEquals(10, ogre.getWeaponValue());
    }

    @Test //power - spell resistance
    public void hasPower(){
        assertEquals(PowerType.SPELLRESISTANCE, ogre.getPower());
    }

}