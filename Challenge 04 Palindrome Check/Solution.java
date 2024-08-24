
public class Solution { // Define the main class named 'Solution'
    public static void main(String[] args) throws Exception { // Main method: the entry point of the program, can throw exceptions

        String ch = "radar"; // Define the input string 'ch' as "radar"
        int start = 0; // Initialize the start index of the string
        int end = ch.length() - 1; // Initialize the end index of the string
        boolean verify = true; // Initialize a boolean variable 'verify' to true to indicate palindrome verification

        // Loop to check if the string is a palindrome
        while (start < ch.length() / 2 && verify == true) { // Continue loop until start index reaches the middle of the string or verify becomes false
            if (ch.charAt(start) != ch.charAt(end)) { // If characters at start and end indexes are not equal
                verify = false; // Set 'verify' to false to indicate the string is not a palindrome
            } else { // If characters at start and end indexes are equal
                start++; // Move the start index to the right
                end--; // Move the end index to the left
            }
        }

        // Print the result based on the value of 'verify'
        if (verify) { // If 'verify' is true
            System.out.println(ch + " is a palindrome."); // Print that the string is a palindrome
        } else { // If 'verify' is false
            System.out.println(ch + " is not a palindrome."); // Print that the string is not a palindrome
        }

    }
}
