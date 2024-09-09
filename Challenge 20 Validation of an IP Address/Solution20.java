public class Solution20 {

    // Method to validate if a given string is a valid IPv4 address
    public static boolean validateIPAddress(String ipAddress) {
        // Split the IP address by dots
        String[] octets = ipAddress.split("\\.");

        // Check if there are exactly 4 octets
        if (octets.length != 4)
            return false;

        // Check each octet
        for (String octet : octets) {
            // Check if octet is a number between 0 and 255
            try {
                int value = Integer.parseInt(octet);
                if (value < 0 || value > 255)
                    return false;
            } catch (NumberFormatException e) {
                // If parsing fails, it's not a valid number
                return false;
            }
        }

        // If all checks pass, it's a valid IP address
        return true;
    }

    // Main method to test the validateIPAddress method
    public static void main(String[] args) {
        String address1 = "192.168.0.1";
        String address2 = "256.0.0.1";

        System.out.println("Input: \"" + address1 + "\"");
        System.out.println("Output: " + address1 + " is a valid IP address: " + validateIPAddress(address1));

        System.out.println("Input: \"" + address2 + "\"");
        System.out.println("Output: " + address2 + " is a valid IP address: " + validateIPAddress(address2));
    }
}
