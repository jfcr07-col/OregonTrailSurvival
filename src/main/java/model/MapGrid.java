package model;

public class MapGrid {
    private int width;
    private int height;

    // Constructor
    public MapGrid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Getters and setters
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
