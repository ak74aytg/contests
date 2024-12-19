//package codeforces.fifteenDec;

import java.util.Scanner;

public class InsaneProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long k = sc.nextLong();
            long l1 = sc.nextLong();
            long r1 = sc.nextLong();
            long l2 = sc.nextLong();
            long r2 = sc.nextLong();

            long p = 1;
            long count = 0;
            while(p<=1e9){
                count+=Math.max(Math.min(r2/p, r1) - Math.max(Math.ceilDiv(l2, p), l1)+1, 0);
                p*=k;
            }
            System.out.println(count);
        }
    }
}




