package players;

import compositions.PowerType;
import compositions.Weapon;
import parents.Physical;
import compositions.Armour;

import java.util.ArrayList;

public class Dwarf extends Physical {
    //instance


    //constructor
    public Dwarf(String name, Weapon weapon, Armour armour) {
        super(name, weapon, armour);
        this.health = 12;
        this.backpack = new ArrayList<>();
        this.power = PowerType.AGILITY;
    }
    //method

    public void reduceHealth(int damage) {
        this.health -= (damage * this.power.getPowerModifier());
    }


}
