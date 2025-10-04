package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.Inventory;
import model.Item;
import java.util.LinkedList;

public class InventoryTest {

    private Inventory inventory;
    private Item item;

    @Before
    public void setupStage1() {
        // Setup1: Empty inventory
        inventory = new Inventory(5, new LinkedList<>());
    }

    @Before
    public void setupStage2() {
        // Setup2: Inventory with items
        LinkedList<Item> items = new LinkedList<>();
        items.add(new Item(0, 0, 1, 5));
        inventory = new Inventory(5, items);
    }

    @Test
    public void positiveDropItemTest() {
        setupStage2();
        inventory.dropItem(inventory.getItems().get(0));
        assertTrue(inventory.getItems().isEmpty());
    }

    @Test
    public void negativeDropItemTest() {
        setupStage1();
        inventory.dropItem(new Item(0, 0, 1, 5));
        assertTrue(inventory.getItems().isEmpty());
    }
}
