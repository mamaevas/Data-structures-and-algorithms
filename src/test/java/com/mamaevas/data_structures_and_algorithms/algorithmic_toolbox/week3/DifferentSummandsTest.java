package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DifferentSummandsTest {
    @Test
    public void test_1() {
        assertEquals(new int[] {1, 2, 3}, DifferentSummands.optimalSummands(6).toArray());

    }

}