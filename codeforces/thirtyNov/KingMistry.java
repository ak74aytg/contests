//package codeforces.thirtyNov;

import java.util.Scanner;

public class KingMistry {
    private static int gcd(int a, int b){
        if(a%b==0){
            return b;
        }
        return gcd(b, a%b);
    }


    private static int lcm(int a, int b){
        return (Math.abs(a*b)/gcd(a,b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(lcm(a, b));
        }
        sc.close();
    }
}
