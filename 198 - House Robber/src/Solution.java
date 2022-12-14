// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

// Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

// Constraints:
// 1 <= nums.length <= 100
// 0 <= nums[i] <= 400

class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length <= 2) {
            return Math.max(nums[0], nums[nums.length - 1]);
        }

        // If the robber goes to the third house, they could have also robbed the first house. Add the money from the first house to the money at the third house.
        nums[2] += nums[0];

        // Store the maximum money that could have been robbed up until and including the house the robber is current at.
        for (int i = 3; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 2], nums[i - 3]);
        }

        // The robber could have ended up at either the last house or the house before that. Return the maximum of the money that the robber would have ended up with at each of those houses.
        return Math.max(nums[nums.length - 1], nums[nums.length - 2]);
    }
}