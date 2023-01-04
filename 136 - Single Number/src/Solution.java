// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

// Constraints:
// 1 <= nums.length <= 3 * 10^4
// -3 * 10^4 <= nums[i] <= 3 * 10^4
// Each element in the array appears twice except for one element which appears only once.

class Solution {
    public int singleNumber(int[] nums) {
        int singleNumber = 0;

        for (int number : nums) {
            singleNumber ^= number;
        }

        // The only bits that should still be set are the ones that make up the number that only appears once.
        return singleNumber;
    }
}