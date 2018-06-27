package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {
    @Test
    public void test() {
        assertEquals(Fibonacci.calc_fib(0), 0);
        assertEquals(Fibonacci.calc_fib(1), 1);
        assertEquals(Fibonacci.calc_fib(2), 1);
        assertEquals(Fibonacci.calc_fib(3), 2);
        assertEquals(Fibonacci.calc_fib(4), 3);
        assertEquals(Fibonacci.calc_fib(5), 5);
        assertEquals(Fibonacci.calc_fib(6), 8);
        assertEquals(Fibonacci.calc_fib(7), 13);
        assertEquals(Fibonacci.calc_fib(8), 21);
        assertEquals(Fibonacci.calc_fib(9), 34);
        assertEquals(Fibonacci.calc_fib(10), 55);
        assertEquals(Fibonacci.calc_fib(23), 28657);

    }
}