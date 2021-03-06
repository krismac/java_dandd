package players;

import compositions.FamiliarType;
import compositions.PowerType;
import org.junit.Before;
import org.junit.Test;
import compositions.Spell;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Spell spell;

    @Before
    public void before(){
        wizard = new Wizard ("Larry", FamiliarType.LIZARD);
        spell = new Spell("Lightening bold", 8);
    }

    @Test //agility
    public void hasPower(){
        assertEquals(PowerType.DEFENSIVESPELL, wizard.getPower());
    }

    @Test
    public void hasHealth(){
        assertEquals(6, wizard.getHealth());
    }

    @Test
    public void hasToken(){
        assertEquals(0, wizard.getBackpack().size());
    }

    @Test
    public void hasName(){
        assertEquals("Larry", wizard.getName());
    }

    @Test
    public void hasFamiliar() {assertEquals(FamiliarType.LIZARD, wizard.getFamiliar());}

    @Test
    public void hasSpellsList() {assertEquals(0, wizard.getSpellList().size());}


    @Test
    public void canAddSpellToSpellList() {
        wizard.addSpellToSpellList(spell);
        assertEquals(1, wizard.getSpellList().size());}
}