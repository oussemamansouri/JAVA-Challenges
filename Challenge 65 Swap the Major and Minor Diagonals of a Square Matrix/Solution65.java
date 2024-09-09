import java.util.Arrays;

public class Solution65 {

    // Method to swap the major and minor diagonals of a square matrix
    public static int[][] swapDiagonals(int[][] matrix) {
        int n = matrix.length;
        int[][] newMatrix = new int[n][n];

        // Copy the original matrix to a new matrix
        for (int i = 0; i < n; i++) {
            System.arraycopy(matrix[i], 0, newMatrix[i], 0, n);
        }

        // Swap elements of the major and minor diagonals
        for (int i = 0; i < n; i++) {
            int temp = newMatrix[i][i];
            newMatrix[i][i] = matrix[i][n - 1 - i];
            newMatrix[i][n - 1 - i] = temp;
        }

        return newMatrix;
    }

    // Main method for testing the swapDiagonals method
    public static void main(String[] args) {
        int[][] matrix = {
            { 9, 1, 7, 2 },
            { 3, 6, 4, 5 },
            { 3, 4, 9, 5 },
            { 6, 7, 2, 8 }
        };

        // Get the new matrix with swapped diagonals
        int[][] result = swapDiagonals(matrix);

        // Print the original matrix
        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        // Print the result matrix with swapped diagonals
        System.out.println("Matrix with Swapped Diagonals:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
