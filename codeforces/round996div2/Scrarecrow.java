//package codeforces.round996div2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Scrarecrow {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while(t-->0){
            String[] line1 = bf.readLine().split(" ");
            int n = Integer.parseInt(line1[0]);
            int k = Integer.parseInt(line1[1]);
            int l = Integer.parseInt(line1[2]);
            int[] pos = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            k <<= 1;
            l <<=1;
            for(int i=0;i<pos.length;i++){
                pos[i]<<=1;
            }
            int time = pos[0];
            pos[0] = 0;
            int crow = k;
            int scareCrow = 1;
            while(crow<l && scareCrow<n){
                if(Math.abs(pos[scareCrow] - crow)<=time){
                    pos[scareCrow] = crow;
                }
                else if(pos[scareCrow]<=crow){
                    pos[scareCrow]+=time;
                    crow = pos[scareCrow] + k;
                    scareCrow++;
                    continue;
                }else{
                    pos[scareCrow] -= time;
                    int dis = pos[scareCrow] - crow;
                    assert ((dis&1)!=0);
                    time += dis/2;
                    pos[scareCrow] -= dis/2;
                    crow = pos[scareCrow] + k;
                    scareCrow++;
                }
            }
            if(crow<l){
                time = time + (l-crow);
            }
            System.out.println(time);
        }
    }
}
