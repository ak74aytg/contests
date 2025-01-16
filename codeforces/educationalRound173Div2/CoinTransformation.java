//package codeforces.educationalRound173Div2;
import java.util.Scanner;

public class CoinTransformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long n = scanner.nextLong();
            System.out.println(getMaxCoins(n));
        }
        scanner.close();
    }

    static long getMaxCoins(long n) {
        if (n <= 3) return 1;
        return 2 * getMaxCoins(n / 4);
    }
}
