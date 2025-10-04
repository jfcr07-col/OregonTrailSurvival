package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.MapGrid;

public class MapGridTest {

    private MapGrid map;

    @Before
    public void setupStage1() {
        // Setup1: Valid grid
        map = new MapGrid(20, 20);
    }

    @Before
    public void setupStage2() {
        // Setup2: Invalid grid
        map = new MapGrid(-5, 20);
    }

    @Test
    public void validSetHeightTest() {
        setupStage1();
        assertEquals(20, map.getHeight());
    }

    @Test
    public void invalidSetHeightTest() {
        setupStage2();
        assertTrue(map.getHeight() < 0);
    }
}
