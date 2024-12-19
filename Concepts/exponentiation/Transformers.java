package Concepts.exponentiation;

public class Transformers {
    public static void main(String[] args) {
//        relation is (x, y) -> (x+y, 2y-x)
//        transform the given pair n times
        transform(2,4, 4);
    }

    private static void transform(int x, int y, int n){
        int[][] mat = new int[][]{{1,1}, {-1, 2}};
        mat = MatrixExpo.matrixExponentiation(mat, n);
        int[][] eq = new int[][]{{x}, {y}};
        int[][] temp = new int[2][1];
        temp[0][0] = mat[0][0]*eq[0][0]+mat[0][1]*eq[1][0];
        temp[1][0] = mat[1][0]*eq[0][0]+mat[1][1]*eq[1][0];
        System.out.print(temp[0][0]+" "+temp[1][0]);
    }
}
