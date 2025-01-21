// package round998div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class fibbonacciss {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            solve();
        }
    }
    
    private static void solve() throws IOException {
        int[] a = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int a1 = a[0];
        int a2 = a[1];
        int a4 = a[2];
        int a5 = a[3];

        int val1 = a1 + a2;
        int val2 = a4 - a2;
        int val3 = a5 - a4;
        if(val1 == val2 && val2 == val3) System.out.println(3);
        else if(val1 == val2 || val1 == val3 || val2 == val3) System.out.println(2);
        else System.out.println(1);
    }
}
