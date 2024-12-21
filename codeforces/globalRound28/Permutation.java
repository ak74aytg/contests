//package codeforces.globalRound28;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        StringBuilder result = new StringBuilder("");
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(k==1 || k==n){
                for (int i = 1; i < n+1; i++) {
                    result.append(i+" ");
                }
                result.append("\n");
                continue;
            }
            int[] arr = new int[n];
            int num = 1;
            for (int i = k-1; i < n; i+=k) {
                arr[i] = num;
                num++;
            }
            for (int i = 0; i < n; i++) {
                if(arr[i]==0){
                    arr[i] = num;
                    num++;
                }
            }
            for (int i = 0; i < n; i++) {
                result.append(arr[i]+" ");
            }
            result.append("\n");
        }
        System.out.println(result);
    }
}
