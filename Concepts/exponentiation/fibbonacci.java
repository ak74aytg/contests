package Concepts.exponentiation;

public class fibbonacci {
    public static void main(String[] args) {
        int[][] start = new int[][]{{1}, {1}};
        int[][] relation = new int[][]{{1, 1},{1, 0}};

        relation = MatrixExpo.matrixExponentiation(relation, 5);
        int[][] temp = new int[2][1];
        temp[0][0] = relation[0][0]*start[0][0]+relation[0][1]*start[1][0];
        temp[1][0] = relation[1][0]*start[0][0]+relation[1][1]*start[1][0];
        System.out.print(temp[0][0]);
    }
}
