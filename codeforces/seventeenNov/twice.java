

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class twice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++){
            int n = sc.nextInt();
            int score = 0;
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i=0;i<n;i++){
                int num = sc.nextInt();
                map.put(num, map.getOrDefault(num , 0)+1);
            }
            for(Map.Entry<Integer, Integer> item : map.entrySet()){
                score += item.getValue()/2;
            }
            System.out.println(score);
        }
    }
}
