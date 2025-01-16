//package codeforces.round996div2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoFrogs {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while(t-->0){
            String[] input = bf.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int a = Integer.parseInt(input[1]);
            int b = Integer.parseInt(input[2]);
            if((Math.abs(a-b)&1)==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
