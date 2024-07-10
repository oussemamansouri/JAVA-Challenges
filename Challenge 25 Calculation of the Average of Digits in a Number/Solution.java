public class Solution {
    // Method to calculate the average of the digits in a given number
    public static int averageDigits(int input) {
        // Determine the sign of the input number
        int sign = Integer.signum(input);
        
        // Use the absolute value of the input number
        input = Math.abs(input);
        // Convert the number to a string to process each digit
        String digits = Integer.toString(input);
        
        int sum = 0;
        
        // Iterate through each character in the string
        for (int i = 0; i < digits.length(); i++) {
            // Convert the character to its numeric value and add to the sum
            sum += Character.getNumericValue(digits.charAt(i));
        }
        
        // Calculate the average of the digits
        double average = (double) sum / digits.length();
        
        // Round the average to the nearest integer
        int roundedAverage = (int) Math.round(average);
        
        // Restore the sign of the result
        roundedAverage *= sign;
        
        return roundedAverage;
    }

    // Main method to test the averageDigits method
    public static void main(String[] args) {
        int number = 31560;

        // Calculate the average of the digits in the number and print the result
        System.out.println("Result: " + averageDigits(number));
    }
}
