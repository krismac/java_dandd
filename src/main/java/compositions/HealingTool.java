package compositions;

public class HealingTool {

    protected String name;
    protected int healValue;

    public HealingTool(String name, int healValue) {
        this.name = name;
        this.healValue = healValue;
    }

    public String getName() {
        return this.name;
    }

    public int getHealValue() {
        return this.healValue;
    }

}
