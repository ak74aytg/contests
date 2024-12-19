//package codeforces.towDec;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class GreedyMonocarp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            Integer chests[] = new Integer[n];
            for (int i = 0; i < n; i++) {
                chests[i] = sc.nextInt();
            }
            Arrays.sort(chests, Comparator.reverseOrder());
            int sum = 0;
            int i;
            for ( i = 0; i < n; i++) {
                if(sum+chests[i]>k){
                    break;
                }
                sum+=chests[i];
            }
            if(sum==k){
                System.out.println(0);
            }else{
                System.out.println(k-sum);
            }
        }
    }
}
