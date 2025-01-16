package codeforces.educationalRound173Div2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Digits {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while(t-->0){
            String[] s = bf.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int d = Integer.parseInt(s[1]);

            StringBuilder result = new StringBuilder();

            // 1 always divides
            result.append("1");

            // For n >= 2, number is divisible by 3 and 9
            if (n >= 2) {
                result.append(" 3");
                // Check 5
                if (d == 5) result.append(" 5");
                // Check 7 (only for specific n values)
                if (n >= 6) result.append(" 7");
                result.append(" 9");
            }

            System.out.println(result);
        }
    }
}
