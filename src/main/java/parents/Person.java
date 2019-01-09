package parents;

import behaviours.IFight;
import compositions.PowerType;

public abstract class Person implements IFight {
    //instance
    protected int health;
    protected String name;
    protected PowerType power;

    //constructor
    public Person (String name) {
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public String getName() {
        return this.name;
    }

    public PowerType getPower() {
        return this.power;
    }

    public void reduceHealth(int damage) {
        this.health -= damage;
    }

}
