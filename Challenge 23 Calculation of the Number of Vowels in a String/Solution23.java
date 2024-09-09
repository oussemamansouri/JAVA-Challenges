public class Solution23 {
    // Method to count the number of vowels in a given string
    public static int countVowels(String text) {
        int vowelCount = 0;
        text = text.toLowerCase(); // Convert text to lowercase to ignore case

        // Iterate through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            // Check if the character is a vowel
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    // Main method to test the countVowels method
    public static void main(String[] args) {
        String text = "Bonjour, ceci est un exemple de chaîne de caractères.";

        // Calculate the number of vowels in the text
        int numberOfVowels = countVowels(text);

        // Print the number of vowels in the text
        System.out.println("The number of vowels in the text:");
        System.out.println(text);
        System.out.println("is: " + numberOfVowels);
    }
}
