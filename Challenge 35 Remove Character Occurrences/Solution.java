import java.text.Normalizer;

public class Solution {
    
    /**
     * Removes all occurrences of a specific character in a string.
     *
     * @param inputString          The original string
     * @param charToRemove         The character to remove
     * @param caseSensitive        If true, the search is case-sensitive
     * @param specialCharSensitive If true, the search is sensitive to special characters
     * @return The string with the specified character removed
     */
    public static String removeOccurrences(String inputString, char charToRemove, boolean caseSensitive, boolean specialCharSensitive) {
        // If the input string is null or empty, return a message
        if (inputString == null || inputString.length() == 0) {
            return "String can't be null or empty";
        }
        
        StringBuilder build = new StringBuilder(inputString);

        // Both case-sensitive and special character-sensitive
        if (caseSensitive && specialCharSensitive) {
            for (int i = 0; i < build.length(); i++) {
                if (build.charAt(i) == charToRemove) {
                    build.deleteCharAt(i);
                    i--; // Adjust index after deletion
                }
            }
        } 
        // Special character-sensitive but not case-sensitive
        else if (specialCharSensitive) {
            for (int i = 0; i < build.length(); i++) {
                if (Character.toLowerCase(build.charAt(i)) == Character.toLowerCase(charToRemove)) {
                    build.deleteCharAt(i);
                    i--; // Adjust index after deletion
                }
            }
        } 
        // Case-sensitive but not special character-sensitive
        else if (caseSensitive) {
            String normalizedChar = Normalizer.normalize(String.valueOf(charToRemove), Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
            for (int i = 0; i < build.length(); i++) {
                String normalizedString = Normalizer.normalize(String.valueOf(build.charAt(i)), Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
                if (normalizedString.equals(normalizedChar)) {
                    build.deleteCharAt(i);
                    i--; // Adjust index after deletion
                }
            }
        } 
        // Neither case-sensitive nor special character-sensitive
        else {
            String normalizedChar = Normalizer.normalize(String.valueOf(charToRemove), Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
            for (int i = 0; i < build.length(); i++) {
                String normalizedString = Normalizer.normalize(String.valueOf(build.charAt(i)), Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
                if (normalizedString.equalsIgnoreCase(normalizedChar)) {
                    build.deleteCharAt(i);
                    i--; // Adjust index after deletion
                }
            }
        }
        return build.toString();
    }
    
    public static void main(String[] args) {
        String result = removeOccurrences("<Êxemple de Ch[ãînë de caràçtères âvec É, Ä, A] et é.>", 'a', false, false);
        System.out.println(result);
    }
}
