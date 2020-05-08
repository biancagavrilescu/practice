package matrix;

public class Main {

    static int[][] rotate(int n, int[][] matrix) {


        int newMat[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++)
            newMat[i][j] = matrix[n-j-1][i];
        }
        return newMat;
    }

    static void displayMat(int n, int mat[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(" " + mat[i][j]);

            System.out.print("\n");
        }
        System.out.print("\n");
    }


    public static void main(String[] args) {
        // write your code here


        int mat[][] = {
                {1, 2, 3,},
                {4, 5, 6,},
                {7, 8, 9,}
        };


        displayMat(3,rotate(3,mat));

    }
}
