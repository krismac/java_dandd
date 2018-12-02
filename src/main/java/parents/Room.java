package parents;

import compositions.Treasure;

public class Room {
    protected Treasure treasure;
    protected Enemy enemy;


    //constructor
    public Room(Treasure treasure, Enemy enemy) {
        this.treasure = treasure;
        this.enemy = enemy;
    }

    //method
        //fight enemy
             //win = treasure
            //lose = health loss
}
