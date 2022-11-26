import java.util.Arrays;

// Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.

// Constraints:

// 1 <= nums.length <= 200
// 1 <= nums[i] <= 100
// 1 <= k <= 99

class Solution {
    public int countKDifference(int[] nums, int k) {
        // Sort the number array in ascending order to make it quicker to find pairs.
        Arrays.sort(nums);

        // Declare a variable for storing the number of pairs that have a difference of k.
        int numberOfPairsWithKDifference = 0;

        for (int i = 0; i < (nums.length - 1); i++) {
            // Since nums is sorted in ascending order, (nums[i] - nums[j]), where i < j, will equal -k. So, nums[j] should equal nums[i] + k.
            int neededValue = nums[i] + k;
            int j = Arrays.binarySearch(nums, i + 1, nums.length, neededValue);
            // If the needed value was not found in the array, move on to the next i.
            if (j < 0) {
                continue;
            }
            // Get the index of the first occurence of the needed value. Binary search does not guarantee that the returned index is the first occurence of the key value.
            while (nums[j - 1] == neededValue) {
                j--;
            }
            // Account for duplicate needed values that are stored next to each other.
            while ((j < nums.length) && (nums[j++] == neededValue)) {
                numberOfPairsWithKDifference++;
            }
        }

        // Return the number of pairs that have a difference of k.
        return numberOfPairsWithKDifference;
    }
}