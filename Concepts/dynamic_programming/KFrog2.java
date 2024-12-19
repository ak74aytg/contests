package Concepts.dynamic_programming;

import java.util.Scanner;

public class KFrog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int heights[] = new int[N];

        for(int i=0;i<N;i++){
            heights[i] = sc.nextInt();
        }

        int[] cost = new int[N];
        cost[0] = 0;
        cost[1] = Math.abs(heights[0]-heights[1]);
        for(int i=2;i<N;i++){
            int currCost = Integer.MAX_VALUE;
            for (int j=1;j<=K;j++){
                if(j>i){
                    break;
                }
                int temp = (Math.abs(heights[i-j]-heights[i])+cost[i-j]);
                currCost = Math.min(currCost, temp);
            }
            cost[i] = currCost;
        }
        System.out.println(cost[N-1]);
        sc.close();
    }
}
