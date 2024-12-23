package leetcode.biweekly146;

import java.nio.channels.Pipe;
import java.util.Arrays;

public class CanCutIntoSection {
    public static void main(String[] args) {
//        int[][] num = new int[][]{{1,0,5,2},{0,2,2,4},{3,2,5,3},{0,4,4,5}};
//        int[][] num = new int[][]{{0,0,1,1},{2,0,3,4},{0,2,2,3},{3,0,4,3}};
//        [[0,2,2,4],[1,0,3,2],[2,2,3,4],[3,0,4,2],[3,2,4,4]]
        int[][] num = new int[][]{{0,2,2,4},{1,0,3,2},{2,2,3,4},{3,0,4,2},{3,2,4,4}};
        int n = 4;
        System.out.println(checkValidCuts(n, num));
    }


    private static class Pairs implements Comparable<Pairs>{
        int upperLimit;
        int lowerLimit;
        Pairs(int up, int lo){
            this.upperLimit = up;
            this.lowerLimit = lo;
        }

        @Override
        public int compareTo(Pairs o) {
            return (this.lowerLimit==o.lowerLimit ? o.upperLimit - this.upperLimit : this.lowerLimit-o.lowerLimit);
        }
    }

    public static boolean checkValidCuts(int n, int[][] rectangles) {
        return checkHorizontal(n, rectangles) || checkVertical(n, rectangles);
    }

    private static boolean checkHorizontal(int n, int[][] rectangle){
        Pairs[] list = new Pairs[rectangle.length];
        for (int i = 0; i < rectangle.length; i++) {
            Pairs pairs = new Pairs(rectangle[i][3], rectangle[i][1]);
            list[i]=pairs;
        }
        Arrays.sort(list);
        int idx = 1;
        int ans = 0;
        while(idx!=list.length){
            if(list[idx-1].lowerLimit!=list[idx].lowerLimit){
                idx++;
            }else{
                while(idx< list.length && list[idx-1].lowerLimit==list[idx].lowerLimit){
                    idx++;
                }
            }
            ans++;
        }
        return ans>=3;
    }

    private static boolean checkVertical(int n, int[][] rectangle){
        Pairs[] list = new Pairs[rectangle.length];
        for (int i = 0; i < rectangle.length; i++) {
            Pairs pairs = new Pairs(rectangle[i][2], rectangle[i][0]);
            list[i]=pairs;
        }
        Arrays.sort(list);
        int idx = 1;
        int ans = 0;
        while(idx!=list.length){
            if(list[idx-1].lowerLimit!=list[idx].lowerLimit){
                idx++;
            }else{
                while(idx< list.length && list[idx-1].lowerLimit==list[idx].lowerLimit){
                    idx++;
                }
            }
            ans++;
        }
        return ans>=3;
    }
}
