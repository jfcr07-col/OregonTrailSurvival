package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.Player;
import model.Inventory;
import model.Medicine;

public class PlayerTest {

    private Player player;
    private Inventory inventory;

    @Before
    public void setupStage1() {
        // Setup1: Player with full health
        inventory = new Inventory(5, null);
        player = new Player("Daniel", 3, 0, 0, inventory);
    }

    @Before
    public void setupStage2() {
        // Setup2: Player with medicine in inventory
        inventory = new Inventory(5, null);
        inventory.addItem(new Medicine(0, 0, 1, 5, 3));
        player = new Player("Daniel", 3, 0, 0, inventory);
    }

    @Test
    public void positivesIsAliveTest() {
        setupStage1();
        assertTrue(player.isAlive());
    }

    @Test
    public void negativesIsAliveTest() {
        setupStage1();
        player.setHealth(0);
        assertFalse(player.isAlive());
    }
}
