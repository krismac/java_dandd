package behaviours;

import compositions.PowerType;
import compositions.Spell;
import compositions.Weapon;
import parents.Enemy;
import parents.Equipment;
import parents.Person;
import parents.Player;

public interface IFight {


    public void fight(Person person);
        //use this.weapon and this.power to manipulate each method.
}
