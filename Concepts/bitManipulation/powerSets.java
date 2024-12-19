package Concepts.bitManipulation;

import java.util.ArrayList;
import java.util.List;

public class powerSets {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        printSets(nums);
    }

    private static void printSets(int[] nums){
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            int j =0;
            int num = i;
            List<Integer> temp = new ArrayList<>();
            while(j<n){
                if((num&1)!=0){
                    temp.add(nums[j]);
                }
                num = num>>1;
                j++;
            }
            list.add(temp);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
