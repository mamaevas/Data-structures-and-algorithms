package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangeTest {

    @Test
    void getChange() {
        assertEquals(2, Change.getChange(2));
        assertEquals(6, Change.getChange(28));
    }
}