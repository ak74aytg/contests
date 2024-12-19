//package codeforces.fiveDec;

import java.util.Scanner;

public class LineBreaks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            int totalSize = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                String s = sc.nextLine();
                totalSize += s.length();
                if(totalSize<=m) max++;
            }
            System.out.println(max);
        }
    }
}
