package cofechef.eighteenDec;

import java.util.Scanner;

public class PosterPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // Maximum length
            int M = sc.nextInt(); // Maximum width
            int K = sc.nextInt(); // Target perimeter

            int minDifference = Integer.MAX_VALUE;

            // Iterate over all possible lengths and widths
            for (int l = 1; l <= N; l++) {
                for (int w = 1; w <= M; w++) {
                    int perimeter = 2 * (l + w); // Calculate the perimeter
                    int difference = Math.abs(perimeter - K); // Calculate the difference

                    // Update the minimum difference
                    if (difference < minDifference) {
                        minDifference = difference;
                    }
                }
            }

            // Output the result for this test case
            System.out.println(minDifference);
        }

        sc.close();
    }
}
