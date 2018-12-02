package parents;

import java.util.Random;

public class Dice {


    public Dice() {

    }

    public int rollD4() {
        Random d4 = new Random();
        int roll = d4.nextInt(4) + 1;
        return roll;
    }


    public int rollD6(){
        Random d6 = new Random();
        int roll = d6.nextInt(6) + 1;
        return roll;
    }

    public int rollD8(){
        Random d8 = new Random();
        int roll = d8.nextInt(8) + 1;
        return roll;
    }

    public int rollD10(){
        Random d10 = new Random();
        int roll = d10.nextInt(10) + 1;
        return roll;
    }

    public int rollD12(){
        Random d12 = new Random();
        int roll = d12.nextInt(12) + 1;
        return roll;
    }
}
