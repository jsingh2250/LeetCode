// Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

// The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

// Return the quotient after dividing dividend by divisor.

// Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.

// Constraints:
// -2^31 <= dividend, divisor <= 2^31 - 1
// divisor != 0

class Solution1 {
    public int divide(int dividend, int divisor) {
        boolean isQuotientNegative = (dividend < 0) ^ (divisor < 0);
        int quotient = 0;

        // If the dividend is the minimum integer, decrease the magnitude of the dividend to prevent integer overflow when taking the absolute value of the number.
        if (dividend == Integer.MIN_VALUE) {
            if (divisor == -1) {
                return Integer.MAX_VALUE;
            }

            if (divisor < 0) {
                dividend -= divisor;
            } else {
                dividend += divisor;
            }
            quotient++;
        }

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        while (dividend - divisor >= 0) {
            dividend -= divisor;
            quotient++;
        }

        return (isQuotientNegative ? -quotient : quotient);
    }
}