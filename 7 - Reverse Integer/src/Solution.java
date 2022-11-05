/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
*/
class Solution {
    public int reverse(int x) {
        final int mostSignificantDigitsOfMaxValueExceptTheLastDigit = Integer.MAX_VALUE / 10;
        final int leastSignificantDigitOfMaxValue = Integer.MAX_VALUE % 10;
        final int mostSignificantDigitsOfMinValueExceptTheLastDigit = Math.abs(Integer.MIN_VALUE / 10);
        final int leastSignificantDigitOfMinValue = Math.abs(Integer.MIN_VALUE % 10);
        boolean isXNegative = x < 0;
        int reversedX = 0;
        // If x is the most negative number that can be stored in an integer, store the last digit and divide x by 10 before taking the absolute value of x. This will prevent overflow.
        if (x == Integer.MIN_VALUE) {
            reversedX = Math.abs(x % 10);
            x /= 10;
        }
        x = Math.abs(x);

        // While there is more than one digit left in x, keep storing and extracting the reversed digits of x.
        int leastSignificantDigitOfX = x % 10;
        while (x > 9) {
            reversedX = (reversedX * 10) + leastSignificantDigitOfX;
            x /= 10;
            leastSignificantDigitOfX = x % 10;
        }

        // Extract and store the reversed last digit of x if it doesn't cause overflow.
        boolean reversedXDoesntOverflow;
        if (isXNegative) {
            reversedXDoesntOverflow = (reversedX < mostSignificantDigitsOfMinValueExceptTheLastDigit)
                    || ((reversedX == mostSignificantDigitsOfMinValueExceptTheLastDigit)
                            && (leastSignificantDigitOfX <= leastSignificantDigitOfMinValue));
            reversedX = reversedXDoesntOverflow ? (-((reversedX * 10) + leastSignificantDigitOfX)) : 0;
        } else {
            reversedXDoesntOverflow = (reversedX < mostSignificantDigitsOfMaxValueExceptTheLastDigit)
                    || ((reversedX == mostSignificantDigitsOfMaxValueExceptTheLastDigit)
                            && (leastSignificantDigitOfX <= leastSignificantDigitOfMaxValue));
            reversedX = reversedXDoesntOverflow ? ((reversedX * 10) + leastSignificantDigitOfX) : 0;
        }

        // Return the reversed x.
        return reversedX;
    }
}