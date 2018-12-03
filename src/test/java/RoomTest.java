import compositions.Treasure;
import enemies.Dragon;
import org.junit.Before;
import org.junit.Test;
import parents.Enemy;
import parents.Equipment;
import parents.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Equipment treasure;
    Enemy enemy;

    @Before
    public void before(){
        treasure = new Treasure("Gem", 50);
        enemy = new Dragon("Percival");
        room = new Room(treasure, enemy);
    }

    @Test
    public void treasureHasName(){
        assertEquals("Gem", room.getTreasureName());
    }

    @Test
    public void treasureHasValue() {
        assertEquals(50, room.getTreasureValue());
    }

    @Test
    public void enemyHasName() {
        assertEquals("Percival", room.getEnemyName());
    }

    @Test
    public void enemyHasHealth(){
        assertEquals(20, room.getEnemyHealth());
    }
}
