//package codeforces.threeDec;

import java.util.*;

import java.util.Scanner;

public class SwapColFindPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] matrix = new int[2][n];
            for (int j = 0; j < 2; j++) {
                for (int i = 0; i < n; i++) {
                    matrix[j][i] = sc.nextInt();
                }
            }

            // Create an array of column values
            int totalSum = 0;
            for (int i = 0; i < n; i++) {
                totalSum += Math.max(matrix[0][i], matrix[1][i]);
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int sum = matrix[0][i]+matrix[1][i];
                sum += totalSum-Math.max(matrix[0][i], matrix[1][i]);
                max = Math.max(max, sum);
            }
            System.out.println(max);
        }
        sc.close();
    }
}