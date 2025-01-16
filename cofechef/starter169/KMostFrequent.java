package codechef.starter169;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KMostFrequent {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            String[] l1 = bf.readLine().split(" ");
            int n = Integer.parseInt(l1[0]);
            int k = Integer.parseInt(l1[1]);
            int[] a = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] freq = new int[21];
            for (int i = 0; i < n; i++) {
                freq[a[i]]++;
            }
            if(check(freq, k)) System.out.println(0);
            else if (a[0]==k || a[n-1]==k) System.out.println(1);
            else {
                //prefix
                int[] temp = Arrays.copyOf(freq, freq.length);
                if(prefix(a,temp, k, n)) System.out.println(1);
                else if (suffix(a,freq, k, n)) System.out.println(1);
                else System.out.println(2);
            }
        }
    }

    private static boolean prefix(int[] a,int[] freq, int k, int n){
        for (int i = 0; i < n; i++) {
            freq[a[i]]--;
            if(freq[k]==0) return false;
            if(check(freq, k)) return true;
        }
        return false;
    }

    private static boolean suffix(int[] a,int[] freq, int k, int n){
        for (int i = n-1; i >= 0; i--) {
            freq[a[i]]--;
            if(freq[k]==0) return false;
            if(check(freq, k)) return true;
        }
        return false;
    }

    private static boolean check(int[] freq, int k){
        for (int i = 0; i < 21; i++) {
            if(freq[i]>freq[k]) return false;
        }
        return true;
    }
}