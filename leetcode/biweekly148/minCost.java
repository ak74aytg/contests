// package leetcode.biweekly148;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class minCost {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            solve();
        }
    }
    
    private static void solve() throws IOException {
        int[] arr = Arrays.stream(bf.readLine().replace("]", "").replace("[", "").split(",")).mapToInt(Integer::parseInt).toArray();
        int[] brr = Arrays.stream(bf.readLine().replace("]", "").replace("[", "").split(",")).mapToInt(Integer::parseInt).toArray();
        long k = Long.parseLong(bf.readLine());
        System.out.println(minost(arr, brr, k));
    }


    public static long minost(int[] arr, int[] brr, long k) {
        long cost1 = 0;
        long cost2 = k;
        for(int i = 0; i < arr.length; i++) {
            cost1 += Math.abs(arr[i] - brr[i]);
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        for(int i = 0; i < arr.length; i++) {
            cost2 += Math.abs(arr[i] - brr[i]);
        }
        return Math.min(cost1, cost2);
    }
}
