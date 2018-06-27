package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week2;

import java.util.Scanner;

public class Fibonacci {
    public static int calc_fib(int n) {
        if (n <= 1)
            return n;
        int previous = 0;
        int current = 1;
        for (int i = 0; i < n - 1; i++) {
            int tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }
        return current;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(calc_fib(n));
    }
}

