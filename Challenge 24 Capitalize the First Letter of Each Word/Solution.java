public class Solution {
    // Method to capitalize the first letter of each word in a given string
    public static String capitalizeFirstLetter(String text) {
        String[] words = text.split(" ");
        StringBuilder capitalizedText = new StringBuilder();

        // Iterate through each word in the string
        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize the first letter of the word and append the rest
                capitalizedText.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        // Remove the trailing space
        return capitalizedText.toString().trim();
    }

    // Main method to test the capitalizeFirstLetter method
    public static void main(String[] args) {
        String text = "conversion de la première lettre de chaque mot en majuscule";

        // Capitalize the first letter of each word in the text
        String result = capitalizeFirstLetter(text);

        // Print the result
        System.out.println("Result: " + result);
    }
}
