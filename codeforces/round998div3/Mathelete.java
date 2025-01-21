// package round998div3;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.lang.Math;

public class Mathelete {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
                while(t-->0){
                    int n = sc.nextInt();
                    int k = sc.nextInt();
                    TreeMap<Integer, Integer> map = new TreeMap<>();
                    for (int i = 0; i < n; i++) {
                        int num = sc.nextInt();
                        map.put(num, map.getOrDefault(num, 0)+1);
                    }
                    int score = 0;
                    HashSet<Integer> set = new HashSet<>();
                    for(Map.Entry<Integer, Integer> item : map.entrySet()){
                        if(map.containsKey(k - item.getKey()) && 2*item.getKey()!=k && !set.contains(k - item.getKey())){
                            score += Math.min(item.getValue(), map.get(k - item.getKey()));
                            set.add(k - item.getKey());
                        }
                        if(2*item.getKey()==k){
                            score += item.getValue()/2;
                        }
                        set.add(item.getKey());
                    }
                    System.out.println(score);
                }
            sc.close();
        }
}
