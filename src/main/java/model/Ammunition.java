package model;

public class Ammunition extends Item {
    private BulletType bulletType;

    // Constructor
    public Ammunition(int coordX, int coordY, int quantity, int maxQuantity, BulletType bulletType) {
        super(coordX, coordY, quantity, maxQuantity);
        this.bulletType = bulletType;
    }

    public BulletType getBulletType() {
        return bulletType;
    }

    public void setBulletType(BulletType bulletType) {
        this.bulletType = bulletType;
    }
}
