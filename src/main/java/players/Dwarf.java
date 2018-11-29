package players;

import compositions.PowerType;
import parents.Physical;

import java.util.ArrayList;

public class Dwarf extends Physical {
    //instance


    //constructor
    public Dwarf(String name) {
        super(name);
        this.weapon = 10;
        this.armour = 5;
        this.health = 12;
        this.backpack = new ArrayList<>();
        this.power = PowerType.AGILITY;
    }
    //method


}
