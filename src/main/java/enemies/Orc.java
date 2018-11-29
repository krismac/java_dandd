package enemies;

import compositions.PowerType;
import parents.Enemy;

public class Orc extends Enemy {




    //constructor
    public Orc(String name) {
        super(name);
        this.armour = 5;
        this.health = 12;
        this.power = PowerType.AGILITY;
    }


    //method



}
