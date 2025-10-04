package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.Medicine;

public class MedicineTest {

    private Medicine medicine;

    @Before
    public void setupStage1() {
        // Setup1: Valid medicine
        medicine = new Medicine(0, 0, 5, 10, 3);
    }

    @Before
    public void setupStage2() {
        // Setup2: Invalid medicine
        medicine = new Medicine(0, 0, -3, 10, 3);
    }

    @Test
    public void validHealingQuantityTest() {
        setupStage1();
        assertTrue(medicine.getQuantity() > 0);
    }

    @Test
    public void invalidHealingQuantityTest() {
        setupStage2();
        assertFalse(medicine.getQuantity() > 0);
    }
}
