package model;

import java.util.LinkedList;

public class Scenario {
    private MapGrid map;
    private LinkedList<Enemy> enemies;
    private LinkedList<TransitionPoint> transitions;
    private LinkedList<Item> resources;
    private LinkedList<Obstacle> obstacles;

    // Constructor
    public Scenario() {
        this.enemies = new LinkedList<>();
        this.transitions = new LinkedList<>();
        this.resources = new LinkedList<>();
        this.obstacles = new LinkedList<>();
    }

    // Setters
    public void setMap(MapGrid map) {
        this.map = map;
    }

    public void setEnemies(LinkedList<Enemy> enemies) {
        this.enemies = enemies;
    }

    public void setTransition(LinkedList<TransitionPoint> transitions) {
        this.transitions = transitions;
    }

    public void setResources(LinkedList<Item> resources) {
        this.resources = resources;
    }

    public void setObstacles(LinkedList<Obstacle> obstacles) {
        this.obstacles = obstacles;
    }

    // Getters
    public MapGrid getMap() {
        return map;
    }

    public LinkedList<Enemy> getEnemies() {
        return enemies;
    }

    public LinkedList<TransitionPoint> getTransition() {
        return transitions;
    }

    public LinkedList<Item> getResources() {
        return resources;
    }

    public LinkedList<Obstacle> getObstacles() {
        return obstacles;
    }

    // Add elements
    public void addResource(Item item) {
        resources.add(item);
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public void addTransition(TransitionPoint transition) {
        transitions.add(transition);
    }

    public void addObstacle(Obstacle obstacle) {
        obstacles.add(obstacle);
    }
}
