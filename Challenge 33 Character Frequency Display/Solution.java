import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

    // Method to calculate character frequency
    public static String characterFrequency(String str) {
        // HashMap to store the frequency of each character
        Map<Character, Integer> freq = new HashMap<>();

        // Convert the input string to lowercase
        str = str.toLowerCase();

        // Loop through each character in the string
        for (char c : str.toCharArray()) {
            // Skip spaces
            if (c != ' ') {
                // Update the frequency of the character
                if (freq.containsKey(c)) {
                    freq.put(c, freq.get(c) + 1);
                } else {
                    freq.put(c, 1);
                }
            }
        }

        // TreeMap to store characters in alphabetical order
        Map<Character, Integer> sortedFreq = new TreeMap<>(freq);

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : sortedFreq.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        // Return the result
        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage of the characterFrequency method
        System.out.println(characterFrequency("Hippopotame"));
    }
}
