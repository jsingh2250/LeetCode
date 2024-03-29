// Given an integer n, return true if it is a power of two. Otherwise, return false.

// An integer n is a power of two, if there exists an integer x such that n == 2x.

// Constraints:
// -2^31 <= n <= 2^31 - 1

class Solution {
    public boolean isPowerOfTwo(int n) {
        return ((n > 0) && (Integer.bitCount(n) == 1));
    }
}