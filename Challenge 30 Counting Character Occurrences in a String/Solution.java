public class Solution {
    public static void main(String[] args) {
        // Test the countOccurrences method with case-insensitive search
        System.out.println(countOccurrences("Bonjour le monde! Il fait beau aujourd'hui.", 'b', false)); 
        // Test the countOccurrences method with case-sensitive search
        System.out.println(countOccurrences("Bonjour le monde! Il fait beau aujourd'hui.", 'b', true));  
        // Test the countOccurrences method with case-insensitive search
        System.out.println(countOccurrences("Bonjour le monde! Il fait beau aujourd'hui.", 'e', false));  
    }

    /**
     * Counts the occurrences of a character in a string.
     * 
     * @param text the input string
     * @param target the character to count
     * @param caseSensitive true for case-sensitive search, false for case-insensitive
     * @return the number of occurrences of the target character
     */
    public static int countOccurrences(String text, char target, boolean caseSensitive) {
        // Handle null input by returning 0
        if (text == null) {
            return 0; 
        }

        int occurrences = 0;
        // Convert characters to lowercase if case-insensitive search is required
        for (char currentChar : text.toCharArray()) {
            if (!caseSensitive) {
                currentChar = Character.toLowerCase(currentChar);
                target = Character.toLowerCase(target);
            }
            // Increment count if the current character matches the target character
            if (currentChar == target) {
                occurrences++;
            }
        }
        // Return the total number of occurrences
        return occurrences;
    }
}
