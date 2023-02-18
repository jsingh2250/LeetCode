// Given an integer n, return true if it is a power of three. Otherwise, return false.

// An integer n is a power of three, if there exists an integer x such that n == 3^x.

// Constraints:
// -2^31 <= n <= 2^31 - 1

class Solution1 {
    final int MAXIMUM_X = 19;

    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        else if (n == 1) {
            return true;
        }

        int[] powersOfThree = new int[MAXIMUM_X + 1];

        powersOfThree[0] = 1;
        for (int x = 1; x <= MAXIMUM_X; x++) {
            powersOfThree[x] = 3 * powersOfThree[x - 1];

            if (powersOfThree[x] == n) {
                return true;
            }
            else if (powersOfThree[x] > n) {
                return false;
            }
        }

        return false;
    }
}