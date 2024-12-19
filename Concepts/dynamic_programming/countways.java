package Concepts.dynamic_programming;

public class countways {
    public static long countDistinctWayToClimbStair(int n, long[] dp) {
        // Write your code here.
        if(n==2||n==1){
            return 1;
        }
        if(dp[n]!=-1) return dp[n];
        return dp[n] = countDistinctWayToClimbStair(n-1, dp)+countDistinctWayToClimbStair(n-2, dp);
    }

    public static void countDistinctWayToClimbStair(int n){
//        long[] dp = new long[n+1];
//        Arrays.fill(dp, -1);
////        System.out.println(countDistinctWayToClimbStair(n, dp));
//        dp[1] = 1;
//        dp[2] = 1;
//        for(int i=3;i<n+1;i++){
//            dp[i] = dp[i-1]+dp[i-2];
//        }
//        System.out.println(dp[n]);

        int prev = 1;
        int curr = 1;
        for(int i=3;i<n+1;i++){
            int next = curr+prev;
            prev = curr;
            curr = next;
        }
        System.out.println(curr);
    }

    public static void main(String[] args) {
        countDistinctWayToClimbStair(5);
    }
}
