package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciSumLastDigitTest {
    @Test
    public void test() {
        for (int i =0 ; i < 90; i += 1) {
        assertEquals(FibonacciSumLastDigit.getFibonacciSumNaive(i), FibonacciSumLastDigit.getFibonacciSum(i), "i= " + i);
        }
    }

    @Test
    public void test2() {
        for (int i=0; i < 90; i++) {
            assertEquals(FibonacciSumLastDigit.getFibonacciSumNaive(i), FibonacciSumLastDigit.getFibonacciSumFormula(i), "i= " + i);
        }
    }

    @Test
    public void test3() {
        assertEquals(3, FibonacciSumLastDigit.getFibonacciSumFormula(832564823476L));
        assertEquals(0, FibonacciSumLastDigit.getFibonacciSumFormula(0L));
        assertEquals(1, FibonacciSumLastDigit.getFibonacciSumFormula(1L));
        assertEquals(2, FibonacciSumLastDigit.getFibonacciSumFormula(2L));
        for (int i = 0 ; i < 60; i++) {
            assertEquals(FibonacciSumLastDigit.getFibonacciSumNaive(i), FibonacciSumLastDigit.getFibonacciSumFormula(i), "i= " + i);
        }
    }

}