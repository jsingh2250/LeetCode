// Given an integer n, return true if it is a power of three. Otherwise, return false.

// An integer n is a power of three, if there exists an integer x such that n == 3^x.

// Constraints:
// -2^31 <= n <= 2^31 - 1

class Solution {
    public boolean isPowerOfThree(int n) {
        while ((n >= 3) && (n % 3 == 0)) {
            n /= 3;
        }

        return (n == 1);
    }
}