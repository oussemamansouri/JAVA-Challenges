public class Solution36 {
    
    /**
     * Finds the shortest and longest words in a string.
     *
     * @param inputString The original string
     * @return An array of two strings: the shortest word and the longest word
     */
    public static String[] minMax(String inputString) {
        String[] result = new String[2];
        String max = "";
        String min = "";

        // Find the longest word
        for (String word : inputString.split(" ")) {
            if (word.length() > max.length()) {
                max = word;
            }
        }

        // Initialize min with the longest word found
        min = max;

        // Find the shortest word
        for (String word : inputString.split(" ")) {
            if (word.length() < min.length()) {
                min = word;
            }
        }

        result[0] = min;
        result[1] = max;
        return result;
    }

    public static void main(String[] args) {
        String[] result = minMax("Find the word");
        for (String string : result) {
            System.out.print(string + " ");
        }
    }
}
