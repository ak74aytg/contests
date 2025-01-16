package cofechef.starter168;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MakeOdd {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        StringBuilder result = new StringBuilder();
        while(t-->0){
            int n = Integer.parseInt(bf.readLine());
            String a = bf.readLine();
            String b = bf.readLine();
            boolean found = false;
            int count = 0;
            for (int i = 0; i < a.length(); i++) {
                if((a.charAt(i)!=b.charAt(i))){
                    result.append("yes");
                    found = true;
                    break;
                }
                if(a.charAt(i)=='1' && b.charAt(i)=='1'){
                    count++;
                }
            }
            if(!found && (count&1)==0) result.append("no");
            else if(!found && (count&1)!=0) result.append("yes");
            result.append("\n");
        }
        System.out.println(result);
    }
}
