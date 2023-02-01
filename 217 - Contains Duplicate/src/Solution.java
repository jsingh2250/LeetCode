import java.util.HashSet;

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// Constraints:
// 1 <= nums.length <= 10^5
// -10^9 <= nums[i] <= 10^9

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenNumbers = new HashSet<>();

        for (int number : nums) {
            if (!seenNumbers.add(number)) {
                return true;
            }
        }

        return false;
    }
}