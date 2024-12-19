import java.util.Arrays;

public class nextpermulation {
    public static void nextPermutation(int[] nums) {
        int num = nums.length;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                num = i-1;
                break;
            }
        }

        if(num==nums.length){
            Arrays.sort(nums);
            return;
        }

        Arrays.sort(nums, num+1, nums.length);
        int swapIdx = nums.length-1;
        for(int i=num;i<nums.length;i++){
            if(nums[num]<nums[i]){
                swapIdx = i;
                break;
            }
        }

        int temp = nums[num];
        nums[num] = nums[swapIdx];
        nums[swapIdx] = temp;




    }

    public static void main(String[] args) {
        int[] nums = {1,3,2};
        nextPermutation(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
