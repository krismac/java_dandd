package parents;

import compositions.Treasure;

public class Room {
    protected Equipment treasure;
    protected Enemy enemy;


    //constructor
    public Room(Equipment treasure, Enemy enemy) {
        this.treasure = treasure;
        this.enemy = enemy;
    }

    public Equipment getTreasure() {
       return this.treasure;
    }

    public String getTreasureName() {
        return this.treasure.getName();
    }

    public int getTreasureValue() {
        return this.treasure.getValue();
    }

    public Enemy getEnemy() {
        return this.enemy;
    }

    public String getEnemyName() {
        return this.enemy.getName();
    }

    public int getEnemyHealth(){
        return this.enemy.getHealth();
    }

    public int fight(Player player, Enemy enemy){
        
    }



    //method
        //fight enemy
             //win = treasure
            //lose = health loss
}
