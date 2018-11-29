package enemies;

import compositions.PowerType;
import parents.Enemy;

public class Dragon extends Enemy {
    private int breathCharges;
    private boolean breathLastTurn;

    //constructor
    public Dragon(String name) {
        super(name);
        this.armour = 0;
        this.health = 20;
        this.power = PowerType.TOUGHSKIN;
        this.breathCharges = 2;
        this.breathLastTurn = false;
    }

    //method

    //fight method will use IFight and take in breath charges and breath last turn to decide which attack it will do.

    public String breatheFire() {
        //add takeDamage function once written.
        return "You've been burnt! Lose 12 health points!";
    }

    public String bite() {
        //add takeDamage function once written.
        return "Teeth pierce your skin! Lose 5 health points";
    }

}
