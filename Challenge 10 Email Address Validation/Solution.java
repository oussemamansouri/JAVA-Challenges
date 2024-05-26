public class Solution {

    public static void main(String[] args) {
        String email = "example@example.com";

        // Check if the email is valid and print the appropriate message
        if (validateEmail(email)) {
            System.out.println(email + " is a valid email address");
        } else {
            System.out.println(email + " is not a valid email address");
        }
    }

    // Method to validate an email address
    public static boolean validateEmail(String email) {
        int length = email.length(); 
        int atPosition = email.indexOf("@");
        int dotPosition = email.indexOf(".");

        // Check if the email length is within the valid range
        if (length > 25 || length < 8) {
            return false;
        // Check if the email contains both "@" and "."
        } else if (atPosition == -1 || dotPosition == -1) {
            return false;
        // Check the positions of "@" and "." to ensure they are in valid locations
        } else if (atPosition < 3 || (dotPosition - atPosition) < 3 || ((length - 1) - dotPosition) < 2 || ((length - 1) - dotPosition) > 3) {
            return false;
        } else {
            return true;
        }
    }
}
