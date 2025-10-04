package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.Objective;

public class ObjectiveTest {

    private Objective objective;

    @Before
    public void setupStage1() {
        // Setup1: Valid objective
        objective = new Objective(5, 10);
    }

    @Before
    public void setupStage2() {
        // Setup2: Invalid objective
        objective = new Objective(0, 0);
    }

    @Test
    public void positiveValidObjectiveTest() {
        setupStage1();
        assertTrue(objective.validObjective());
    }

    @Test
    public void negativeValidObjectiveTest() {
        setupStage2();
        assertFalse(objective.validObjective());
    }
}
