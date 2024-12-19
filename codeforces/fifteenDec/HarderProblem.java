//package codeforces.fifteenDec;

import java.util.Arrays;
import java.util.Scanner;

public class HarderProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] freq = new int[n+1];
            Arrays.fill(freq, 0);
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                if(freq[arr[i]]==0){
                    result[i] = arr[i];
                }
                freq[arr[i]] += 1;
            }

            int j = 1;
            for (int i = 0; i < n; i++) {
                if(result[i]==0){
                    while(freq[j]!=0){
                        j++;
                    }
                    result[i] = j;
                    freq[j] += 1;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(result[i]+" ");
            }
            System.out.println();
        }
    }
}
