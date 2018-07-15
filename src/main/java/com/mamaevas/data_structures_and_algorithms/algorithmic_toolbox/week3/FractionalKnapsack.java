package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FractionalKnapsack {
    public static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        //write your code here

        TreeMap<Double, int[]> map = new TreeMap<>();
        for (int i = 0; i < values.length; i++) {
            map.put((double) weights[i] / values[i], new int[]{values[i], weights[i]});
        }


        while (capacity > 0) {
            Map.Entry<Double, int[]> entry = map.firstEntry();
            if (entry == null) {
                break;
            }
            if (capacity >= entry.getValue()[1]) {
                value += entry.getValue()[0];
                capacity -= entry.getValue()[1];
                map.remove(entry.getKey());
            } else {
                double rate = (double) capacity / entry.getValue()[1];
                value += rate * entry.getValue()[0];
                break;
            }
        }
        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
