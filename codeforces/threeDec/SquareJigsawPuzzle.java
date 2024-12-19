//package codeforces.threeDec;

import java.util.Scanner;

public class SquareJigsawPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int sum = 0;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
                double sqrt = Math.sqrt(sum);
                if(sqrt==(int)sqrt && sqrt%2!=0){
                    ans++;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
