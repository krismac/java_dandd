package players;

import compositions.PowerType;
import compositions.Weapon;
import compositions.Armour;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Weapon weapon;
    Armour armour;

    @Before
    public void before(){
        weapon = new Weapon("Longsword", 10);
        armour = new Armour("armour", 4);
        knight = new Knight("Pig Perciville", weapon, armour);
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

    @Test
    public void weaponHasName() {assertEquals("Longsword", knight.getWeaponName());}

    @Test
    public void weaponHasDamage() {assertEquals(10, knight.getWeaponDamage());}

    @Test
    public void hasArmourName(){
        assertEquals(armour, knight.getArmourName());
    }

    @Test
    public void hasArmourDamage(){
        assertEquals(4, knight.getArmourDamage());
    }

}
