package Concepts.stacks.monotonicStacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {


    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> list = new LinkedList<>();
        int[] ans = new int[nums.length-k+1];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(!list.isEmpty() && list.getFirst()<=i-k){
                list.removeFirst();
            }
            while(!list.isEmpty() && nums[list.getLast()]<=nums[i]){
                list.removeLast();
            }
            list.addLast(i);
            if(i>=k-1){
                ans[j++] = nums[list.getFirst()];
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine().replace("]", "").replace("[", "");
        int k = Integer.parseInt(bf.readLine());
        String[] s = input.split(",");
        int arr[] = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int[] res = maxSlidingWindow(arr, k);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
