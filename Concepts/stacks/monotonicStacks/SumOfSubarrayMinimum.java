package Concepts.stacks.monotonicStacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SumOfSubarrayMinimum {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(",");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(sumSubarrayMins(arr));
    }



    public static int sumSubarrayMins(int[] arr) {
        int mod = (int) 1e9+7;
        int n = arr.length;
        int[] nse = new int[n];
        int[] psee = new int[n];

        nextSmallerElement(nse, arr);
        prevSmallerEqualElement(psee, arr);

        int total = 0;

        for (int i = 0; i < n; i++) {
            int next = nse[i];
            int prev = psee[i];

            long contribution = ((long) (next - i) * (i - prev) % mod * arr[i] % mod) % mod;
            total = (int) ((total + contribution) % mod);
        }
        return total%mod;
    }

    private static void nextSmallerElement(int[] nse, int[] arr){
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        for (int i = n-1; i >= 0; i--) {
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()) nse[i] = stack.peek();
            else nse[i] = n;
            stack.push(i);
        }
    }

    private static void prevSmallerEqualElement(int[] pse, int[] arr){
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()) pse[i] = stack.peek();
            else pse[i] = -1;
            stack.push(i);
        }
    }
}
