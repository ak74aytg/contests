//package codeforces.fifteenDec;

import java.util.*;

public class AdranalineRush {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input reading
        int n = scanner.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }

        // Find longest sequence of overtakes
        List<int[]> overtakes = findLongestOvertakes(n, c);

        // Output results
        System.out.println(overtakes.size());
        for (int[] overtake : overtakes) {
            System.out.println(overtake[0] + " " + overtake[1]);
        }

        scanner.close();
    }


    public static List<int[]> findLongestOvertakes(int n, int[] targetOrder) {
        List<int[]> overtakes = new ArrayList<>();
        int[] currentOrder = new int[n];
        Set<String> swappedPairs = new HashSet<>();

        // Initialize the current order [1, 2, ..., n]
        for (int i = 0; i < n; i++) {
            currentOrder[i] = i + 1;
        }

        // Map car number to its position in the targetOrder
        int[] targetPosition = new int[n + 1];
        for (int i = 0; i < n; i++) {
            targetPosition[targetOrder[i]] = i;
        }

        // Transform currentOrder to targetOrder using bubble sort
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (targetPosition[currentOrder[j]] > targetPosition[currentOrder[j + 1]]) {
                    // Record the overtake
                    overtakes.add(new int[]{currentOrder[j], currentOrder[j + 1]});

                    // Track swapped pairs
                    swappedPairs.add(currentOrder[j] + "," + currentOrder[j + 1]);
                    swappedPairs.add(currentOrder[j + 1] + "," + currentOrder[j]);

                    // Swap the cars
                    int temp = currentOrder[j];
                    currentOrder[j] = currentOrder[j + 1];
                    currentOrder[j + 1] = temp;
                }
            }
        }

        // Add extra swaps for all remaining swappable pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String pair1 = currentOrder[i] + "," + currentOrder[j];
                String pair2 = currentOrder[j] + "," + currentOrder[i];
                if (!swappedPairs.contains(pair1) && !swappedPairs.contains(pair2)) {
                    // Perform two additional overtakes for the pair
                    overtakes.add(new int[]{currentOrder[j], currentOrder[i]}); // Swap out of order
                    overtakes.add(new int[]{currentOrder[i], currentOrder[j]}); // Swap back to original order

                    // Mark the pair as swapped
                    swappedPairs.add(pair1);
                    swappedPairs.add(pair2);
                }
            }
        }
        return overtakes;
    }
}
