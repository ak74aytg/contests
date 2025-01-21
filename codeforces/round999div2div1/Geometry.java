// package round999div2div1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            boolean hasSqauare = false;
            List<Integer> sides = new ArrayList<>();
            PriorityQueue<Integer> bases = new PriorityQueue<>();

            for (Map.Entry<Integer, Integer> item : map.entrySet()) {
                if (item.getValue() >= 2){
                    sides.add(item.getKey());
                    int remaining = item.getValue()-2;
                    while(remaining > 0){
                        bases.add(item.getKey());
                        remaining -= 1;
                    }
                }else bases.add(item.getKey());
            }

            if (sides.size() == 0){
                System.out.println(-1);
            } else if(sides.size()>1){
                System.out.println(sides.get(0)+" "+sides.get(0)+" "+sides.get(1)+" "+sides.get(1));
            }
            else {
                int height = sides.get(0);
                // a - b < 2 * height
                
                boolean found = false;
                while(!bases.isEmpty() && !found){
                    int a = bases.poll();
                    if(bases.isEmpty()) break;
                    int b = bases.peek();
                    if(2*height > Math.abs(a-b)){
                        found = true;
                        System.out.println(height+" "+height+" "+a+" "+b);
                    }
                }
                if(!found) System.out.println(-1);
            }
        }
        sc.close();
    }
}
