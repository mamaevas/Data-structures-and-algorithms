package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxPairwiseProductTest {
    @Test
    public void test(){
        int[] array = {1, 6, 3, 4, 5, 6};
        assertEquals(MaxPairwiseProduct.getMaxPairwiseProduct(array), 36L);
    }

    @Test
    public void test2() {
        int[] array = {90000, 1000000};
        assertEquals(MaxPairwiseProduct.getMaxPairwiseProduct(array), 90000000000L);
    }
}