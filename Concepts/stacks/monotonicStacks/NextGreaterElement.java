package Concepts.stacks.monotonicStacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }
        System.out.println(nextgreaterElement(arr, n));
    }

    private static String nextgreaterElement(int[] arr, int n){
        StringBuilder result = new StringBuilder("");
        int[] resultArr = new int[n];
        Stack<Integer> monoStack = new Stack<>();
        for (int i = n-1; i >= 0; i--) {
            while(!monoStack.isEmpty() && monoStack.peek()<=arr[i]){
                monoStack.pop();
            }
            if(monoStack.isEmpty()){
                resultArr[i] = -1;
            }else{
                resultArr[i] = monoStack.peek();
            }
            monoStack.push(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            result.append(resultArr[i]);
            result.append(" ");
        }
        return result.toString();
    }
}
