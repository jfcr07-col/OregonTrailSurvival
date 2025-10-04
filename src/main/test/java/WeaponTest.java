package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.Weapon;

public class WeaponTest {

    private Weapon weapon;

    @Before
    public void setupStage1() {
        // Setup1: Valid reload time
        weapon = new Weapon(8, 6, 3, 1);
    }

    @Before
    public void setupStage2() {
        // Setup2: Invalid reload time
        weapon = new Weapon(8, 6, -1, 1);
    }

    @Test
    public void validReloadTimeTest() {
        setupStage1();
        assertTrue(weapon.getReloadTime() > 0);
    }

    @Test
    public void invalidReloadTimeTest() {
        setupStage2();
        assertFalse(weapon.getReloadTime() > 0);
    }
}
