package model;

public class Medicine extends Item {
    private int healingQuantity;

    // Constructor
    public Medicine(int coordX, int coordY, int quantity, int maxQuantity, int healingQuantity) {
        super(coordX, coordY, quantity, maxQuantity);
        this.healingQuantity = healingQuantity;
    }

    public int getHealingQuantity() {
        return healingQuantity;
    }

    public void setHealingQuantity(int healingQuantity) {
        this.healingQuantity = healingQuantity;
    }
}
