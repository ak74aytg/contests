package cofechef.starter168;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinaryRemovals {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while(t-->0){
            String[] inputLine1 = bf.readLine().split(" ");
            String s = bf.readLine();
            int n = Integer.parseInt(inputLine1[0]);
            int x = Integer.parseInt(inputLine1[1]);
            int k = Integer.parseInt(inputLine1[2]);
            int zeros = 0;
            int ones = 0;
            int sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                zeros += s.charAt(i)=='0' ? 1 : 0;
                ones += s.charAt(i)=='1' ? 1 : 0;
                if(s.charAt(i)=='0'){
                    sum+=count;
                }else{
                    count++;
                }
            }
            if(zeros==n || ones==n){
                System.out.println(1);
                continue;
            }
            if(s.charAt(0)=='0'){
                System.out.println(2);
                continue;
            }
            if(sum<=x && sum%k==0){
                System.out.println(1);
                continue;
            }
            System.out.println(2);
        }
    }
}
