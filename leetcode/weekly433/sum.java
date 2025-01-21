// package leetcode.weekly433;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sum {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            solve();
        }
    }
    
    private static void solve() throws IOException {
        int[] nums = Arrays.stream(bf.readLine().replace("[", "").replace("]", "").split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(subarraySum(nums));
    }

    public static int subarraySum(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n+1];
        prefix[0] = 0;
        prefix[1] = nums[0];
        for(int i=1;i<n;i++){
            prefix[i+1] = prefix[i]+nums[i];
        }
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = Math.max(0, i-nums[i]);
            int end = i;
            ans += prefix[end+1];
            ans -= prefix[start];
        }
        return ans;
    }
}
