package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DotProductTest {

    @Test
    public void test_1() {
        int[] a = {23};
        int[] b = {39};
        assertEquals(897, DotProduct.maxDotProduct(a, b));
    }

    @Test
    public void test_2() {
        int[] a = {1, 3, -5};
        int[] b = {-2, 4, 1};
        assertEquals(23, DotProduct.maxDotProduct(a, b));
    }

    @Test
    public void test_3() {
        int[] a = {1_000_000};
        int[] b = {1_000_000};
        assertEquals(1_000_000_000_000L, DotProduct.maxDotProduct(a, b));
    }

}