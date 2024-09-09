public class Solution68 {

    // Method to multiply two matrices M1 and M2
    public static int[][] multiplyMatrix(int[][] M1, int[][] M2) {
        // Check if matrix multiplication is possible (columns of M1 should match rows of M2)
        if (M1[0].length != M2.length) {
            throw new IllegalArgumentException("Matrices cannot be multiplied: columns of A do not correspond to rows of B.");
        }

        int m = M1.length; // Number of rows in M1
        int n = M1[0].length; // Number of columns in M1 (and rows in M2)
        int p = M2[0].length; // Number of columns in M2

        int[][] M = new int[m][p]; // Initialize the result matrix with size m x p

        // Perform matrix multiplication
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    M[i][j] += M1[i][k] * M2[k][j]; // Sum the products of corresponding elements
                }
            }
        }

        return M; // Return the resulting matrix
    }

    // Main method for testing the multiplyMatrix method
    public static void main(String[] args) {
        // Test input matrices
        int[][] mat1 = {
            {1, 1},
            {2, 2},
            {3, 3}
        };

        int[][] mat2 = {
            {1, 1, 1},
            {2, 2, 2}
        };

        // Call the multiplyMatrix method and store the result
        int[][] result = multiplyMatrix(mat1, mat2);

        // Print the result matrix
        System.out.println("Resulting Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
