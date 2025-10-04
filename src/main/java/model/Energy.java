package model;

public class Energy extends Item {
    private int rechargeEnergyQuantity;

    // Constructor
    public Energy(int coordX, int coordY, int quantity, int maxQuantity, int rechargeEnergyQuantity) {
        super(coordX, coordY, quantity, maxQuantity);
        this.rechargeEnergyQuantity = rechargeEnergyQuantity;
    }

    public int getRechargeEnergyQuantity() {
        return rechargeEnergyQuantity;
    }

    public void setRechargeEnergyQuantity(int rechargeEnergyQuantity) {
        this.rechargeEnergyQuantity = rechargeEnergyQuantity;
    }
}
