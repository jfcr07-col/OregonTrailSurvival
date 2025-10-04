package model;

import java.util.LinkedList;

public class GameController {

    // Attributes
    private Scenario currentScenario;
    private Player player;
    private LinkedList<Enemy> enemies;
    private Inventory inventory;
    private BinarySearchTree<Achievement> achievementTree;
    private boolean isPaused;
    private boolean isGameOver;

    // Constructor
    public GameController() {
        this.isPaused = false;
        this.isGameOver = false;
        this.enemies = new LinkedList<>();
        // other attributes initialized later
    }

    // Game lifecycle
    public void startGame() {
        // to be implemented
    }

    public void endGame() {
        // to be implemented
    }

    public void pauseGame() {
        // to be implemented
    }

    public void resumeGame() {
        // to be implemented
    }

    // Game update
    public void update(double deltaTime) {
        // to be implemented
    }

    // Scenario and entities
    public void changeScenario(TransitionPoint changePoint) {
        // to be implemented
    }

    public void spawnEnemy() {
        // to be implemented
    }

    public void checkCollisions() {
        // to be implemented
    }

    public void processCombat() {
        // to be implemented
    }

    // Achievements
    public void updateAchievements(Achievement achievement) {
        // to be implemented
    }

    // Conditions
    public boolean checkVictoryCondition() {
        // to be implemented
        return false;
    }

    public boolean checkGameOverCondition() {
        // to be implemented
        return false;
    }

    // Rendering
    public void renderUI() {
        // to be implemented
    }
}
