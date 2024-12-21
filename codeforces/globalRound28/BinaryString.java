//package codeforces.globalRound28;

import java.util.Scanner;

public class BinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        StringBuilder result = new StringBuilder("");
        while (t-- > 0) {
            String s = sc.nextLine();
            int n = s.length();
            int posZero = n;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    posZero = i;
                    break;
                }
            }

            if (posZero == n) {
                result.append("1 ").append(n).append(" 1 1\n");
                continue;
            }

            int len = n - posZero;
            int l2 = 1, r2 = 1;
            String maxXorStr = "";

            for (int i = 0; i < posZero; i++) {
                StringBuilder xorStr = new StringBuilder();
                for (int j = 0; j < len; j++) {
                    xorStr.append(s.charAt(i + j) ^ s.charAt(posZero + j));
                }

                if (xorStr.toString().compareTo(maxXorStr) > 0) {
                    maxXorStr = xorStr.toString();
                    l2 = i + 1;
                    r2 = i + len;
                }
            }

            result.append("1 ").append(n).append(" ").append(l2).append(" ").append(r2).append("\n");
        }
        System.out.println(result);
    }
}