package codeforces.round1001div2div1;

import java.util.Scanner;

public class clockwalk {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        boolean flag = false;
        for (int pos = 0; pos < n; pos++) {
            if (a[pos] <= 2 * Math.min(pos, n - pos - 1)) {
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("NO");
        else System.out.println("YES");
    }
}
