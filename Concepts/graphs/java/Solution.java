package Concepts.graphs.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] dist = new int[rows][cols];
        
        // Initialize distance matrix with INT_MAX
        for (int i = 0; i < rows; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        
        // Iterate through the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    dist[i][j] = 0;
                } else {
                    int[] drow = {-1, 0, 1, 0};
                    int[] dcol = {0, 1, 0, -1};
                    
                    for (int k = 0; k < 4; k++) {
                        int row = i + drow[k];
                        int col = j + dcol[k];
                        
                        if (row >= 0 && col >= 0 && row < rows && col < cols) {
                            dist[row][col] = Math.min(dist[i][j] + 1, dist[row][col]);
                        }
                    }
                }
            }
        }
        
        // Handle cells still marked as INT_MAX
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dist[i][j] == Integer.MAX_VALUE) {
                    dist[i][j] = 0;
                }
            }
        }
        
        return dist;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[][] mat = new int[3][3];
        for(int i=0;i<3;i++){
            mat[i] = Arrays.stream(bf.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        }
        updateMatrix(mat);
    }
}
