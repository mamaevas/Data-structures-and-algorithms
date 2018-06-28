package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCMTest {
    @Test
    public void test() {
        assertEquals(2520, LCM.lcm_naive(140, 72));
        assertEquals(226436590403296L, LCM.lcm_naive(14159572, 63967072));
    }

}