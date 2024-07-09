# Validation of an IP Address

Write a method named `validateIPAddress` that takes a string as a parameter and checks if it represents a valid IPv4 address. Call the `validateIPAddress` method in the `main` function.

### Hint:
An IPv4 address is in the format `x.x.x.x`, where `x` is called an octet and must be a decimal value between 0 and 255. The octets are separated by dots. An IPv4 address must contain three dots and four octets. The following examples are valid IPv4 addresses:
- 1.2.3.4
- 01.102.103.104

### Example Output:
- Input: "192.168.0.1"
  - Output: `192.168.0.1 is a valid IP address: true`
- Input: "256.0.0.1"
  - Output: `256.0.0.1 is a valid IP address: false`
