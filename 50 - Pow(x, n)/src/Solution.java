// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

// Constraints:
// -100.0 < x < 100.0
// -2^31 <= n <= 2^31-1
// n is an integer.
// -10^4 <= x^n <= 10^4

class Solution {
    public double myPow(double x, long n) {
        long power = Math.abs(n);
        double result = 1.0;

        while (power > 0) {
            // Odd numbered powers.
            if (power % 2 == 1) {
                result *= x;
                power--;
            }

            // Even numbered powers.
            x *= x;
            power /= 2;
        }

        return ((n > 0) ? result : (1 / result));
    }
}