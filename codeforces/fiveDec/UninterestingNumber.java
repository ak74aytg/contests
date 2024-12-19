//package codeforces.fiveDec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class UninterestingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            List<Integer> list = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            int sum = 0;
            while(n!=0){
                int num = (int) (n%10);
                list.add(0, num);
                map.put(num, map.getOrDefault(num, 0)+1);
                sum+= num;
                n=n/10;
            }

            int two = map.get(2)!=null?map.get(2):0;
            int three = map.get(3)!=null?map.get(3):0;

            if(check(list, two, three, sum)) System.out.println("yes");
            else System.out.println("no");
        }
    }

    private static boolean check(List<Integer> list, int n, int m, int sum){
        if(sum%9==0){
            return true;
        }

        if(n==0 && m==0){
            return false;
        }

        boolean opt1 = n>0 ? check(list, n-1, m, sum+2) : false;
        boolean opt2 = m>0 ? check(list, n, m-1, sum+6) : false;

        return opt2 || opt1;
    }
}
