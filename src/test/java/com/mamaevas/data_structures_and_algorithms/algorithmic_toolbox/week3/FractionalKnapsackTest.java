package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionalKnapsackTest {

    @Test
    void getMaxValue() {
        int[] values = {60, 100, 120};
        int[] weights = {20, 50, 30};
        int capacity = 50;
        assertEquals(180.0000, FractionalKnapsack.getOptimalValue(capacity, values, weights), 0.0001);
    }

    @Test
    public void getMaxValue2() {
        int[] values = {500};
        int[] weights = {30};
        int capacity = 10;
        assertEquals(166.6667, FractionalKnapsack.getOptimalValue(capacity, values, weights), 0.0001);
    }

    @Test
    public void getMaxValue3() {
        int[] values = {500};
        int[] weights = {30};
        int capacity = 1000;
        assertEquals(500.000, FractionalKnapsack.getOptimalValue(capacity, values, weights), 0.0001);
    }
}