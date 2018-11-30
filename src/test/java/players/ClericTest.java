package players;

import compositions.PowerType;
import compositions.Weapon;
import compositions.Armour;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Weapon weapon;
    Armour armour;

    @Before
    public void before(){
        armour = new Armour("armour", 4);
        weapon = new Weapon("Mace", 6);
        cleric = new Cleric("Cedric", weapon, armour);

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
    public void weaponHasName() {assertEquals("Mace", cleric.getWeaponName());}

    @Test
    public void weaponHasDamage() {assertEquals(6, cleric.getWeaponDamage());}

    @Test
    public void hasName(){
        assertEquals("Cedric", cleric.getName());
    }

    @Test
    public void hasArmourName(){
        assertEquals(armour, cleric.getArmourName());
    }

    @Test
    public void hasArmourDamage(){
        assertEquals(4, cleric.getArmourDamage());
    }
}
