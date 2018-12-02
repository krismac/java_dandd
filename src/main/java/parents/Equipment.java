package parents;

public abstract class Equipment {
    protected String name;
    protected int value;
    //possible extension damage type

    public Equipment(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }

}
