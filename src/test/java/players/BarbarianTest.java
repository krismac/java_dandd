package players;

import compositions.PowerType;
import compositions.Armour;
import compositions.Weapon;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Weapon weapon;
    Armour armour;

    @Before
    public void before(){
        weapon = new Weapon("Greatsword", 12);
        armour = new Armour("armour", 4);
        barbarian = new Barbarian("Graham", weapon, armour);
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
        assertEquals(weapon, barbarian.getWeapon());}

        @Test
        public void weaponHasName() {assertEquals("Greatsword", barbarian.getWeaponName());}

        @Test
        public void weaponHasDamage() {assertEquals(12, barbarian.getWeaponDamage());}

    @Test
    public void hasName(){
        assertEquals("Graham", barbarian.getName());
    }

    @Test
    public void hasArmourName(){
        assertEquals(armour, barbarian.getArmourName());
    }

    @Test
    public void hasArmourDamage(){
        assertEquals(4, barbarian.getArmourDamage());
    }

}
