package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.Achievement;

public class AchievementTest {

    private Achievement achievement;

    @Before
    public void setupStage1() {
        // Setup1: Valid achievement
        achievement = new Achievement("Explorer", "Unlocked for discovering all scenarios");
    }

    @Before
    public void setupStage2() {
        // Setup2: Invalid achievement
        achievement = new Achievement("", "");
    }

    @Test
    public void validIsUnlockedTest() {
        setupStage1();
        achievement.setUnlocked(true);
        assertTrue(achievement.isUnlocked());
    }

    @Test
    public void invalidIsUnlockedTest() {
        setupStage2();
        assertFalse(achievement.isUnlocked());
    }
}
