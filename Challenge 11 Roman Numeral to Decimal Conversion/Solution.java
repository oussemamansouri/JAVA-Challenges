
public class Solution {

    public static void main(String[] args) {
        int res = convertRomanToDecimal("XXVIII");

        // Check if the conversion result is not 0 and print the appropriate message
        if (res != 0) {
            System.out.println("The value of XXVIII in Roman numerals is: " + res);
        } else {
            System.out.println("Please enter valid Roman numerals!");
        }
    }

    // Method to convert Roman numerals to decimal
    public static int convertRomanToDecimal(String roman) {
        int result = 0;

        // Iterate over each character in the Roman numeral string
        for (int i = 0; i < roman.length(); i++) {
            switch (roman.charAt(i)) {
                case 'I': result += 1; break;
                case 'V': result += 5; break;
                case 'X': result += 10; break;
                case 'L': result += 50; break;
                case 'C': result += 100; break;
                case 'D': result += 500; break;
                case 'M': result += 1000; break;
                default: return 0; // Return 0 if an invalid character is found
            }
        }

        return result; // Return the converted decimal value
    }
}
