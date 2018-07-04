package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FractionalKnapsack {
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

    public static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double result = 0;
        int length = values.length;
        //write your code here
        TreeMap<Double, int[]> map = new TreeMap<>();
        for (int i = 0; i < length; i++) {
            double density = values[i] / weights[i];
            map.put(density, new int[]{values[i], weights[i]});
        }


        int cap = 0;
        int val = 0;
        while (cap < capacity) {
            Map.Entry<Double, int[]> entry = map.lastEntry();
            double density = entry.getKey();
            int value = entry.getValue()[0];
            int weight = entry.getValue()[1];

            int maxValue = getMaxValue(capacity - cap, value);
            cap += maxValue;
            result += maxValue * density;
            map.remove(density);
        }
        return result;
    }

    public static int getMaxValue(int capacity, int value) {
        if (capacity >= value) {
            return value;
        }
        return capacity;
    }
} 
