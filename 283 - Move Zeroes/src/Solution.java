import java.util.Arrays;

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

// Constraints:
// 1 <= nums.length <= 10^4
// -2^31 <= nums[i] <= 2^31 - 1

class Solution {
    public void moveZeroes(int[] nums) {
        int numberOfZeros = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                numberOfZeros++;
            }
            else {
                nums[i - numberOfZeros] = nums[i]; 
            }
        }

        Arrays.fill(nums, nums.length - numberOfZeros, nums.length, 0);
    }
}