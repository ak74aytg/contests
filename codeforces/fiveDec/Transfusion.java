//package codeforces.fiveDec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transfusion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long sumEven = 0;
            long sumOdd = 0;
            for (int i = 0; i < n; i++) {
                long num = sc.nextInt();
                if(i%2==0) sumEven+=num;
                else sumOdd+=num;
            }
            int odd = n/2;
            int even = n-odd;

            if(sumEven%even!=0 || sumOdd%odd!=0){
                System.out.println("no");
                continue;
            }
            if(sumEven/even == sumOdd/odd) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
