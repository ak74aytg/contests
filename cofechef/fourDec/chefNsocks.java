package cofechef.fourDec;

import java.util.Scanner;

public class chefNsocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(a>x+y){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
