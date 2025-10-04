package model;

public class Rifle extends Weapon {

    // Constructor
    public Rifle(int damage, int bullets, int reloadTime, int timeBetweenShot) {
        super(damage, bullets, reloadTime, timeBetweenShot);
    }

    // Reload method
    public boolean reload(int bullets) {
        // to be implemented
        return false;
    }
}
