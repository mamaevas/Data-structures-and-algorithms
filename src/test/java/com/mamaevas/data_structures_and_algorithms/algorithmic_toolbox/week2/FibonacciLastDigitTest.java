package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week2;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciLastDigitTest {
    @Test
    public void test() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FibonacciLastDigit.class.getDeclaredMethod("getFibonacciLastDigitNaive", Integer.TYPE);
        method.setAccessible(true);
        assertEquals(1, method.invoke(null, 239));
        assertEquals(5, method.invoke(null, 1000));
        assertEquals(3, method.invoke(null, 2393));
    }

}