package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FibonacciTest {
    @Test
    public void test() {
        assertThat(Fibonacci.calc_fib(10), is(55L));
        System.out.println(Fibonacci.counter);
    }

}