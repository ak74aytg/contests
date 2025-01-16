package Concepts.stacks.monotonicStacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class NextGreaterElement_II {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        String[] s = bf.readLine().split(" ");
        int max = -1;
        int maxIdx = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
            if(max<arr[i]){
                max = arr[i];
                maxIdx = i;
            }
        }

        solve(arr, n);
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = maxIdx; i >= 0 ; i--) {
            while(!stack.isEmpty() && arr[i]>stack.peek()){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i] = stack.peek();
            }else{
                result[i] = -1;
            }
            stack.push(arr[i]);
        }

        for (int i = n-1; i > maxIdx; i--) {
            while(!stack.isEmpty() && arr[i]>stack.peek()){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i] = stack.peek();
            }else{
                result[i] = -1;
            }
            stack.push(arr[i]);
        }


        for (int i = 0; i < n; i++) {
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }



    private static void solve(int[] arr, int n){
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2*n-1; i >=0; i--) {
            while(!stack.isEmpty() && arr[(i%n)]>=stack.peek()){
                stack.pop();
            }
            if(i<n){
                if(!stack.isEmpty()){
                    result[i] = stack.peek();
                }else{
                    result[i] = -1;
                }
            }
            stack.push(arr[(i%n)]);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
}
