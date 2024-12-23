package leetcode.biweekly145;

import java.util.TreeSet;

public class MinimumOperations {
    public static int minOperations(int[] nums, int k) {
        int ans = 0;
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<k) return -1;
            if(nums[i]>k){
                if(!set.contains(nums[i])){
                    set.add(nums[i]);
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int k = 2;
        int[] nums = new int[]{5,2,5,4,5};
        System.out.println(minOperations(nums, k));
    }
}
