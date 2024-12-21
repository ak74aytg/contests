//package codeforces.round994div2;

import java.util.HashMap;
import java.util.Scanner;

public class MEXdestruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            int zeroCount = 0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                arr[i] = num;
                if(num==0) zeroCount++;
            }
            if(zeroCount==n){
                System.out.println(0);
                continue;
            }
            if(zeroCount==0){
                System.out.println(1);
                continue;
            }

            int Leftcount = 0;
            int Rightcount = 0;
            for (int i = 0; i < n/2; i++) {
                if(arr[i]!=0){
                    break;
                }
                Leftcount++;
            }
            for (int i = n/2; i >= 0; i--) {
                if(arr[i]!=0){
                    break;
                }
                Rightcount++;
            }

            if(Leftcount==zeroCount || Rightcount==zeroCount || Leftcount+Rightcount==zeroCount){
                System.out.println(1);
            }else{
                System.out.println(2);
            }
        }
    }
}
