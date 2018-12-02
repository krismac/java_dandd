package enemies;

import behaviours.IFight;
import compositions.PowerType;
import parents.Enemy;
import parents.Person;

public class Dragon extends Enemy {
    private int breathCharges;
    private boolean breathLastTurn;

    //constructor
    public Dragon(String name) {
        super(name);
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

    public void fight(Person person) {
        if (this.breathCharges > 1 && !this.breathLastTurn) {
            this.breatheFire();
            this.breathCharges -= 1;
            this.breathLastTurn = true;
            person.reduceHealth(12);
        }
        this.bite();
        person.reduceHealth(5);
        this.breathLastTurn = false;
    }

}
