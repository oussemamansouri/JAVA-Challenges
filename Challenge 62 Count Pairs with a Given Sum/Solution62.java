import java.util.HashSet;

public class Solution62 {

    // Method to count the number of pairs in the array that sum up to a given value k
    public static int countPairs(int[] arr, int k) {
        // Check if the array is empty, return 0 if it is
        if (arr.length == 0) {
            return 0;
        }

        // Initialize a counter to keep track of valid pairs
        int count = 0;
        // Create a HashSet to store unique elements that form pairs
        HashSet<Integer> pairSet = new HashSet<>();

        // Iterate through the array to find pairs
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];

                // If the sum of the pair equals k and neither element is equal to k
                if (sum == k && arr[i] != k && arr[j] != k) {
                    // Add the element to the HashSet (which ensures uniqueness)
                    pairSet.add(arr[i]);
                }
            }
        }

        // The size of the HashSet gives the number of unique pairs found
        int numberOfPairs = pairSet.size();
        System.out.println("Number of pairs: " + numberOfPairs);

        // Return the number of unique pairs
        return numberOfPairs;
    }

    public static void main(String[] args) {
        // Test the countPairs method with an example array
        int[] arr = {1, 5, 7, -1};
        int k = 6;

        // Call the method and print the result
        int result = countPairs(arr, k);
        System.out.println("Result: " + result);  // Expected Output: 2
    }
}
