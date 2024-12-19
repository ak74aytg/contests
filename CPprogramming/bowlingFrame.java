//package CPprogramming;

import java.util.Scanner;
public class bowlingFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-- > 0) {
            int w = sc.nextInt();
            int b = sc.nextInt();
            int sum = w+b;
            int required = 0;
            int row = 1;
            while(sum>required){
                required = required+row;
                row++;
            }
            if(sum==required) System.out.println(row-1);
            else System.out.println(row-2);
        }
    }
}
