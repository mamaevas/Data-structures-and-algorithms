package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week2;

import java.util.Scanner;

public class GCD {

//    private static int gcd_naive(int a, int b) {
//        int current_gcd = 1;
//        for(int d = 2; d <= a && d <= b; ++d) {
//            if (a % d == 0 && b % d == 0) {
//                if (d > current_gcd) {
//                    current_gcd = d;
//                }
//            }
//        }
//
//        return current_gcd;
//    }

    private static int gcd_naive(int a, int b) {
        return gcdDivision(a, b);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(gcd_naive(a, b));
    }

    public static int gcdNaive(int a, int b) {
        int current_gcd = 1;
        for (int d = 2; d <= a && d <= b; ++d) {
            if (a % d == 0 && b % d == 0) {
                if (d > current_gcd) {
                    current_gcd = d;
                }
            }
        }

        return current_gcd;
    }

    public static int gcdEuklidRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdEuklidRecursive(b, a % b);
    }

    public static int gcdSubtraction(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
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
