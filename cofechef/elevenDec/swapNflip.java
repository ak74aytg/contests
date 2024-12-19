package cofechef.elevenDec;

import java.util.Scanner;

public class swapNflip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            // Read the length of the strings
            int N = sc.nextInt();
            sc.nextLine();

            // Read the two binary strings S and T
            String S = sc.nextLine();
            String T = sc.nextLine();

            // Solve for the current test case
            if (canTransform(S, T, N)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }


    private static boolean canTransform(String S, String T, int N) {
        boolean hasZero = false;
        boolean hasOne = false;

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '0') hasZero = true;
            if (S.charAt(i) == '1') hasOne = true;

            // If S and T differ at position i and we cannot resolve it, return false
            if (S.charAt(i) != T.charAt(i)) {
                // We need both '0' and '1' to resolve a mismatch
                if (!(hasZero && hasOne)) {
                    return false;
                }
            }
        }

        // If all mismatches can be resolved, return true
        return true;
    }

}
