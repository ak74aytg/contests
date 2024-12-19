import java.util.Arrays;

public class MergeSort {
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
