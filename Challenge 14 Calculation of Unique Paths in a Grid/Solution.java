public class Solution {

    // Method to calculate the number of unique paths in a grid
    public static int numberOfUniquePaths(int m, int n) {

        // Validate the input parameters
        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException("Both parameters m and n must be positive!");
        }

        // Create a 2D array to store the number of unique paths to each cell
        int[][] matrix = new int[m][n];

        // Initialize the first column to 1
        for (int i = 0; i < m; i++) {
            matrix[i][0] = 1;
        }

        // Initialize the first row to 1
        for (int j = 0; j < n; j++) {
            matrix[0][j] = 1;
        }

        // Calculate the number of unique paths for each cell
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
            }
        }

        // Return the number of unique paths to the bottom-right corner of the grid
        return matrix[m - 1][n - 1];
    }

    public static void main(String[] args) throws Exception {
        int rows = 3;
        int columns = 3;

        // Calculate the number of unique paths and print the result
        System.out.println("Number of unique paths: " + numberOfUniquePaths(rows, columns));
    }
}
