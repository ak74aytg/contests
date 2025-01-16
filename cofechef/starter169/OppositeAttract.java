package cofechef.starter169;

import java.util.Scanner;

public class OppositeAttract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if(s.charAt(i)=='1'){
                    ans.append("0");
                }else{
                    ans.append("1");
                }
            }
            System.out.println(ans);
        }
    }
}
