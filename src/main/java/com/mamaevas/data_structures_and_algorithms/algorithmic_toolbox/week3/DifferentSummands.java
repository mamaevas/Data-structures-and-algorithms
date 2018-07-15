package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DifferentSummands {
    public static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<>();
        //write your code here


        return summands;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());
        for (Integer summand : summands) {
            System.out.print(summand + " ");
        }
    }
}

