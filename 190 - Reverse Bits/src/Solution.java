// Reverse bits of a given 32 bits unsigned integer.

// Constraints:
// The input must be a binary string of length 32

public class Solution {
    public int reverseBits(int n) {
        int reversedN = 0;

        for (int bitIndex = 0; bitIndex < 32; bitIndex++) {
            reversedN <<= 1;
            reversedN |= n & 1;
            n = n >>> 1;
        }

        return reversedN;
    }
}