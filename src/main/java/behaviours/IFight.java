package behaviours;

import compositions.Spell;
import compositions.Weapon;

public interface IFight {

    //spell arraylist of spell classes

    //attack arraylist of weapon classes

    public int fight(Weapon weapon);

    public int fight(Spell spell);


}
