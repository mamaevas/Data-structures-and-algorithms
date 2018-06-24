package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week2;

import java.util.Scanner;

public class Fibonacci {
    public static int counter =0;

    public static long calc_fib(int n) {
        counter++;
        if (n <= 1)
            return n;

        return calc_fib(n - 1) + calc_fib(n - 2);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(calc_fib(n));
    }
}
