package cofechef.twentyEighthNov;

import java.util.Arrays;
import java.util.Scanner;

public class AdjecentSumArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(n==2){
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if(num1>=num2){
                    num2 = num2-1;
                    num1 = num1-num2;
                    System.out.println("1\t"+num2+"\t"+num1);
                }else{
                    num1 = num1-1;
                    num2 = num2 - num1;
                    System.out.println(num2+"\t"+num1+"\t1");
                }
            }
            Integer[] Barr = new Integer[n - 1];
            for (int i = 0; i < n - 1; i++) {
                Barr[i] = sc.nextInt();
            }
            Integer[] sortedArr = Arrays.stream(Barr)
                    .sorted((a, b) -> a -b) // Comparator for increasing
                    .toArray(Integer[]::new);
            boolean areEqual = Arrays.equals(Barr, sortedArr);
            if(areEqual){
                int temp = sortedArr[n-2];
                sortedArr[n-2] = sortedArr[n-3];
                sortedArr[n-3] = temp;
            }
            int[] A = new int[n];
            A[0] = sortedArr[0] - 1;
            for (int i = 1; i < n; i++) {
                A[i] = sortedArr[i - 1] - A[i - 1];
            }
            for (int i = 0; i < n; i++) {
                System.out.print(A[i]+"\t");
            }
        }
    }
}
