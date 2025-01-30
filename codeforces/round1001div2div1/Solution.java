package codeforces.round1001div2div1;

import java.util.*;

public class Solution {
    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        int ans = Arrays.stream(a).sum();
        
        while (a.length > 1) {
            int[] fdiff = new int[a.length - 1];
            for (int i = 0; i < a.length - 1; i++) {
                fdiff[i] = a[i + 1] - a[i];
            }
            
            int fSum = Arrays.stream(fdiff).sum();
            
            int[] rdiff = new int[a.length - 1];
            for (int i = 0; i < a.length - 1; i++) {
                rdiff[i] = -fdiff[i];
            }
            
            for (int i = 0; i < rdiff.length / 2; i++) {
                int temp = rdiff[i];
                rdiff[i] = rdiff[rdiff.length - 1 - i];
                rdiff[rdiff.length - 1 - i] = temp;
            }
            
            int rSum = Arrays.stream(rdiff).sum();
            
            if (a[0] > a[a.length - 1]) {
                a = Arrays.copyOf(fdiff, fdiff.length);
            } else {
                a = Arrays.copyOf(rdiff, rdiff.length);
            }
            
            ans = Math.max(ans, Math.max(rSum, fSum));
        }
        
        System.out.println(ans);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            solve(scanner);
        }
        
        scanner.close();
    }
}