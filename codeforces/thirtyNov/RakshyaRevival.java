//package codeforces.thirtyNov;

import java.util.Scanner;

public class RakshyaRevival {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int[] spots = new int[n];
            for (int i = 0; i < n; i++) {
                spots[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
            }

            int ans = 0;
            int i = 0;
            while (i <= n - m) {
                boolean isWeak = true;
                for (int j = i; j < i + m; j++) {
                    if (spots[j] == 1) {
                        isWeak = false;
                        break;
                    }
                }

                if (isWeak) {
                    ans++;
                    int strengthenStart = Math.max(i + m - 1, 0);
                    int strengthenEnd = Math.min(strengthenStart + k, n);
                    for (int l = strengthenStart; l < strengthenEnd; l++) {
                        spots[l] = 1;
                    }
                    i += m+k-1;
                } else {
                    i++;
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
