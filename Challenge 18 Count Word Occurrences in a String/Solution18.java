import java.util.HashMap;
import java.util.Map;

public class Solution18 {
    public static void main(String[] args) {
        try {
            // Input string
            String input = "The cat is on the roof. The roof is red.";
            // Call the method to count word occurrences
            Map<String, Integer> occurrences = countWordOccurrences(input);
            // Print the result
            System.out.println("Output: " + occurrences);
        } catch (IllegalArgumentException e) {
            // Handle any illegal arguments
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to count occurrences of words in a string
    public static Map<String, Integer> countWordOccurrences(String input) {
        // Check if input is null or empty
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("The input string cannot be null or empty.");
        }

        // Convert input string to lowercase
        input = input.toLowerCase();

        // Create a map to store word occurrences
        Map<String, Integer> occurrences = new HashMap<>();

        // Split input string into words
        String[] words = input.split("\\s+");

        // Loop through each word
        for (String word : words) {
            // Remove non-alphabetical characters
            word = word.replaceAll("[^a-zA-Z]", "");

            // Check if word is not empty after removing non-alphabetical characters
            if (!word.isEmpty()) {
                // Update word occurrences in the map
                if (occurrences.containsKey(word)) {
                    occurrences.put(word, occurrences.get(word) + 1);
                } else {
                    occurrences.put(word, 1);
                }
            }
        }

        // Return the map containing word occurrences
        return occurrences;
    }
}

