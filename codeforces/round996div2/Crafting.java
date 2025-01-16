//package codeforces.round996div2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Crafting {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(bf.readLine());
            long[] a = Arrays.stream(bf.readLine()
                            .split(" "))
                    .mapToLong(Long::parseLong)
                    .toArray();
            long[] b = Arrays.stream(bf.readLine()
                            .split(" "))
                    .mapToLong(Long::parseLong)
                    .toArray();
            int count = 0;
            long mDif = 0;
            int idx = -1;
            for (int i = 0; i < n; i++) {
                if(a[i]<b[i]){
                    mDif = Math.max(b[i]-a[i], mDif);
                    count++;
                    idx = i;
                }
            }
            if(count==0){
                System.out.println("YES");
                continue;
            }
            if(count>1){
                System.out.println("NO");
                continue;
            }
            long diff = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if(i!=idx){
                    diff = Math.min(a[i]-b[i], diff);
                }
            }
            if(diff<mDif) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
