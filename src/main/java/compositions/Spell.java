package compositions;

public class Spell
{
    protected String name;
    protected int attackValue;
    //possible extension damage type

    public Spell(String name, int attackValue) {
        this.name = name;
        this.attackValue = attackValue;
    }

    public String getName() {
        return this.name;
    }

    public int getAttackValue() {
        return this.attackValue;
    }

    //possible extension damage type?
}
