package parents;

import compositions.PowerType;

public abstract class Enemy extends Person {

    //instance


    //constructor
    public Enemy (String name) {
        super(name);
    }

    //methods

    public int getHealth() {
        return this.health;
    }

    public String getName() {
        return this.name;
    }

    public PowerType getPower() {
        return this.power;
    }


    //take damage(health, powertype, attack)
}
