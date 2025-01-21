// package leetcode.weekly433;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class maxMinSum {
    static int MOD = 1000000000+7;
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            solve();
        }
    }
    
    private static void solve() throws IOException {
        int[] nums = Arrays.stream(bf.readLine().replace("[", "").replace("]", "").split(",")).mapToInt(Integer::parseInt).toArray();
        int k = Integer.parseInt(bf.readLine());
        System.out.println(minMaxSums(nums, k));
    }

    public static int minMaxSums(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=1;i<=n;i++){
            for(int j = 1; j<=k;j++){
                sum = (sum + (nCr(n-i , j-1) * nums[i-1]));
            }
        }
        nums = Arrays.stream(nums)
                    .boxed()
                    .sorted((a, b) -> b - a) 
                    .mapToInt(Integer::intValue) 
                    .toArray();

        for(int i=1;i<=n;i++){
            for(int j = 1; j<=k;j++){
                sum = (sum + (nCr(n-i , j-1) * nums[i-1]));
            }
        }
        return sum;
    }


    private static int nCr(int n, int r){
        if(r>n) return 0;
        if(r==0 || r==n) return 1;
        r = Math.min(r, n-r);
        int result = 1;
        for(int i = 0; i<r;i++){
            result = (result * (n-i)) % MOD;
            result = (result * (i+1)) % MOD;
        }
        return result;
    }
}
