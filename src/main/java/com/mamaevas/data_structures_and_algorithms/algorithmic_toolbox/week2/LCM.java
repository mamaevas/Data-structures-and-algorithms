package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week2;

import java.util.Scanner;

public class LCM {
    public static long lcm_naive(int a, int b) {
        return lcmGDC(a, b);
//        return lcmNaive(a, b);
    }

    public static long lcmNaive(int a, int b) {
        for (long l = 1; l <= (long) a * b; ++l)
            if (l % a == 0 && l % b == 0)
                return l;

        return (long) a * b;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(lcm_naive(a, b));
    }

    public static long lcmGDC(int a, int b) {
        int gcd = gcdDivision(a, b);
        return (long)(a / gcd) * b;
    }

    public static int gcdDivision(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }
}
