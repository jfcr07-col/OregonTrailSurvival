package model;

import java.util.LinkedList;

public class Inventory {
    private int capacity;
    private LinkedList<Item> items;

    // Constructor
    public Inventory(int capacity, LinkedList<Item> items) {
        this.capacity = capacity;
        this.items = items;
    }

    // Getters and setters
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public LinkedList<Item> getItems() {
        return items;
    }

    public void setItems(LinkedList<Item> items) {
        this.items = items;
    }

    // Actions
    public void addItem(Item item) {
        // to be implemented
    }

    public void dropItem(Item item) {
        // to be implemented
    }

    public Item selectItem(Item item) {
        // to be implemented
        return null;
    }
}
