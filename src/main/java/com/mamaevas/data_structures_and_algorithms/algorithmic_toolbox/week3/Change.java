package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week3;

import java.util.Scanner;

public class Change {
    public static int getChange(int m) {
        //write your code here
        int lastSum = m;
        int counter = 0;
        int[] coins = {1, 5, 10};
        int index = coins.length-1;
        while (index >= 0) {
            int diff = lastSum - coins[index];
            if (diff > 0) {
                counter++;
                lastSum = diff;
            } else if (diff < 0) {
                index--;
            } else {
                return ++counter;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

