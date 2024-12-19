package cofechef.twentyEighthNov;

import java.util.Scanner;

public class permutationModK {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int rotate = k%n;
            int[] permutations = new int[n];
            for (int i = 0; i <n; i++) {
                permutations[i] = i+1;
            }
            if(rotate==0){
                print(permutations);
            }else{
                rotateArray(permutations, rotate);
                print(permutations);
            }
        }
    }

    private static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

    private static void rotateArray(int[] arr, int r) {
        int n = arr.length;
        r = r % n;  // In case r is larger than n, we only need to rotate r % n times
        if (r == 0) return;  // No need to rotate if r is 0

        // Reverse the whole array
        reverse(arr, 0, n - 1);

        // Reverse the first r elements
        reverse(arr, 0, r - 1);

        // Reverse the remaining n - r elements
        reverse(arr, r, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
