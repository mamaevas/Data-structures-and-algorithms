package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week3;

import java.util.Arrays;
import java.util.Scanner;

public class DotProduct {
    public static long maxDotProduct(int[] a, int[] b) {
        //write your code here
        long result = 0;
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = a.length - 1; i >= 0; i--) {
            result += (long) a[i] * b[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println(maxDotProduct(a, b));
    }
}

