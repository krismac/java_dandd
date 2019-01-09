package parents;

import compositions.Armour;
import compositions.Weapon;

public abstract class Physical extends Player {
    //instance
    protected Armour armour;
    protected Weapon weapon;


//constructor
    public Physical(String name, Weapon weapon, Armour armour) {
        super(name);
        this.weapon = weapon;
        this.armour = armour;
    }

    //method

    public Weapon getWeapon() {
        return this.weapon;
    }

    public String getWeaponName(){
        return this.weapon.getName();
    }

    public int getWeaponDamage() {
        return this.weapon.getValue();
    }

    public String getArmourName() {
        return this.armour.getName();
    }

    public int getArmourDamage() {
        return this.armour.getValue();
    }

    public void fight(Person person){
        person.reduceHealth(this.getWeaponDamage());
    }
}
