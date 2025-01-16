package cofechef.starter169;

import java.util.Scanner;

public class EntryCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>=10){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
