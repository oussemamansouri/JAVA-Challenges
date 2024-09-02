import java.util.HashMap;

public class Solution {
    
    // Method to find the most frequent element in an array
    public static int mostFrequentElement(int[] arr) {
        // Check if the array is null or empty, return -1 in such cases
        if (arr == null || arr.length == 0) {
            return -1; 
        }

        // Create a HashMap to store the frequency of each element in the array
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Iterate through the array and count the occurrences of each element
        for (int num : arr) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        // Initialize variables to track the most frequent element and its count
        int mostFrequentElement = arr[0];
        int maxFrequency = 0;

        // Iterate through the HashMap to find the element with the highest frequency
        for (HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentElement = entry.getKey();
            }
        }

        // Return the most frequent element found
        return mostFrequentElement;
    }

    public static void main(String[] args) {
        // Test the method with example arrays
        int[] arr1 = {1, 3, 2, 1, 4, 1};
        int[] arr2 = {};

        // Print the results of the test cases
        System.out.println("Most frequent element in arr1: " + mostFrequentElement(arr1)); // Output: 1
        System.out.println("Most frequent element in arr2: " + mostFrequentElement(arr2)); // Output: -1
    }
}
