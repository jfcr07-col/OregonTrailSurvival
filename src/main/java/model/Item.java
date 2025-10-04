package model;

public class Item {
    private int coordX;
    private int coordY;
    private int quantity;
    private int maxQuantity;

    // Constructor
    public Item(int coordX, int coordY, int quantity, int maxQuantity) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.quantity = quantity;
        this.maxQuantity = maxQuantity;
    }

    // Getters and setters
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    // Basic actions
    public void removeItem() {
        // to be implemented
    }
}
