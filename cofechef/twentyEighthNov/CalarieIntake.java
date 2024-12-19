package cofechef.twentyEighthNov;

import java.util.Scanner;

public class CalarieIntake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        if(X<Y*Z){
            System.out.println(-1);
        }else{
            int MoreCanEat = X - Y*Z;
            System.out.println(MoreCanEat);
        }
        sc.close();
    }
}
