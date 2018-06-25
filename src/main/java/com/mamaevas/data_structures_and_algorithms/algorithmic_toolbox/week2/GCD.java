package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week2;

public class GCD {
    public static int opsCounter = 0;

    public static int gcdNaive(int a, int b) {
        int current_gcd = 1;
        for (int d = 2; d <= a && d <= b; ++d) {
            opsCounter++;
            opsCounter++;
            if (a % d == 0 && b % d == 0) {
                opsCounter++;
                if (d > current_gcd) {
                    current_gcd = d;
                    opsCounter++;
                }
            }
        }

        return current_gcd;
    }

    public static int gcdEuklidRecursive(int a, int b) {
        opsCounter++;
        if (b == 0) {
            opsCounter++;
            return a;
        }
        opsCounter++;
        return gcdEuklidRecursive(b, a % b);
    }

    public static int gcdSubtraction(int a, int b) {
        opsCounter++;
        while (a != b) {
            opsCounter++;
            if (a > b) {
                opsCounter++;
                a = a - b;
            } else {
                opsCounter++;
                b = b - a;
            }
        }
        return a;
    }

    public static int gcdDivision(int a, int b) {
        opsCounter++;
        while (a != 0 && b != 0) {
            opsCounter++;
            if (a > b) {
                opsCounter++;
                a = a % b;
            } else {
                opsCounter++;
                b = b % a;
            }
        }
        opsCounter++;
        return a + b;
    }
}
