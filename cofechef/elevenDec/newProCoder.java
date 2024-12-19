package cofechef.elevenDec;

import java.util.Scanner;

public class newProCoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(Math.ceilDiv(n,2)>m){
            System.out.println("PRO");
        }else{
            System.out.println("newbie");
        }
    }
}
