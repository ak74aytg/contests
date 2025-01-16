package Concepts.stacks.monotonicStacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SumOfSubarrayRanges {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(",");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(subArrayRanges(arr));
    }


    private static Stack<Integer> stack = new Stack<>();
    public static long subArrayRanges(int[] nums) {
        long largest = subArrayMaximum(nums);
        long smallest = subArrayMinimum(nums);
        return largest-smallest;
    }


    private static long subArrayMinimum(int[] nums){
        int n = nums.length;
        long[] nse = new long[n];
        long[] pse = new long[n];
        nextSmallerElement(nums, nse);
        prevSmallerElement(nums, pse);
        long total = 0;
        for(int i=0;i<n;i++){
            total += (nse[i]-i)*(i-pse[i])*nums[i];
        }
        return total;
    }

    private static long subArrayMaximum(int[] nums){
        int n = nums.length;
        long[] nge = new long[n];
        long[] pge = new long[n];
        nextGreaterElement(nums, nge);
        prevGreaterElement(nums, pge);
        long total = 0;
        for(int i=0;i<n;i++){
            total += (nge[i]-i)*(i-pge[i])*nums[i];
        }
        return total;
    }


    private static void nextSmallerElement(int[] arr, long[] nse){
        stack.clear();
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            nse[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
    }

    private static void prevSmallerElement(int[] arr, long[] pse){
        stack.clear();
        int n = arr.length;
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            pse[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
    }

    private static void nextGreaterElement(int[] arr, long[] nge){
        stack.clear();
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
                stack.pop();
            }
            nge[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
    }

    private static void prevGreaterElement(int[] arr, long[] pge){
        stack.clear();
        int n = arr.length;
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            pge[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
    }
}
