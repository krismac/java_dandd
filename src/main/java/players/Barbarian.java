package players;

import compositions.PowerType;
import compositions.Armour;
import compositions.Weapon;
import parents.Physical;

import java.util.ArrayList;

public class Barbarian extends Physical {

    //instance


    //constructor
    public Barbarian(String name, Weapon weapon, Armour armour){
         super(name, weapon, armour);
         this.health = 14;
         this.backpack = new ArrayList<>();
         this.power = PowerType.SAVAGEATTACK;
     }

    //method


}
