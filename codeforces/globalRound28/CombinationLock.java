//package codeforces.globalRound28;

import java.util.Scanner;

public class CombinationLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder result = new StringBuilder("");
        while(t-->0){
            int x = sc.nextInt();

            if(x%33==0){
                result.append("YES\n");
            }else{
                result.append("NO\n");
            }
        }
        System.out.println(result);
    }
}
