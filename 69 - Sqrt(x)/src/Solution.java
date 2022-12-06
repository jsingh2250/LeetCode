// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

// You must not use any built-in exponent function or operator.

// Constraints:
// 0 <= x <= 2^31 - 1

class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int lowNumber = 1;
        int highNumber = x;
        int middleNumber;
        int xDividedByMiddleNumber;
        while (lowNumber <= highNumber) {
            middleNumber = (highNumber - lowNumber) / 2 + lowNumber;
            xDividedByMiddleNumber = x / middleNumber;
            if (middleNumber < xDividedByMiddleNumber) {
                lowNumber = middleNumber + 1;
            } else if (middleNumber > xDividedByMiddleNumber) {
                highNumber = middleNumber - 1;
            } else {
                return middleNumber;
            }
        }

        return highNumber;
    }
}