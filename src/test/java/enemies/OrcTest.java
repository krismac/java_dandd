package enemies;

import compositions.Armour;
import compositions.PowerType;
import compositions.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;
    Weapon weapon;
    Armour armour;

    @Before
    public void before(){
        weapon = new Weapon("Battleaxe", 6);
        armour = new Armour("Hide", 6);
        orc = new Orc("Balbour", armour, weapon);

    }

    @Test
    public void hasName() {
        assertEquals("Balbour", orc.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(12, orc.getHealth());
    }

    @Test //agility
    public void hasPower(){
        assertEquals(PowerType.AGILITY, orc.getPower());
    }

    @Test   //armour - 8
    public void hasArmourName(){
        assertEquals("Hide", orc.getArmourName());
    }

    @Test
    public void hasArmourValue() {
        assertEquals(6, orc.getArmourValue());
    }

    @Test
    public void hasWeaponName() {
        assertEquals("Battleaxe", orc.getWeaponName());
    }

    @Test
    public void hasWeaponValue() {
        assertEquals(6, orc.getWeaponValue());
    }

}
