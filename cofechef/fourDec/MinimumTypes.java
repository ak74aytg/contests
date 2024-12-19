package cofechef.fourDec;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MinimumTypes {

    private static class Pair implements Comparable<Pair> {
        int amt;
        int qty;
        int sum;
        Pair(int amt, int qty, int sum){
            this.amt =amt;
            this.qty = qty;
            this.sum = sum;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "amt=" + amt +
                    ", qty=" + qty +
                    ", sum=" + sum +
                    '}';
        }

        @Override
        public int compareTo(Pair o) {
            return o.sum-this.sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            Pair[] value = new Pair[n];
            for (int i = 0; i < n; i++) {
                value[i] = new Pair(sc.nextInt(), 0, 0);
            }

            for (int i = 0; i < n; i++) {
                value[i].qty = sc.nextInt();
                value[i].sum = value[i].qty*value[i].amt;
            }

            Arrays.sort(value);

            int sum = 0;

            int i = 0;
            for (i=0; i < n; i++) {
                sum+=value[i].sum;
                if(sum>=x){
                    break;
                }
            }
            if(i==n) System.out.println(-1);
            else System.out.println(i+1);
        }
        sc.close();
    }
}
