package leetcode.biweekly148;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class maxDiff {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            solve();
        }
    }
    
    private static void solve() throws IOException {
        int[] nums = Arrays.stream(bf.readLine().replace("[", "").replace("]", "").split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(maxAdjacentDistance(nums));
    }

    public static int maxAdjacentDistance(int[] nums) {
        int max = Math.abs(nums[0] - nums[nums.length-1]);
        for (int i = 1; i < nums.length; i++){
            max = Math.max(max, Math.abs(nums[i]- nums[i-1]));
        }
        return max;
    }
}