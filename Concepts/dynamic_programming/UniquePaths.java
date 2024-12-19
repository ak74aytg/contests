package Concepts.dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;

public class UniquePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(uniquePaths(m, n));
        }
        sc.close();
    }

    public static int uniquePaths(int m, int n) {
        // Write your code here.
//        int[][] dp = new int[m][n];
        // return recurUniquePaths(m-1, n-1);
//        return memoUniquePaths(m-1, n-1, dp);
//        return iterUniquePaths(m, n);
        return spaceOptUniquePaths(m, n);
    }

    private static int recurUniquePaths(int m, int n){
        if(m==0 && n==0) return 1;
        if(m<0 || n<0) return 0;

        int up = recurUniquePaths(m-1, n);
        int left = recurUniquePaths(m, n-1);
        return up + left;
    }


    private static int memoUniquePaths(int m, int n,int[][] dp){
        if(m==0 && n==0) return dp[m][n] = 1;
        if(m<0 || n<0) return 0;

        if(dp[m][n] != 0) return dp[m][n];

        int up = recurUniquePaths(m-1, n);
        int left = recurUniquePaths(m, n-1);
        return dp[m][n] = (up + left);
    }


    private static int iterUniquePaths(int m, int n){
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if(i==0 && j==0) continue;
                int up = i-1>=0 ? dp[i-1][j] : 0;
                int left = j-1>=0 ? dp[i][j-1] : 0;
                dp[i][j] = up + left;
            }
        }
        return dp[m-1][n-1];
    }


    private static int spaceOptUniquePaths(int m, int n){
        int[] prev = new int[n];
        Arrays.fill(prev, 0);
        for (int i = 0; i < m; i++) {
            int[] curr = new int[n];
            if(i==0) curr[0] = 1;
            for (int j = 0; j < n; j++) {
                if(i==0 && j==0) continue;
                int up = prev[j];
                int left = j-1>-1 ? curr[j-1] : 0;
                curr[j] = up+left;
            }
            prev = curr;
        }
        return prev[n-1];
    }
}
