package players;

import compositions.FamiliarType;
import compositions.PowerType;
import compositions.Spell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

   Warlock warlock;
   Spell spell;


    @Before
    public void before(){
        warlock = new Warlock("Winston", FamiliarType.CEREBERUS);
        spell = new Spell("Fireball", 5);
    }

    @Test //agility
    public void hasPower(){
        assertEquals(PowerType.POWERFULSPELL, warlock.getPower());
    }

    @Test
    public void hasHealth(){
        assertEquals(8, warlock.getHealth());
    }

    @Test
    public void hasToken(){
        assertEquals(0, warlock.getBackpack().size());
    }

    @Test
    public void hasName(){
        assertEquals("Winston", warlock.getName());
    }

    @Test
    public void hasFamiliar() {assertEquals(FamiliarType.CEREBERUS, warlock.getFamiliar());}

    @Test
    public void hasSpellsList() {assertEquals(0, warlock.getSpellList().size());}

    @Test
    public void canAddSpellToSpellList()
    {
        warlock.addSpellToSpellList(spell);
        assertEquals(1, warlock.getSpellList().size());}

}
