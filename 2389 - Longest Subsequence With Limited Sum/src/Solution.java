import java.util.Arrays;

// You are given an integer array nums of length n, and an integer array queries of length m.

// Return an array answer of length m where answer[i] is the maximum size of a subsequence that you can take from nums such that the sum of its elements is less than or equal to queries[i].

// A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.

// Constraints:
// n == nums.length
// m == queries.length
// 1 <= n, m <= 1000
// 1 <= nums[i], queries[i] <= 10^6

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        // Sort nums in ascending order. The smallest numbers will make up the largest subsequence.
        Arrays.sort(nums);

        // Convert nums into a running sum array where each element becomes the sum of itself and the elements before it.
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        // Get the insertion index in the running total nums array for each query in the queries array. The insertion index equals the length of the longest subsequence that sums up to the query. All of the elements in the original nums array were greater than zero so each element in the running total nums array should be unique.
        for (int i = 0; i < queries.length; i++) {
            // Convert the result of the binary seach into a positive insertion index. If the element is found in the array, the positive index of the element is returned. Add one to the index to convert it into an insertion index. If the element is not found in the array, one minus the negative of the insertion index is returned. In this case, add one to the returned value and then take the absolute value to get the insertion index.
            queries[i] = Math.abs(Arrays.binarySearch(nums, queries[i]) + 1);
        }
        
        return queries;
    }
}