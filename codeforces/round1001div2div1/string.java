// package codeforces.round1001div2div1;

import java.util.Scanner;

public class string {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
        sc.close();
    }
    
    private static void solve() {
        String s = sc.nextLine();
        System.out.println(s);
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        // System.out.println(count);
    }
}
