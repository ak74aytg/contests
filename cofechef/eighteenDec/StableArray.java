package cofechef.eighteenDec;

import java.util.Scanner;
import java.util.Stack;

public class StableArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder result = new StringBuilder("");
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i <n; i++) {
                arr[i] = sc.nextInt();
            }
            Stack<Integer> stack = new Stack<>();
            int[] last = new int[n];
            for (int i = 0; i < n; i++) {
                if(!stack.isEmpty()){
                    while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
                        stack.pop();
                    }
                    last[i] = stack.isEmpty() ? -1 : stack.peek();
                }else{
                    last[i] = -1;
                }
                stack.push(i);
            }
            int ans = 0;
            for(int idx : stack){
                ans = Math.max(ans, idx - last[idx] -1);
            }
            result.append(ans+"\n");
        }
        System.out.println(result);
    }
}
