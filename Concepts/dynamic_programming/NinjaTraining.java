package Concepts.dynamic_programming;

import java.util.Scanner;

public class NinjaTraining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][3];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
                arr[i][2] = sc.nextInt();
            }
            System.out.println(ninjaTraining(n, arr));
        }
        sc.close();
    }


    //            11
//            210
//            45
//            110
    public static int ninjaTraining(int n, int points[][]) {
        int[][] dp = new int[n][4];
        return ninjaTraining(n - 1, points, 3, dp);
        // Write your code here..
    }


    //Recursive
    private static int ninjaTrainingRecursion(int day, int tasks[][], int last) {
        if (day == 0) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                if (i != last) {
                    max = Math.max(max, tasks[day][i]);
                }
            }
            return max;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            if (last != i) {
                int point = tasks[day][i] + ninjaTrainingRecursion(day - 1, tasks, i);
                max = Math.max(max, point);
            }
        }
        return max;
    }


    //Using Recursive Dynamic Programming
    private static int ninjaTraining(int day, int tasks[][], int last, int dp[][]) {
        if (day == 0) {
            int max = 0;
            for (int i = 0; i < 3; i++) {
                if (i != last) {
                    max = Math.max(max, tasks[0][i]);
                }
            }
            return max;
        }
        if(dp[day][last]!=0) return dp[day][last];
        int max = 0;
        for (int i = 0; i < 3; i++) {
            if (last != i) {
                int point = tasks[day][i] + ninjaTraining(day - 1, tasks, i, dp);
                max = Math.max(max, point);
            }
        }
        return dp[day][last] = max;
    }
}
