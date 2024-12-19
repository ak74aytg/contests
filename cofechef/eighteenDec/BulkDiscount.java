package cofechef.eighteenDec;

import java.util.Arrays;
import java.util.Scanner;

public class BulkDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] prices = new int[n];
            for (int i = 0; i < n; i++) {
                prices[i] = sc.nextInt();
            }
            mergeSort(prices);
            int totalPrice = 0;
            for(int i=0;i<prices.length;i++){
                totalPrice += i>prices[i]?0:prices[i]-i;
            }
            System.out.println(totalPrice);
        }
    }


    public static void mergeSort(int[] array) {
        // Base case: If the array has 1 or no elements, it's already sorted
        if (array.length < 2) {
            return;
        }

        // Step 1: Divide the array into two halves
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        // Step 2: Recursively sort both halves
        mergeSort(left);
        mergeSort(right);

        // Step 3: Merge the sorted halves
        merge(array, left, right);
    }


    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Compare elements from left and right arrays and insert into the main array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy any remaining elements from the left array
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Copy any remaining elements from the right array
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}
