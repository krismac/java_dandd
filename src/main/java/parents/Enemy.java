package parents;

import compositions.PowerType;

public abstract class Enemy {

    //instance
    protected int health;
    protected String name;
    protected PowerType power;

    //constructor
    public Enemy (String name) {
        this.name = name;
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
