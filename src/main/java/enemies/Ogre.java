package enemies;

import compositions.Armour;
import compositions.PowerType;
import compositions.Weapon;
import parents.Enemy;

public class Ogre extends Enemy {
    protected Armour armour;
    protected Weapon weapon;


    //constructor
    public Ogre(String name, Armour armour, Weapon weapon) {
        super(name);
        this.armour = armour;
        this.weapon = weapon;
        this.health = 14;
        this.power = PowerType.SPELLRESISTANCE;
    }

    

    //method
        //divide divide by 3

}

//method

