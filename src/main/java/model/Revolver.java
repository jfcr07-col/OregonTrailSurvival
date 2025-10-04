package model;

public class Revolver extends Weapon {

    // Constructor
    public Revolver(int damage, int bullets, int reloadTime, int timeBetweenShot) {
        super(damage, bullets, reloadTime, timeBetweenShot);
    }

    // Reload method
    public boolean reload(int bullets) {
        // to be implemented
        return false;
    }
}
