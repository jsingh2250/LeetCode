// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

// Constraints:
// 0 <= num <= 2^31 - 1

class Solution {
    public int addDigits(int num) {
        while (num > 9) {
            int digitsRunningSum = 0;

            while (num > 0) {
                digitsRunningSum += num % 10;
                num /= 10;
            }

            num = digitsRunningSum;
        }

        return num;
    }
}