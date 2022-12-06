// Given two binary strings a and b, return their sum as a binary string.

// Constraints:
// 1 <= a.length, b.length <= 104
// a and b consist only of '0' or '1' characters.
// Each string does not contain leading zeros except for the zero itself.

import java.util.Arrays;

class Solution1 {
    public String addBinary(String a, String b) {
        // Declare a variable to store the carry bit.
        int carry = 0;

        // Allocate enough space for the longer of the specified strings and an additional spot for a carry bit.
        char[] sum = new char[Math.max(a.length(), b.length()) + 1];

        // Start summing bits from both strings and the carry bit. Move from the LSB to the MSB.
        int stringIndex = 0;
        while (stringIndex < sum.length) {
            int aBit = (stringIndex < a.length()) ? (a.charAt(a.length() - 1 - stringIndex) - '0') : 0;
            int bBit = (stringIndex < b.length()) ? (b.charAt(b.length() - 1 - stringIndex) - '0') : 0;
            int aXorB = aBit ^ bBit;
            sum[sum.length - 1 - stringIndex] = (char) ((carry ^ aXorB) + '0');
            carry = (aBit & bBit) | (carry & aXorB);
            stringIndex++;
        }

        // Declare a variable to store the final result.
        String result;

        // Don't include the MSB in the result if it is a leading zero.
        if (sum[0] == '0') {
            result = new String(Arrays.copyOfRange(sum, 1, sum.length));
        }
        else {
            result = new String(sum);
        }

        // Return the result of the sum.
        return result;
    }
}