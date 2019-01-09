package players;

import compositions.HealingTool;
import compositions.PowerType;
import compositions.Weapon;
import compositions.Armour;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Weapon weapon;
    Armour armour;
    HealingTool potion;
    HealingTool herb;

    @Before
    public void before(){
        armour = new Armour("armour", 4);
        weapon = new Weapon("Mace", 6);
        potion = new HealingTool("potion", 4);
        herb = new HealingTool("herb", 2);
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
        assertEquals("armour", cleric.getArmourName());
    }

    @Test
    public void hasArmourDamage(){
        assertEquals(4, cleric.getArmourDamage());
    }

    @Test
    public void hasHealingTools() {
        assertEquals(0, cleric.getHealingTools().size());
    }

    @Test
    public void canAddHealingTools() {
        cleric.addHealingTools(potion);
        assertEquals(1, cleric.getHealingTools().size());
    }

    @Test
    public void canRemoveHealingTools() {
        cleric.addHealingTools(potion);
        cleric.addHealingTools(herb);
        cleric.removeHealingTool(herb);
        assertEquals(1, cleric.getHealingTools().size());
    }

    @Test
    public void canHeal() {
        cleric.addHealingTools(potion);
        cleric.addHealingTools(herb);
        cleric.reduceHealth(8);
        cleric.heal(cleric, potion);
        assertEquals(8, cleric.getHealth());
        assertEquals(1, cleric.getHealingTools().size());
    }
}
