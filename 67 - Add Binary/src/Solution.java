// Given two binary strings a and b, return their sum as a binary string.

// Constraints:
// 1 <= a.length, b.length <= 104
// a and b consist only of '0' or '1' characters.
// Each string does not contain leading zeros except for the zero itself.

class Solution {
    public String addBinary(String a, String b) {
        // Declare a variable to store the carry bit.
        int carry = 0;

        // Allocate enough space for the longer of the specified strings and an additional spot for a carry bit.
        char[] sum = new char[Math.max(a.length(), b.length()) + 1];

        // Start summing bits from both strings and the carry bit. Move from the LSB to the MSB.
        int sumIndex = sum.length - 1;
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        while (sumIndex >= 0) {
            int aBit = (aIndex >= 0) ? (a.charAt(aIndex--) - '0') : 0;
            int bBit = (bIndex >= 0) ? (b.charAt(bIndex--) - '0') : 0;
            int sumOfBits = aBit + bBit + carry;
            sum[sumIndex--] = (char) ((sumOfBits % 2) + '0');
            carry = sumOfBits >> 1;
        }

        // Declare a variable to store the final result.
        String result;

        // Don't include the MSB in the result if it is a leading zero.
        if (sum[0] == '0') {
            result = new String(sum, 1, sum.length - 1);
        }
        else {
            result = new String(sum);
        }

        // Return the result of the sum.
        return result;
    }
}