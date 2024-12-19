package cofechef.elevenDec;

import java.util.Map;
import java.util.Scanner;

public class ItzSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();

            int sum = 0;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                sum+=num;
                max = Math.max(max, num);
            }
            sum = sum-max;
            int ved = k + max;
            int var = p + sum;
            if(ved>var){
                System.out.println("Ved");
            } else if (ved<var) {
                System.out.println("varun");

            }else{
                System.out.println("equal");
            }
        }
    }
}
