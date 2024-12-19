package cofechef.twentyEighthNov;

import java.util.Scanner;

public class AsgScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int totalScore = 0;
            for(int i=0;i<n;i++){
                totalScore += sc.nextInt();
            }
            int minScore = (100*(n+1))/2;
            int scoreNeeded = minScore-totalScore;
            if(scoreNeeded>100){
                System.out.println(-1);
            }else if(scoreNeeded>0){
                System.out.println(scoreNeeded);
            }else{
                System.out.println(0);
            }
        }
        sc.close();
    }
}
