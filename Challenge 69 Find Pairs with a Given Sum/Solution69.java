import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution69 {

    // Method to find pairs from different rows that sum up to z
    public static int[][] findPairs(int[][] matrix, int z) {
        List<int[]> result = new ArrayList<>();   // List to store the result pairs
        HashSet<String> uniquePairs = new HashSet<>();  // Set to ensure unique pairs
        int rows = matrix.length;  // Number of rows in the matrix

        // Loop through each row
        for (int i = 0; i < rows; i++) {
            // Compare with the next rows
            for (int j = i + 1; j < rows; j++) {
                // Loop through elements of row i
                for (int x : matrix[i]) {
                    // Loop through elements of row j
                    for (int y : matrix[j]) {
                        // If the sum of elements equals z, create a pair
                        if (x + y == z) {
                            int[] pair = new int[]{x, y};
                            Arrays.sort(pair);  // Sort the pair to maintain order
                            String pairString = Arrays.toString(pair);  // Convert pair to string for uniqueness

                            // Check if the pair is unique
                            if (!uniquePairs.contains(pairString)) {
                                uniquePairs.add(pairString);  // Add to set of unique pairs
                                result.add(pair);  // Add to result list
                            }
                        }
                    }
                }
            }
        }

        // Sort the result list in ascending order
        result.sort((a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        });

        // Convert the result list to an array and return
        return result.toArray(new int[result.size()][]);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Define a sample matrix and target sum z
        int[][] matrix = {
            {1, 0, 4},
            {5, 2, 3},
            {6, 2, 3}
        };
        int K = 4;

        // Call the findPairs method and store the result
        int[][] result = findPairs(matrix, K);

        // Print the result
        System.out.println("Pairs with sum " + K + ":");
        for (int[] pair : result) {
            System.out.println(Arrays.toString(pair));
        }
    }
}
