public class Solution70 {

    // Method to check if all rows in the matrix are circular rotations of each other
    public static boolean isCircularMatrix(int[][] matrix) {
        // Loop through each row of the matrix except the last one
        for (int i = 0; i < matrix.length - 1; i++) {
            // Check if each element in the row is equal to the corresponding rotated element in the next row
            for (int j = 1; j < matrix.length - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;  // If any element doesn't match, return false
                }
            }
            // Check if the last element of the current row matches the first element of the next row
            if (matrix[i][matrix.length - 1] != matrix[i + 1][0]) {
                return false;  // Return false if the rotation condition fails
            }
        }
        return true;  // Return true if all rows are circular rotations of each other
    }

    // Main method for testing
    public static void main(String[] args) {
        // Define test case 1
        int[][] matrix1 = {
            {1, 2, 3},
            {3, 1, 2},
            {2, 3, 1}
        };
        // Test case 1
        System.out.println("Test case 1: " + isCircularMatrix(matrix1));  // Expected output: true

        // Define test case 2
        int[][] matrix2 = {
            {1, 2, 3},
            {3, 2, 1},
            {2, 3, 1}
        };
        // Test case 2
        System.out.println("Test case 2: " + isCircularMatrix(matrix2));  // Expected output: false
    }
}
