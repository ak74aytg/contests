package Concepts.stacks.monotonicStacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class TrappingRainWater {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] s = bf.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int[] prefix = new int[n];
        prefix[0] = arr[0];
//        int[] suffix = new int[n];
//        suffix[n-1] = arr[n-1];
        int suffix = arr[n-1];
        for (int i = 1; i < n; i++) {
            prefix[i] = Math.max(prefix[i-1], arr[i]);
        }
//        for (int i = n-2; i >=0; i--) {
//            suffix[i] = Math.max(suffix[i+1], arr[i]);
//        }
        int ans = 0;
        for (int i = n-2; i >= 0; i--) {
            int min = Math.min(prefix[i], suffix);
            ans += arr[i]< min ? min-arr[i] : 0;
            if(arr[i]>suffix) suffix = arr[i];
        }
        System.out.println(ans);
        System.out.println();
        System.out.println(trap(arr));
    }



    public static int trap(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n-1;

        int lmax = 0;
        int rmax = 0;

        int ans = 0;
        while(left!=right){
            int l = arr[left];
            int r = arr[right];

            int h = Math.min(lmax, rmax);
            if(h>Math.min(l, r)){
                ans+=h-Math.min(l, r);
            }

            if(lmax<l) lmax = l;
            if(rmax<r) rmax = r;
            if(l<=r) left++;
            else right--;
        }
        return ans;
    }
}
