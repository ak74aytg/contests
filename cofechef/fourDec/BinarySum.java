package cofechef.fourDec;

import java.util.Scanner;

public class BinarySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            if(n%2==0){
                if(n/2==k)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }else{
                if(Math.ceilDiv(n, 2)==k || Math.floorDiv(n, 2)==k){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }
    }
}
