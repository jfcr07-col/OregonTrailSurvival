package model;

public class Objective {
    private int coordX;
    private int coordY;
    private int hits;

    // Constructor
    public Objective(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.hits = 0;
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

    // Check if the objective is valid
    public boolean validObjective() {
        // to be implemented
        return false;
    }

    // Number of hits
    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }
}
