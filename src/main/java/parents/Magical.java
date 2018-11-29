package parents;

import compositions.FamiliarType;
import compositions.Spell;

import java.util.ArrayList;

public class Magical extends Player {
    //instance
    protected FamiliarType familiar;
    protected ArrayList<Spell> spells;

    //constructor
    public Magical(String name, FamiliarType familiar) {
        super(name);
        this.familiar = familiar;
    }
        //health
        //arraylist<spell> type
        //familiar - enum
        //power - multiplier

    //method
    public FamiliarType getFamiliar(){
            return this.familiar;

}

}
