package Concepts.exponentiation;

public class MatrixExpo {
    private static int[][] identity = new int[][]{{1,0}, {0,1}};
    public static void main(String[] args) {
        int[][] A = {
                {1, 2},
                {3, 4}
        };

        // Resultant matrix
        int[][] C = matrixExponentiation(A, 10);

        // Print the result
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixExponentiation(int[][] A, int n){
        if(n==0){
            return identity;
        }
        if(n==1){
            return A;
        }
        int[][] sqr = matrixExponentiation(A, n/2);
        sqr = matrixSqr(sqr, sqr);
        if(n%2==0){
            return sqr;
        }else{
            return matrixSqr(sqr, A);
        }
    }


    //we are not generalizing this , it is only applicable for 2*2 matrix
    private static int[][] matrixSqr(int[][] A, int[][] B){
        int[][] C = new int[2][2];
        C[0][0] = A[0][0]*B[0][0] + A[0][1]*B[1][0];
        C[0][1] = A[0][0]*B[0][1] + A[0][1]*B[1][1];
        C[1][0] = A[1][0]*B[0][0] + A[1][1]*B[1][0];
        C[1][1] = A[1][0]*B[0][1] + A[1][1]*B[1][1];

        return C;
    }
}
