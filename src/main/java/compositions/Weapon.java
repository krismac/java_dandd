package compositions;

public class Weapon {
    protected String name;
    protected int attackValue;
    //possible extension damage type

    public Weapon(String name, int attackValue) {
        this.name = name;
        this.attackValue = attackValue;
    }

    public String getName() {
        return this.name;
    }

    public int getAttackValue() {
        return this.attackValue;
    }

}
