package compositions;

public enum PowerType {

    DEFEND(4), //to incoming physical attack
    AGILITY(6), //to incoming attack
    SAVAGEATTACK(6), //to his attack
    DULLWEAPON(4), //to his attack
    DEFENSIVESPELL(4), //to incoming attack
    POWERFULSPELL(6), //to spell cast
    TOUGHSKIN(8), //to incoming attack
    SPELLRESISTANCE(4); //to incoming spell


    private final int powerModifier;

    PowerType(int powerModifier) {
        this.powerModifier = powerModifier;
    }

    public int getPowerModifier(){
        return this.powerModifier;
    }


}
