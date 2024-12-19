import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class setZero {
    public static void setZeroes(int[][] matrix) {
        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
        for (Iterator<Integer> it = rowSet.iterator(); it.hasNext(); ) {
            Integer row = it.next();
            Arrays.fill(matrix[row], 0);
        }
        for (Iterator<Integer> it = colSet.iterator(); it.hasNext(); ) {
            Integer col = it.next();
            for(int i=0;i<matrix.length;i++){
                matrix[i][col] = 0;
            }
        }
    }



}
