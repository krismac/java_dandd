package players;

import compositions.FamiliarType;
import compositions.PowerType;
import parents.Magical;

import java.util.ArrayList;

public class Wizard extends Magical {


    //constructor

    public Wizard (String name, FamiliarType familiar) {
        super(name, familiar);
        this.health = 6;
        this.spells = new ArrayList<>();
        this.backpack = new ArrayList<>();
        this.power = PowerType.DEFENSIVESPELL;
    }

    //method
    //defensive spell (like shield) multiplier in PowerType

    public void reduceHealth(int damage) {
        this.health -= (damage * this.power.getPowerModifier());
    }


}
