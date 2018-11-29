package parents;

import compositions.PowerType;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Player {
    //instance

    protected ArrayList<Tokens> backpack;
    protected String name;
    protected int health;
    protected PowerType power;


    //constructor
    public Player(String name) {
        this.name = name;
    }

    //method

    public int getHealth() {
        return this.health;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Tokens> getBackpack() {
        return this.backpack;
    }

    public PowerType getPower(){
        return this.power;
    }

    //take damage

}
