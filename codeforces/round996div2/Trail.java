//package codeforces.round996div2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Trail {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            String[] line1 = bf.readLine().split(" ");
            int n = Integer.parseInt(line1[0]);
            int m = Integer.parseInt(line1[1]);
            String path = bf.readLine();
            long[][] terrain = new long[n][m];
            for (int i = 0; i < n; i++) {
                terrain[i] = Arrays.stream(bf.readLine()
                                .split(" "))
                        .mapToLong(Long::parseLong)
                        .toArray();
            }
            long[] rowSum = new long[n];
            long[] colSum  = new long[m];
            for (int i = 0; i < n; i++) {
                rowSum[i] = Arrays.stream(terrain[i]).sum();
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    colSum[i] += terrain[j][i];
                }
            }
            int count = 0;
            int row = 0;
            int col = 0;
            while(count<path.length()){
                if(path.charAt(count)=='D'){
                    terrain[row][col] = -rowSum[row];
                    rowSum[row] += terrain[row][col];
                    colSum[col] += terrain[row][col];
                    row++;
                    count++;
                }else{
                    terrain[row][col] = -colSum[col];
                    rowSum[row] += terrain[row][col];
                    colSum[col] += terrain[row][col];
                    col++;
                    count++;
                }
            }
            terrain[n-1][m-1] = -rowSum[n-1];
            for (long[] ints : terrain) {
                for (int j = 0; j < ints.length; j++) {
                    System.out.print(ints[j] + " ");
                }
                System.out.println();
            }
        }
    }
}
