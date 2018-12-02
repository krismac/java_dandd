package behaviours;

import compositions.PowerType;
import compositions.Spell;
import compositions.Weapon;
import parents.Enemy;
import parents.Player;

public interface IFight {

    //spell arraylist of spell classes

    //attack arraylist of weapon classes

    public int fight(Weapon weapon, PowerType powerType, Enemy enemy);

    public int fight(Spell spell, PowerType powerType, Enemy enemy);

    public int fight(Weapon weapon, PowerType powerType, Player player);

    public int fight(Spell spell, PowerType powerType, Player player);


}
