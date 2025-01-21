// package round997div2;

import java.util.Scanner;

public class StampPerimeter {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
                while(t-->0){
                    int n = sc.nextInt();
                    int m = sc.nextInt();
                    int[] x = new int[n];
                    int[] y = new int[n];
                    for (int i = 0; i < n; i++) {
                        x[i] = sc.nextInt();
                        y[i] = sc.nextInt();
                    }
                    int maxPerimeter = n*(4*m);
                    int diff = 0;
                    for (int i = 1; i < n; i++) {
                        diff += 2*m - x[i] - y[i];
                    }
                    System.out.println(maxPerimeter - 2*diff);
                }
            sc.close();
        }
}