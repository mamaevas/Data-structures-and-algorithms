package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week2;

import java.util.Scanner;

public class FibonacciSumLastDigit {
    public static long getFibonacciSumNaive(long n) {
//        return getFibonacciSumFormula(n);
        if (n <= 1)
            return n;

        long previous = 0;
        long current = 1;
        long sum = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
            sum += current;
        }
        return sum % 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSumNaive(n);
        System.out.println(s);
    }

    public static int getFibonacciSum(long n) {
        if (n <= 1)
            return (int) n;
        int previous = 0;
        int current = 1;
        int sum = 1;

        for (long i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = (tmp_previous + current) % 10;
            sum = (sum + current) % 10;
        }
        return sum % 10;
    }

    public static int getFibonacciSumFormula(long n) {
        if (n <=1)
            return (int) n;
        long a = getFibonacciSum(60);
        long b = n/60;
        long c = a * b;
        long d = getFibonacciSum(n%60);
        return (int) ((c + d) % 10);
    }
}

