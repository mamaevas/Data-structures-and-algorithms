package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week3.CoveringSegments.Segment;
import static com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week3.CoveringSegments.optimalPoints;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CoveringSegmentsTest {

    @Test
    public void test_1() {
        Segment[] segments = {new Segment(1, 3), new Segment(2, 5), new Segment(3, 6)};
        System.out.println(Arrays.asList(segments));
        assertArrayEquals(new int[]{3}, optimalPoints(segments));
    }

    @Test
    public void test_2() {
        Segment[] segments = {new Segment(4, 7), new Segment(1, 3), new Segment(2, 5), new Segment(5, 6)};
        System.out.println(Arrays.asList(segments));
        assertArrayEquals(new int[]{3, 6}, optimalPoints(segments));
    }
}