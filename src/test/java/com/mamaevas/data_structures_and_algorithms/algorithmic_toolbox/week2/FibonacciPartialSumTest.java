package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciPartialSumTest {

    @Test
    public void test() {
        System.out.println(FibonacciPartialSum.getFibonacciSum(10));
        System.out.println(FibonacciPartialSum.getFibonacciSum(20));


        for (int i = 10; i < 80; i++) {
            assertEquals(
                    FibonacciPartialSum.getFibonacciPartialSum(i, i + 10),
                    FibonacciPartialSum.getFibonacciPartialSumFormula(i, i + 10),
                    "i= " + i);
        }
    }

}