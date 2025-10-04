package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.TransitionPoint;
import model.Scenario;

public class TransitionPointTest {

    private TransitionPoint tp;
    private Scenario scenario;

    @Before
    public void setupStage1() {
        // Setup1: Valid transition point
        scenario = new Scenario();
        tp = new TransitionPoint(5, 5, scenario);
    }

    @Before
    public void setupStage2() {
        // Setup2: Invalid transition point
        tp = null;
    }

    @Test
    public void validTransitionPointTest() {
        setupStage1();
        assertNotNull(tp);
    }

    @Test
    public void invalidTransitionPointTest() {
        setupStage2();
        assertNull(tp);
    }
}
