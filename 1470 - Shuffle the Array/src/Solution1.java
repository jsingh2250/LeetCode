// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

// Return the array in the form [x1,y1,x2,y2,...,xn,yn].

// Constraints:
// 1 <= n <= 500
// nums.length == 2n
// 1 <= nums[i] <= 10^3

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffledNumbers = new int[nums.length];

        for (int i = 0; i < n; i++) {
            shuffledNumbers[2 * i] = nums[i];
            shuffledNumbers[2 * i + 1] = nums[n + i];
        }

        return shuffledNumbers;
    }
}