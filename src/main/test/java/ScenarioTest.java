package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.Scenario;
import model.Enemy;

public class ScenarioTest {

    private Scenario scenario;
    private Enemy enemy;

    @Before
    public void setupStage1() {
        // Setup1: Valid enemy added
        scenario = new Scenario();
        enemy = new Enemy("Wolf", 10, 2, 1, 1);
    }

    @Before
    public void setupStage2() {
        // Setup2: Invalid enemy (null)
        scenario = new Scenario();
        enemy = null;
    }

    @Test
    public void positiveAddEnemyTest() {
        setupStage1();
        scenario.addEnemy(enemy);
        assertTrue(scenario.getEnemies().contains(enemy));
    }

    @Test
    public void negativeAddEnemyTest() {
        setupStage2();
        try {
            scenario.addEnemy(enemy);
            fail("Should throw exception for null enemy");
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}
