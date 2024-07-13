public class Solution {
    public static void main(String[] args) {
        // Test the countOccurrences method with case-insensitive search
        System.out.println(countOccurrences("Hello world! The weather is nice today.", 'b', false)); 
        // Test the countOccurrences method with case-sensitive search
        System.out.println(countOccurrences("Hello world! The weather is nice today.", 'b', true));  
    }

    public static int countOccurrences(String text, char target, boolean caseSensitive) {
        // If the text is null, return 0 as there are no occurrences
        if (text == null) {
            return 0; 
        }

        int occurrences = 0;
        // Iterate through each character in the text
        for (char currentChar : text.toCharArray()) {
            // If the search is not case-sensitive, convert both characters to lowercase
            if (!caseSensitive) {
                currentChar = Character.toLowerCase(currentChar);
                target = Character.toLowerCase(target);
            }
            // If the current character matches the target character, increment the count
            if (currentChar == target) {
                occurrences++;
            }
        }
        return occurrences;
    }
}