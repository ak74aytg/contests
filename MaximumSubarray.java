public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {

        int max = nums[0];
        int sum = 0;
        for (int num : nums) {
            sum += num;
            max = Math.max(sum, max);
            if (sum < 0) sum = 0;
        }

//        int max = nums[0];
//        int currentSum = nums[0];
//        for(int i=0;i<nums.length;i++){
//            currentSum = Math.max(currentSum+nums[i], nums[i]);
//            max = Math.max(max, currentSum);
//        }


        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
