package compositions;

public class Armour {

    //possible extension damage resistance?

    protected String name;
    protected int defensiveValue;
    //possible extension damage type

    public Armour(String name, int defensiveValue) {
        this.name = name;
        this.defensiveValue = defensiveValue;
    }

    public String getName() {
        return this.name;
    }

    public int getDefensiveValue() {
        return this.defensiveValue;
    }

}
