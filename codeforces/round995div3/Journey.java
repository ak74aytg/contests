//package codeforces.round995div3;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();


            int three = a+b+c;

            int days = 3*(n/three);
            n = n%three;
            if(n>0){
                n-=a;
                days++;
            }
            if(n>0){
                n-=b;
                days++;
            }
            if(n>0){
                n-=c;
                days++;
            }
            System.out.println(days);
        }
    }
}
