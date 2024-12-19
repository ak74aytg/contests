//package codeforces.fifteenDec;

import java.util.Scanner;

public class hardProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int val = Math.min(m, a)+Math.min(m, b);
            System.out.println(Math.min(2*m, val+c));
        }
    }
}
