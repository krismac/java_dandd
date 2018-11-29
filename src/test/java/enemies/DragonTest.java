package enemies;

import compositions.PowerType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon("Sylvan");
    }

    @Test
    public void hasName() {
        assertEquals("Sylvan", dragon.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(20, dragon.getHealth());
    }

    @Test   //armour - 0
    public void hasArmour(){
        assertEquals(0, dragon.getArmour());
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

}
