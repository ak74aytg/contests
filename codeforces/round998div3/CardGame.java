// package round998div3;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class CardGame {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int m = sc.nextInt();

                HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
                boolean isPossible = true;
                for(int i=0;i<n;i++){
                    PriorityQueue<Integer> q = new PriorityQueue<>();
                    for(int j=0;j<m;j++){
                        int num = sc.nextInt();
                        if(j!=0){
                            int top = q.peek();
                            if(Math.abs(top - num) % n != 0 ){
                                isPossible = false;
                            }
                        }
                        q.add(num);
                    }
                    map.put(i+1, q);
                }
                if(!isPossible) System.out.println(-1);
                else{
                    int[] ans = new int[n];
                    for(Map.Entry<Integer, PriorityQueue<Integer>> entry : map.entrySet()){
                        int idx = entry.getValue().peek()%n;
                        ans[idx] = entry.getKey();
                    }
                    for(int num : ans) System.out.print(num+" ");
                    System.out.println( );
                }
            }
            sc.close();
        }
}
