package model;

public class Weapon {
    private int damage;
    private int bullets;
    private int reloadTime;
    private int timeBetweenShot;

    // Constructor
    public Weapon(int damage, int bullets, int reloadTime, int timeBetweenShot) {
        this.damage = damage;
        this.bullets = bullets;
        this.reloadTime = reloadTime;
        this.timeBetweenShot = timeBetweenShot;
    }

    // Getters and Setters
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getBullets() {
        return bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    public int getReloadTime() {
        return reloadTime;
    }

    public void setReloadTime(int reloadTime) {
        this.reloadTime = reloadTime;
    }

    public int getTimeBetweenShot() {
        return timeBetweenShot;
    }

    public void setTimeBetweenShot(int timeBetweenShot) {
        this.timeBetweenShot = timeBetweenShot;
    }
}
