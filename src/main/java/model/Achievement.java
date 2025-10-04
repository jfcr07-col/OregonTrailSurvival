package model;

public class Achievement {
    private String name;
    private String description;
    private boolean unlocked;

    // Constructor
    public Achievement(String name, String description) {
        this.name = name;
        this.description = description;
        this.unlocked = false;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    public void setUnlocked(boolean unlocked) {
        this.unlocked = unlocked;
    }

    // Compare achievements
    public int compareTo(Achievement a) {
        // to be implemented
        return 0;
    }
}
