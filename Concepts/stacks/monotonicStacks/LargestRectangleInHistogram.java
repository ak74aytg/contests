package Concepts.stacks.monotonicStacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(",");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(largestRectangleArea(arr));
    }

    public static int largestRectangleArea(int[] arr) {
//        int n = arr.length;
//        int maxArea = 0;
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < n; i++) {
//            if((!stack.isEmpty() && arr[stack.peek()]>arr[i])){
//                //areas = arr[i] * (nse[i]-pse[i]-1)
//                while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
//                    int height = arr[stack.pop()];
//                    int nse = i;
//                    int pse = stack.isEmpty() ? -1 : stack.peek();
//                    int area = height*(nse-pse-1);
//                    maxArea = Math.max(area, maxArea);
//                }
//            }
//            stack.push(i);
//        }
//        while(!stack.isEmpty()){
//            int height = arr[stack.pop()];
//            int pse = stack.isEmpty() ? -1 : stack.peek();
//            int area = height*(n-pse-1);
//            maxArea = Math.max(area, maxArea);
//        }
//        return maxArea;


        int ans = 0;
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=1;i<n;i++){
            if(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                while(!stack.isEmpty() && stack.peek()>arr[i]){
                    int num = arr[stack.pop()];
                    int nse = i;
                    int pse = stack.isEmpty() ? -1 : stack.peek();
                    ans = Math.max(num*(nse-pse-1), ans);
                }
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int num = stack.pop();
            int pse = stack.isEmpty() ? -1 : stack.peek();
            ans = Math.max(arr[num]*(n-pse-1), ans);
        }
        return ans;
    }
}
