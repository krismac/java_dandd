package players;

import compositions.FamiliarType;
import compositions.PowerType;
import parents.Magical;

import java.util.ArrayList;

public class Warlock extends Magical {

    //constructor
    public Warlock(String name, FamiliarType familiar) {
        super(name, familiar);
        this.health = 8;
        this.spells = new ArrayList<>();
        this.backpack = new ArrayList<>();
        this.power = PowerType.POWERFULSPELL;
    }

    //method
        //offensive spell multiplier in PowerType


}
