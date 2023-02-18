// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

// Constraints:
// n == nums.length
// 1 <= n <= 104
// 0 <= nums[i] <= n
// All the numbers of nums are unique.

class Solution {
    public int missingNumber(int[] nums) {
        boolean[] isNumberInNumsByNumber = new boolean[nums.length + 1];

        for (int number : nums) {
            isNumberInNumsByNumber[number] = true;
        }

        for (int number = 0; number < isNumberInNumsByNumber.length; number++) {
            if (isNumberInNumsByNumber[number] == false) {
                return number;
            }
        }

        return 0;
    }
}