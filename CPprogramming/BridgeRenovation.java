//package CPprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BridgeRenovation {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] lengths = {18, 21, 25};
        List<Integer> pieces = new ArrayList<>();

        for (int length : lengths) {
            for (int i = 0; i < n; i++) {
                pieces.add(length);
            }
        }

        Collections.sort(pieces, Collections.reverseOrder());

        int plankCount = 0;

        while (!pieces.isEmpty()) {
            plankCount++;
            int remainingLength = 60;

            for (int i = 0; i < pieces.size(); ) {
                if (pieces.get(i) <= remainingLength) {
                    remainingLength -= pieces.get(i);
                    pieces.remove(i);
                } else {
                    i++;
                }
            }
        }

        System.out.println(plankCount);
    }
}