package Concepts.dynamic_programming;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxSumNonAdjElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        while(T-->0){
            int N = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0;i<N;i++){
                arr.add(sc.nextInt());
            }
            System.out.println(maximumNonAdjacentSum(arr));
//        }
        sc.close();
    }
    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
        if(nums.size()==1){
            return nums.get(0);
        }
        if(nums.size()==2){
            return Math.max(nums.get(0), nums.get(1));
        }
        if(nums.size()==3){
            return Math.max(nums.get(0)+nums.get(nums.size()-1), nums.get(1));
        }
        int[] max = new int[nums.size()];
        int n = max.length-1;
        max[n] = nums.get(n);
        max[n-1] = nums.get(n-1);
        max[n-2] = nums.get(n-2)+nums.get(n);
        for(int i=n-3;i>=0;i--){
            max[i] = Math.max(max[i+2], max[i+3]);
            max[i] += nums.get(i);
        }
        return Math.max(max[0], max[1]);
    }
}
