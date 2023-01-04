// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

// Constraints:
// 1 <= nums.length <= 3 * 10^4
// -3 * 10^4 <= nums[i] <= 3 * 10^4
// Each element in the array appears twice except for one element which appears only once.

class Solution1 {
    private final int MINIMUM_NUMBER = -30_000;
    private final int MAXIMUM_NUMBER = 30_000;

    public int singleNumber(int[] nums) {
        int[] numberOfInstancesByNumber = new int[MAXIMUM_NUMBER - MINIMUM_NUMBER + 1];

        for (int number : nums) {
            numberOfInstancesByNumber[number - MINIMUM_NUMBER]++;
        }

        for (int offsettedNumber = 0; offsettedNumber < numberOfInstancesByNumber.length; offsettedNumber++) {
            if (numberOfInstancesByNumber[offsettedNumber] == 1) {
                return offsettedNumber + MINIMUM_NUMBER;
            }
        }

        return 0;
    }
}