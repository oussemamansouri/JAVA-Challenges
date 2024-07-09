public class Solution {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Calculate the sum of the matrix elements
        int sum = sumMatrix(matrix);
        // Print the sum of the matrix elements
        System.out.println("The sum of the elements of the matrix is: " + sum);
    }

    // Method to calculate the sum of all elements in a given matrix
    public static int sumMatrix(int[][] matrix) {
        int sum = 0;
        // Iterate over each row of the matrix
        for (int i = 0; i < matrix.length; i++) {
            // Iterate over each element in the row
            for (int j = 0; j < matrix[i].length; j++) {
                // Add the element to the sum
                sum += matrix[i][j];
            }
        }
        // Return the total sum of the matrix elements
        return sum;
    }
}
