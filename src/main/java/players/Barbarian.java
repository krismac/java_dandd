package players;

import compositions.PowerType;
import parents.Physical;

import java.util.ArrayList;

public class Barbarian extends Physical {

    //instance


    //constructor
    public Barbarian(String name){
         super(name);
         this.weapon = 8;
         this.armour = 4;
         this.health = 14;
         this.backpack = new ArrayList<>();
         this.power = PowerType.SAVAGEATTACK;
     }

    //method


}
