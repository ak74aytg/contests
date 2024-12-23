//package codeforces.round995div3;

import java.io.*;
import java.util.*;

public class CountingPairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            long x = Long.parseLong(line[1]);
            long y = Long.parseLong(line[2]);

            long[] A = new long[n];  // Changed to long array
            line = br.readLine().split(" ");
            long totalSum = 0;
            for(int i = 0; i < n; i++) {
                A[i] = Long.parseLong(line[i]);
                totalSum += A[i];
            }

            long minSum = totalSum-y;
            long maxSum = totalSum-x;
            long ans = 0;
            Arrays.sort(A);
            for (int i = 0; i < n; i++) {
                long l = lowerBound(A, (minSum - A[i]));
                long r = upperBound(A, (maxSum - A[i]));
                ans += Math.max(0, r-l);
                if (l <= i && i < r) --ans;
            }
            System.out.println(ans/2);
        }
    }


    private static int lowerBound(long[] a, long key) {
        int low = 0, high = a.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (a[mid] >= key) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    // Upper Bound Implementation: Find the first index where value > key
    private static int upperBound(long[] a, long key) {
        int low = 0, high = a.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (a[mid] > key) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}