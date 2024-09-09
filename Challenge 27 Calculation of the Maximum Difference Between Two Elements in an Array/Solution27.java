import java.util.Arrays;

public class Solution27 {
    // Method to calculate the maximum difference between two elements in an array
    public static int maxDifference(int[] arr) {
        // Check if the array is empty or has only one element
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("The array must contain at least two elements.");
        }

        // Sort the array
        Arrays.sort(arr);

        // The maximum difference is the difference between the largest and smallest elements
        return arr[arr.length - 1] - arr[0];
    }

    // Main method to test the maxDifference method
    public static void main(String[] args) {
        int[] arr = {3, 7, 9, 5, 6, 10, 1, 2};

        // Calculate the maximum difference and print the result
        System.out.println("Result: " + maxDifference(arr));
    }
}
