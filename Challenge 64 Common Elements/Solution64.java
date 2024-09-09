import java.io.*;
import java.util.*;

public class Solution64 {
    
    // Method to find distinct elements common to all rows of the matrix
    static int[] distinct(int[][] matrix) {
        int size = matrix.length; 
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Initialize the frequency map with elements from the first row
        for (int col = 0; col < size; col++) {
            frequencyMap.put(matrix[0][col], 1);
        }

        // Traverse the matrix starting from the second row
        for (int row = 1; row < size; row++) {
            for (int col = 0; col < size; col++) {
                // If the element exists in the map and its count equals the current row index,
                // increment the count by 1
                if (frequencyMap.containsKey(matrix[row][col]) && frequencyMap.get(matrix[row][col]) == row) {
                    frequencyMap.put(matrix[row][col], row + 1);
                }
            }
        }

        // List to store elements that are common to all rows
        List<Integer> commonElementsList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            // If the count of the element equals the size of the matrix, it is common to all rows
            if (entry.getValue() == size) {
                commonElementsList.add(entry.getKey());
            }
        }

        // Sort the list in ascending order
        Collections.sort(commonElementsList);

        // Convert the list to an array and return it
        int[] commonElementsArray = new int[commonElementsList.size()];
        for (int i = 0; i < commonElementsList.size(); i++) {
            commonElementsArray[i] = commonElementsList.get(i);
        }
        return commonElementsArray;
    }

    public static void main(String[] args) {
        int matrix[][] = { 
            { 2, 1, 4, 3 },
            { 1, 2, 3, 2 },
            { 3, 6, 2, 3 },
            { 5, 2, 5, 3 } 
        };
        
        // Find and print the distinct elements common to all rows
        int[] result = distinct(matrix);
        System.out.println(Arrays.toString(result));
    }
}
