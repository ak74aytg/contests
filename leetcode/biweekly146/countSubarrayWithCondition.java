package leetcode.biweekly146;

public class countSubarrayWithCondition {
    public static void main(String[] args) {
        int[] num = new int[]{-1,-4,-1,4};
        System.out.println(countSubarrays(num));
    }

    public static int countSubarrays(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n-2; i++) {
            int num1 = nums[i];
            int num2 = nums[i+1];
            int num3 = nums[i+2];
            if((num1+num3)*2==num2){
                ans++;
            }
        }
        return ans;
    }
}
