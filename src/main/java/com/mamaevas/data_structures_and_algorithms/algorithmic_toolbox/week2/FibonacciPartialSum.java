package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week2;

import java.util.*;

public class FibonacciPartialSum {
    public static long getFibonacciPartialSumNaive(long from, long to) {
//        return getFibonacciPartialSum(from, to);
        long sum = 0;

        long current = 0;
        long next  = 1;

        for (long i = 0; i <= to; ++i) {
            if (i >= from) {
                sum += current;
            }

            long new_current = next;
            next = next + current;
            current = new_current;
        }

        return sum % 10;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(getFibonacciPartialSumNaive(from, to));
    }

//    public static int getFibonacciPartialSum(long from, long to) {
//
//    }

}

