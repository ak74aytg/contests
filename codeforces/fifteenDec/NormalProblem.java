//package codeforces.fifteenDec;

import java.util.Scanner;

public class NormalProblem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            StringBuilder a = new StringBuilder(s);

            StringBuilder b = a.reverse();
            for (int i = 0; i < b.length(); i++) {
                if(b.charAt(i)!='w'){
                    if(b.charAt(i)=='q'){
                        b.setCharAt(i, 'p');
                    }else{
                        b.setCharAt(i, 'q');
                    }
                }
            }

            System.out.println(b.toString());
        }
    }
}
