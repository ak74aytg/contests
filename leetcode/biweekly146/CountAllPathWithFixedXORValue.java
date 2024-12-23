package leetcode.biweekly146;

import java.util.Arrays;

public class CountAllPathWithFixedXORValue {
    public static void main(String[] args) {
        int[][] num = new int[][]{{2,1,5},{7,10,0},{12,6,4}};
//        int[][] num = new int[][]{{1,3,3,3},{0,3,3,2},{3,0,1,1}};
        int k = 11;
        System.out.println(countPathsWithXorValue(num, k));
    }


    private static int MOD = (int) (1e9+7);
    public static int countPathsWithXorValue(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        Integer[][][] dp = new Integer[n][m][16];
        return countSubarrayWithCondition(grid, n-1, m-1, k, 0, dp);
    }

    private static int countSubarrayWithCondition(int[][] grid, int i, int j, int k, int xor, Integer[][][] dp){
        if(i==0 && j==0){
            if((grid[i][j] ^ xor) == k){
                return 1;
            }else{
                return 0;
            }
        }
        if(i<0 || j<0)return 0;


        if(dp[i][j][xor]!=null) return dp[i][j][xor];
        xor ^= grid[i][j];
        int left = countSubarrayWithCondition(grid, i, j-1, k, xor, dp) % MOD;
        int up = countSubarrayWithCondition(grid, i-1, j, k, xor, dp) % MOD;
        dp[i][j][xor^grid[i][j]] = (left+up) % MOD;
        return (left+up) % MOD;
    }
}
