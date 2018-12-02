package parents;

import compositions.PowerType;

public abstract class Person {
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
}
