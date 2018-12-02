package enemies;

import compositions.Armour;
import compositions.PowerType;
import compositions.Weapon;
import parents.Enemy;

public class Orc extends Enemy {
    protected Weapon weapon;
    protected Armour armour;

    //constructor
    public Orc(String name, Armour armour, Weapon weapon) {
        super(name);
        this.armour = armour;
        this.weapon = weapon;
        this.health = 12;
        this.power = PowerType.AGILITY;
    }

    public Armour getArmour() {
        return this.armour;
    }

    public String getArmourName() {
        return this.armour.getName();
    }

    public int getArmourValue() {
        return this.armour.getDefensiveValue();
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public String getWeaponName () {
        return this.weapon.getName();
    }

    public int getWeaponValue() {
        return this.weapon.getAttackValue();
    }







}
