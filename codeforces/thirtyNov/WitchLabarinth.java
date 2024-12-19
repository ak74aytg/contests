package codeforces.thirtyNov;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class WitchLabarinth {
    private static class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            char[][] maze = new char[n][m];
            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                maze[i] = line.toCharArray();
            }

            boolean visited[][] = new boolean[n][m];


            Queue<Pair> queue = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <m; j++) {
                    if((i==0 && maze[i][j]=='U') || (i==n-1 && maze[i][j]=='D') || (j==0 && maze[i][j]=='L') || (j==m-1 && maze[i][j]=='R')){
                        queue.add(new Pair(i, j));
                    }
                }
            }

            while(!queue.isEmpty()){
                Pair pair = queue.poll();
                int row = pair.x;
                int col = pair.y;

                visited[row][col] = true;

                if(col-1>-1 && maze[row][col-1]=='R' && !visited[row][col-1]){
                    visited[row][col-1] = true;
                    queue.add(new Pair(row, col-1));
                }
                if(col+1<m && maze[row][col+1]=='L' && !visited[row][col+1]){
                    visited[row][col+1] = true;
                    queue.add(new Pair(row, col+1));
                }

                if(row-1>-1 && maze[row-1][col]=='D' && !visited[row-1][col]){
                    visited[row-1][col] = true;
                    queue.add(new Pair(row-1, col));
                }
                if(row+1<n && maze[row+1][col]=='U' && !visited[row+1][col]){
                    visited[row+1][col] = true;
                    queue.add(new Pair(row+1, col));
                }

                if(row+1<n) checkFor0(row+1, col, visited, maze, queue);
                if(row-1>-1) checkFor0(row-1, col, visited, maze, queue);
                if(col+1<m) checkFor0(row, col+1, visited, maze, queue);
                if(col-1>-1) checkFor0(row, col-1, visited, maze, queue);
            }


            int ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(!visited[i][j]) ans++;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }

    private static void checkFor0(int i, int j, boolean[][] visited, char[][] maze, Queue<Pair> queue){
        if(maze[i][j]!='?') return;
        if(i-1>-1 && !visited[i-1][j]) return;
        if(i+1<visited.length && !visited[i+1][j]) return;
        if(j-1>-1 && !visited[i][j-1]) return;
        if(j+1<visited[0].length && !visited[i][j+1]) return;

        queue.add(new Pair(i, j));
    }

}
