package cofechef.starter169;

import java.util.*;
import java.io.*;

public class HammingEquivalent {
    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] input = br.readLine().trim().split(" ");
            int[] P = new int[N];
            for (int i = 0; i < N; i++) {
                P[i] = Integer.parseInt(input[i]);
            }
            boolean flag = true;
            for (int i = 1; i <= N; i++) {
                if(countSetBits(P[i-1])!=countSetBits(i)){
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}