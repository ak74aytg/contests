package leetcode.biweekly145;

import java.util.ArrayList;
import java.util.List;

public class MinTimeLockBreak {
    public static int findMinimumTime(List<Integer> strength, int K){
        boolean[] visited = new boolean[strength.size()];
        List<Integer> temp = new ArrayList<>();
        return findMinimumTime(visited, temp, strength, K, strength.size());
    }

    private static int findMinimumTime(boolean[] visited, List<Integer> temp, List<Integer> strength, int k, int i){
        if(i==0){
            return calculateTime(temp, k);
        }
        int minTime = Integer.MAX_VALUE;
        for (int j = 0; j < strength.size(); j++) {
            if(!visited[j]){
                visited[j] = true;
                temp.add(strength.get(j));
                minTime = Math.min(findMinimumTime(visited, temp, strength, k, i-1), minTime);
                visited[j] = false;
                temp.remove(temp.size()-1);
            }
        }
        return minTime;
    }


    private static int calculateTime(List<Integer> list, int k){
        int time = 0;
        int x = 1;
        for (int i = 0; i < list.size(); i++) {
            int strength = list.get(i);
            time += Math.ceilDiv(strength, x);
            x+=k;
        }
        return time;
    }

    public static void main(String[] args) {
        int k = 1;
        List<Integer> strength = new ArrayList<>();
        strength.add(1);
        strength.add(3);
        strength.add(4);
        System.out.println(findMinimumTime(strength, k));
    }
}
