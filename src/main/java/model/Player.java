package model;

public class Player {
    private String name;
    private int health;
    private int coordX;
    private int coordY;
    private Inventory inventory;

    // Constructor
    public Player(String name, int health, int coordX, int coordY, Inventory inventory) {
        this.name = name;
        this.health = health;
        this.coordX = coordX;
        this.coordY = coordY;
        this.inventory = inventory;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    // Actions
    public void move() {
        // to be implemented
    }

    public boolean shoot(Objective objective) {
        // to be implemented
        return false;
    }

    public void takeDamage() {
        // to be implemented
    }

    public boolean isAlive() {
        // to be implemented
        return false;
    }

    public void changeWeapon() {
        // to be implemented
    }

    public void useItem(Item item) {
        // to be implemented
    }
}
