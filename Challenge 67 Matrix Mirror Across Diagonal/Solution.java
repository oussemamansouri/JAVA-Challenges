public class Solution {

    // Method to return the mirror of the matrix across the diagonal
    public static int[][] mirrorMatrix(int[][] mat) {
        int n = mat.length; // Get the size of the matrix
        int[][] mirror = new int[n][n]; // Create a new matrix to store the mirrored version

        // Copy the original matrix into the mirror matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mirror[i][j] = mat[i][j];
            }
        }

        // Swap elements above the diagonal with elements below the diagonal
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mirror[i][j]; // Temporary variable to hold the value
                mirror[i][j] = mirror[j][i]; // Swap the elements
                mirror[j][i] = temp; // Assign the swapped value
            }
        }

        return mirror; // Return the mirrored matrix
    }

    // Main method for testing the mirrorMatrix method
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // Call the mirrorMatrix method and store the result
        int[][] result = mirrorMatrix(matrix);

        // Print the mirrored matrix
        System.out.println("Mirrored Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
