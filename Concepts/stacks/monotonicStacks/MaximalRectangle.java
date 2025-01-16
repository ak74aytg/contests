package Concepts.stacks.monotonicStacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximalRectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
//        input = input.replace("\\[\\[", "")
//                .replace("\\]\\]", "")
//                .replace("\\],\\[", "#")
//                .replace("\"", "");


        input = input.replaceAll("\\[\\[", "")
                .replaceAll("]]", "")
                .replaceAll("\\],\\[", "#")
                .replaceAll("\"", "");



        String[] s = input.split("#");
        int row = s.length;
        int col = s[0].split(",").length;

        char[][] arr = new char[row][col];
        for (int i = 0; i < row; i++) {
            String[] element = s[i].split(",");
            for (int j = 0; j < col; j++) {
                arr[i][j] = element[j].charAt(0);
            }
        }

        System.out.println(maximalRectangle(arr));
    }


    public static int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i==0){
                    if(matrix[i][j]=='1'){
                        arr[i][j] = 1;
                    }
                }else{
                    if(matrix[i][j]=='1'){
                        arr[i][j] = arr[i-1][j]+1;
                    }
                }
            }
        }
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int area = LargestRectangleInHistogram.largestRectangleArea(arr[i]);
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}
