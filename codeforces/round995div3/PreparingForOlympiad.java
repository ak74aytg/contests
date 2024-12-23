//package codeforces.round995div3;

import java.util.Scanner;

public class PreparingForOlympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] A = new int[n];
            int[] B = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                B[i] = sc.nextInt();
            }

            int sum = 0;
            for(int i=n-1;i>=0;i--){
                if(i==n-1){
                    sum += A[i];
                    continue;
                }
                int currSum = A[i] - B[i + 1];
                if(currSum >0){
                    sum+= currSum;
                }
            }
            System.out.println(sum);
        }
    }
}
