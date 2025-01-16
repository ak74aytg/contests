//package codeforces.hello2025;

import java.io.*;
import java.util.*;

public class gorillaNexam {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            solve();
        }
        out.flush();
    }

    static void solve() throws IOException {
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        int[] a = new int[n];
        String[] arr = br.readLine().split(" ");

        // If we can change all elements or array has only one element
        if (k >= n - 1 || n == 1) {
            out.println(1);
            return;
        }

        // Count frequencies and store in array for faster access
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(arr[i]);
            freqMap.put(a[i], freqMap.getOrDefault(a[i], 0) + 1);
        }

        int[] frequencies = new int[freqMap.size()];
        int idx = 0;
        for (int freq : freqMap.values()) {
            frequencies[idx++] = freq;
        }
        Arrays.sort(frequencies);

        // Binary search for the minimum number of groups
        int left = 1, right = freqMap.size();
        int ans = right;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (canAchieve(frequencies, mid, n, k)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        out.println(ans);
    }

    static boolean canAchieve(int[] frequencies, int groups, int n, int k) {
        int elementsAccounted = 0;
        // Take the largest 'groups' frequencies
        for (int i = frequencies.length - 1; i >= frequencies.length - groups; i--) {
            if (i >= 0) {
                elementsAccounted += frequencies[i];
            }
        }
        return (n - elementsAccounted) <= k;
    }
}