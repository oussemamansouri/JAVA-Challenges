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
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
        }

        // TreeMap to store characters in alphabetical order
        Map<Character, Integer> sortedFreq = new TreeMap<>(freq);

        // Build the result string
        String result = "";
        for (Map.Entry<Character, Integer> entry : sortedFreq.entrySet()) {
            result += entry.getKey() + entry.getValue().toString();
        }

        // Return the result
        return result;
    }

    public static void main(String[] args) {
        // Example usage of the characterFrequency method
        System.out.println(characterFrequency("Hippopotame"));
    }
}
