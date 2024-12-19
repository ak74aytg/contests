package cofechef.fourDec;

import java.util.Map;
import java.util.Scanner;

public class NiceArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int floorSum = 0;
            int ceilSum = 0;
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                floorSum += Math.floorDiv(num, k);
                ceilSum += Math.ceilDiv(num, k);
            }
            if(ceilSum>=0 && floorSum<=0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
        sc.close();
    }
}
