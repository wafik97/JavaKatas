package katas.exercises;

public class MatrixRotate {

    /**
     * Rotates the given square matrix 90 degrees clockwise in place.
     *
     * @param matrix the 2D square matrix to rotate
     */
    public static void rotateMatrix(int[][] matrix) {

        int row=matrix.length,col=matrix[0].length,temp;
     /*   if(matrix.length%2==1){
            row=matrix.length/2+1;
        }
        else{
            row=matrix.length/2;
        }

        if(matrix[0].length%2==1){
            col=matrix[0].length/2+1;
        }
        else{
            col=matrix[0].length/2;
        }
*/

        for(int i=0;i<row/2;i++){
            for(int j=i;j<row-i-1;j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - j - 1][i];
                matrix[matrix.length - j - 1][i] = matrix[matrix.length - i - 1][matrix.length - j - 1];
                matrix[matrix.length - i - 1][matrix.length - j - 1] = matrix[j][matrix.length - i - 1];
                matrix[j][matrix.length - i - 1] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3,11},
                {4, 5, 6,12},
                {7, 8, 9,13},
                {21, 22, 23,14}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);
        rotateMatrix(matrix);
        System.out.println("Matrix after 90-degree clockwise rotation:");
        printMatrix(matrix);
    }    // (i,j) -> (j,n-i-1)

    /**
     * Helper method to print a 2D matrix.
     *
     * @param matrix the matrix to print
     */
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
