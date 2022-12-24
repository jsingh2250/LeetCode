import java.util.Arrays;

// A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

// For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
// The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

// For example, the next permutation of arr = [1,2,3] is [1,3,2].
// Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
// While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
// Given an array of integers nums, find the next permutation of nums.

// The replacement must be in place and use only constant extra memory.

// Constraints:

// 1 <= nums.length <= 100
// 0 <= nums[i] <= 100

class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length == 1) {
            return;
        }

        // Find the index of the last element that increases as the index increases. If the whole array has decreasing elements, store -1 instead.
        int indexOfLastElementThatIncreases;
        for (indexOfLastElementThatIncreases = nums.length - 2; indexOfLastElementThatIncreases >= 0; indexOfLastElementThatIncreases--) {
            if (nums[indexOfLastElementThatIncreases] < nums[indexOfLastElementThatIncreases + 1]) {
                break;
            }
        }

        if (indexOfLastElementThatIncreases != -1) {
            int indexOfNextHighestNumber = indexOfLastElementThatIncreases + 1;
            for (int i = indexOfNextHighestNumber + 1; i < nums.length; i++) {
                // The rest of the numbers in the array are decreasing. Pick the index of the smallest number that is higher than the number at the index of the last element in the array that increased.
                if (nums[indexOfLastElementThatIncreases] < nums[i]) {
                    indexOfNextHighestNumber = i;
                }
            }

            int elementToSwap = nums[indexOfLastElementThatIncreases];
            nums[indexOfLastElementThatIncreases] = nums[indexOfNextHighestNumber];
            nums[indexOfNextHighestNumber] = elementToSwap;
        }

        Arrays.sort(nums, indexOfLastElementThatIncreases + 1, nums.length);
    }
}