import java.util.Arrays;

public class Solution {

    // Method to check if a matrix is idempotent
    public static boolean checkIdempotence(int[][] mat) {
        int n = mat.length;

        // Ensure the matrix is square
        for (int i = 0; i < n; i++) {
            if (mat[i].length != n) {
                return false;
            }
        }

        // Multiply the matrix by itself
        int[][] matSquare = multiplyMatrices(mat, mat, n);

        // Check if the resulting matrix is the same as the original matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matSquare[i][j] != mat[i][j]) {
                    return false; // If any element doesn't match, the matrix is not idempotent
                }
            }
        }

        return true; // If all elements match, the matrix is idempotent
    }

    // Method to multiply two matrices
    private static int[][] multiplyMatrices(int[][] A, int[][] B, int n) {
        int[][] result = new int[n][n];

        // Perform matrix multiplication
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result; // Return the resulting matrix
    }

    // Main method to test the checkIdempotence method
    public static void main(String[] args) {
    	int mat1[][] = {{9, -2, -4},  
    		       {-1, 3, 4},  
    		       {1, -2, -3}};

    	int mat2[][] = {{2, -2, -4},  
    		       {-1, 3, 4},  
    		       {1, -2, -3}};

        // Test the first matrix for idempotence
        System.out.println("Matrix 1 is idempotent: " + checkIdempotence(mat1));

        // Test the second matrix for idempotence
        System.out.println("Matrix 2 is idempotent: " + checkIdempotence(mat2));
    }
}
