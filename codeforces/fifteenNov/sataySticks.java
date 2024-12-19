import java.util.Arrays;
import java.util.Scanner;

public class sataySticks {

    public static String solution(int n , int[] sticks){
//        int[] sortedSticks = Arrays.copyOf(sticks, n);
//        Arrays.sort(sortedSticks);
        for(int i=0;i<n-1;i++){
            if(sticks[i]>sticks[i+1] && sticks[i]-sticks[i+1]==1){
                int temp = sticks[i];
                sticks[i] = sticks[i+1];
                sticks[i+1] = temp;
            }
        }

//        for(int i=0;i<n;i++){
//            if(sortedSticks[i]!=sticks[i]){
//                return "NO";
//            }
//        }
//        return "YES";
        for (int i = 1; i < sticks.length; i++) {
            if (sticks[i] < sticks[i - 1]) {
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int[] sticks = new int[n];

            for (int j = 0; j < n; j++) {
                sticks[j] = sc.nextInt();
            }
            System.out.println();
            System.out.println(solution(n, sticks));
        }
        sc.close();
    }
}
