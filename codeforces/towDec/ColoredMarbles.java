//package codeforces.towDec;

import java.util.*;

public class ColoredMarbles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> marbles = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                marbles.put(a, marbles.getOrDefault(a, 0) + 1);
            }
            int singleColored = 0;
            int multipleColored = 0;
            for (Map.Entry<Integer, Integer> items : marbles.entrySet()){
                if(items.getValue()==1){
                    singleColored++;
                }else{
                    multipleColored++;
                }
            }

            singleColored = 2*Math.ceilDiv(singleColored, 2);
            System.out.println(singleColored+multipleColored);
        }
    }
}
