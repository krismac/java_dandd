package players;

import compositions.PowerType;
import compositions.Weapon;
import parents.Physical;
import compositions.Armour;
import parents.Player;

import java.util.ArrayList;

public class Knight extends Physical {
    //instance


    //constructor
    public Knight(String name, Weapon weapon, Armour armour) {
        super(name, weapon, armour);
        this.health = 12;
        this.backpack = new ArrayList<>();
        this.power = PowerType.DEFEND;
    }

    public void reduceHealth(int damage) {
        double newDamage = damage - this.power.getPowerModifier();
        this.health -= newDamage;
    }

    //method


}
