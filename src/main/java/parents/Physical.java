package parents;

public class Physical extends Player {
    //instance
    protected int armour;
    protected int weapon;

//constructor
    public Physical(String name) {
        super(name);
    }

    //method

    public int getWeapon() {
        return this.weapon;
    }

    public int getArmour() {
        return this.armour;
    }
}
