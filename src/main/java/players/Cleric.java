package players;

import compositions.HealingTools;
import compositions.PowerType;
import parents.Physical;

import java.util.ArrayList;

public class Cleric extends Physical {
    //instance
    ArrayList<HealingTools> healingTools;

    //constructor
    public Cleric(String name) {
        super(name);
        this.weapon = 8;
        this.armour = 5;
        this.health = 12;
        this.backpack = new ArrayList<>();
        this.healingTools = new ArrayList<>();
        this.power = PowerType.DULLWEAPON;
    }
    //method
       // healing power

    public ArrayList getHealingTools () {
        return this.healingTools;
    }

}
