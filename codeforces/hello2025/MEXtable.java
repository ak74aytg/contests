//package codeforces.hello2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MEXtable {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while(t-->0){
            String[] input = bf.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);

            int ans = Math.max(n, m) + 1;
            System.out.println(ans);
        }
    }
}
