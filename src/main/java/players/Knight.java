package players;

import compositions.PowerType;
import parents.Physical;
import parents.Player;

import java.util.ArrayList;

public class Knight extends Physical {
    //instance


    //constructor
    public Knight(String name) {
        super(name);
        this.weapon = 10;
        this.armour = 8;
        this.health = 12;
        this.backpack = new ArrayList<>();
        this.power = PowerType.DEFEND;
    }

    //method


}
