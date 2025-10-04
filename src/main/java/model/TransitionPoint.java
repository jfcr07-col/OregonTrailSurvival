package model;

public class TransitionPoint {
    private int coordX;
    private int coordY;
    private Scenario scenario;

    // Constructor
    public TransitionPoint(int coordX, int coordY, Scenario scenario) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.scenario = scenario;
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

    public Scenario getScenario() {
        return scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }
}
