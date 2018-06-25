package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week2;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class GCDTest {
    @Before
    public void before() {
        GCD.opsCounter = 0;
    }

    @Test
    public void euklidNaiveTest() {
        assertThat(GCD.gcdNaive(3918848, 1653264), is(61232));
        System.out.println(GCD.opsCounter);
    }

    @Test
    public void euklidRecursiveTest() {
        assertThat(GCD.gcdEuklidRecursive(3918848, 1653264), is(61232));
        System.out.println(GCD.opsCounter);
    }

    @Test
    public void euklidSubtractionTest() {
        assertThat(GCD.gcdSubtraction(3918848, 1653264), is(61232));
        System.out.println(GCD.opsCounter);
    }

    @Test
    public void euklidDivisionTest() {
        assertThat(GCD.gcdDivision(3918848, 1653264), is(61232));
        System.out.println(GCD.opsCounter);
    }

}