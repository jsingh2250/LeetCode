// An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

// Given an integer n, return true if n is an ugly number.

// Constraints:
// -2^31 <= n <= 2^31 - 1

class Solution {
    public int removeFactor(int n, int factor) {
        while (n % factor == 0) {
            n /= factor;
        }

        return n;
    }

    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        
        n = removeFactor(n, 5);
        n = removeFactor(n, 3);
        n = removeFactor(n, 2);

        return (n == 1);
    }
}