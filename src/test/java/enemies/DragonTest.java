package enemies;

import compositions.Armour;
import compositions.PowerType;
import compositions.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Dwarf;
import players.Knight;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;
    Dwarf dwarf;
    Weapon weapon;
    Armour armour;
    Knight knight;

    @Before
    public void before(){
        dragon = new Dragon("Sylvan");
        weapon = new Weapon("Axe", 8);
        armour = new Armour("armour", 4);
        dwarf = new Dwarf("Massive", weapon, armour);
        knight = new Knight("Barry", weapon, armour);
    }


    @Test
    public void hasName() {
        assertEquals("Sylvan", dragon.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(20, dragon.getHealth());
    }

    @Test //power - //tough skin 0.8
    public void hasPower(){
        assertEquals(PowerType.TOUGHSKIN, dragon.getPower());
    }

    @Test //breath fire  - 15 points damage

    public void canBreathFire(){
        assertEquals("You've been burnt! Lose 12 health points!", dragon.breatheFire());
    }

    @Test //bite - 5 points damage

    public void canBite(){
        assertEquals("Teeth pierce your skin! Lose 5 health points", dragon.bite());

    }
    @Test
    public void canFight() {
        dragon.fight(dwarf);
        assertEquals(1 ,dwarf.getHealth());
    }

    @Test
    public void fightMultipliersWork() {
    dragon.fight(knight);
    assertEquals(2, knight.getHealth());
}

}
