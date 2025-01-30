package Concepts.binary_search;

import java.util.Scanner;

public class coin_n_triangle {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
        sc.close();
    }
    
    private static void solve() {
        int n = sc.nextInt();
        long high = n;
        long low = 0;
        while(low<=high){
            long mid = low + (high - low ) /2;
            long coins = mid * (mid + 1) / 2;

            if(coins <= n){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        System.out.println(low - 1);
        return;
    }
}