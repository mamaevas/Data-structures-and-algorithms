package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaxPairwiseProductTest {
    @Test
    public void test(){
        int[] array = {1, 6, 3, 4, 5, 6};
        assertThat(MaxPairwiseProduct.getMaxPairwiseProduct(array), is(36L));
    }

    @Test
    public void test2() {
        int[] array = {90000, 1000000};
        assertThat(MaxPairwiseProduct.getMaxPairwiseProduct(array), is(90000000000L));
    }
}