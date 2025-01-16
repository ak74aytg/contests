package Concepts.stacks.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class finalPriceNdiscount {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().replace("]", "").replace("[", "").split(",");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int[] ans = finalPrices(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }


    public static int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = prices.length-1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek()>prices[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = prices[i];
            }else{
                ans[i] = prices[i] - stack.peek();
            }
            stack.push(prices[i]);
        }
        return ans;
    }
}
