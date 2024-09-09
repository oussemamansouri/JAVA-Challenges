public class Solution37 {

    public static void main(String[] args) {
        // Test the method with an example input
        System.out.println(isDivisible("abcd"));
    }

    public static boolean isDivisible(String str) {
        int len = str.length();
        if (len == 0) {
            return false; // If the string is empty, return false
        }

        // Remove all spaces from the string
        str = str.replaceAll(" ", "");

        // Check if the length is even and at least 4
        if (len % 2 == 0 && len >= 4) {
            int i = 0;
            while (i < len - 1) {
                // Check if consecutive characters are different
                if (str.charAt(i) != str.charAt(i + 1)) {
                    return true; // If found, return true
                }
                i++;
            }
            return false; // If no such pair is found, return false
        } else {
            return false; // If length is not even or less than 4, return false
        }
    }
}