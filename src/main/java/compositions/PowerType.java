package compositions;

public enum PowerType {

    DEFEND(0.6), //to incoming attack
    AGILITY(0.8), //to incoming attack
    SAVAGEATTACK(1.4), //to his attack
    DULLWEAPON(0.8), //to his attack
    DEFENSIVESPELL(0.8), //to incoming attack
    POWERFULSPELL(1.4), //to spell cast
    TOUGHSKIN(0.5), //to incoming attack
    SPELLRESISTANCE(0.8); //to incoming spell


    private final double powerModifier;

    PowerType(double powerModifier) {
        this.powerModifier = powerModifier;
    }

    public double getPowerModifier(){
        return this.powerModifier;
    }


}
