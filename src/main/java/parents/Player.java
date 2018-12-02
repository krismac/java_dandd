package parents;

import compositions.PowerType;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Player extends Person {
    //instance

    protected ArrayList<Tokens> backpack;

    //constructor
    public Player(String name) {
        super(name);
    }

    //method

    public ArrayList<Tokens> getBackpack() {
        return this.backpack;
    }

    //take damage
}
