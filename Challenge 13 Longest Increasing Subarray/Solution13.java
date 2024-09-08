import java.util.Arrays;

public class Solution13 {

    // Method to find the length of the longest increasing subarray
    public static int longestIncreasingSubarray(int[] array) {
        // Check for null or empty array
        if (array == null || array.length == 0) {
            return 0;
        }
        
        int maxLength = 1; // Initialize maximum length to 1
        int currentLength = 1; // Initialize current length to 1
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            // Check if the current element is greater than the previous element
            if (array[i] > array[i - 1]) {
                currentLength++; // Increment current length
                maxLength = Math.max(maxLength, currentLength); // Update maximum length if needed
            } else {
                currentLength = 1; // Reset current length
            }
        }
        
        return maxLength; // Return the maximum length found
    }

    public static void main(String[] args) {
        int[] array = { 5, 6, 3, 5, 7, 8, 9, 11, 2, 4, 10 };
        
        // Print input array
        System.out.println("Input = " + Arrays.toString(array));
        
        // Find and print the length of the longest increasing subarray
        System.out.println("Output = " + longestIncreasingSubarray(array));
    }
}
