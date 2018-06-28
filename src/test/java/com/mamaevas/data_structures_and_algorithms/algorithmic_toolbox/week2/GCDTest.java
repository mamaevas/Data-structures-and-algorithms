package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GCDTest {

    @Test
    public void euklidNaiveTest() {
        assertEquals(GCD.gcdNaive(3918848, 1653264), 61232);
    }

    @Test
    public void euklidRecursiveTest() {
        assertEquals(GCD.gcdEuklidRecursive(3918848, 1653264), 61232);
    }

    @Test
    public void euklidSubtractionTest() {
        assertEquals(GCD.gcdSubtraction(3918848, 1653264), 61232);
    }

    @Test
    public void euklidDivisionTest() {
        assertEquals(GCD.gcdDivision(3918848, 1653264), 61232);
    }

}