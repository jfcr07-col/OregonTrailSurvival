package model;

public class Enemy {

    private String name;
    private int health;
    private int damage;
    private int coordX;
    private int coordY;

    // Constructor
    public Enemy(String name, int health, int damage, int coordX, int coordY) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    // Getters and Setters
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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

    // Methods
    public void move() {
        // to be implemented
    }

    public void attackPlayer(int hits) {
        // to be implemented
    }

    public void receiveDamage(int hits) {
        // to be implemented
    }

    public boolean isAlive() {
        // to be implemented
        return false;
    }
}
