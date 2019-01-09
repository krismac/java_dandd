package players;

import compositions.PowerType;
import compositions.Weapon;
import compositions.Armour;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Weapon weapon;
    Armour armour;

    @Before
    public void before(){
        weapon = new Weapon("Axe", 8);
        armour = new Armour("armour", 4);
        dwarf = new Dwarf("Massive", weapon, armour);
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

    @Test
    public void hasWeapon() {assertEquals(weapon, dwarf.getWeapon());}

    @Test
    public void weaponHasName() {assertEquals("Axe", dwarf.getWeaponName());}

    @Test
    public void weaponHasDamage() {assertEquals(8, dwarf.getWeaponDamage());}

    @Test
    public void hasArmourName(){
        assertEquals("armour", dwarf.getArmourName());
    }

    @Test
    public void hasArmourDamage(){
        assertEquals(4, dwarf.getArmourDamage());
    }
}
