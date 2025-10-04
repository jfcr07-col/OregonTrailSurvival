package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.Enemy;

public class EnemyTest {

    private Enemy enemy;

    @Before
    public void setupStage1() {
        // Setup1: Enemy with positive HP
        enemy = new Enemy("Bandit", 10, 2, 2, 2);
    }

    @Before
    public void setupStage2() {
        // Setup2: Enemy with zero HP
        enemy = new Enemy("Bandit", 0, 2, 2, 2);
    }

    @Test
    public void positiveReceiveDamageTest() {
        setupStage1();
        enemy.receiveDamage(4);
        assertTrue(enemy.getHealth() >= 0);
    }

    @Test
    public void negativeReceiveDamageTest() {
        setupStage2();
        enemy.receiveDamage(5);
        assertEquals(0, enemy.getHealth());
    }
}
