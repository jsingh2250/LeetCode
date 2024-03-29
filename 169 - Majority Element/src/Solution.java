import java.util.HashMap;
import java.util.Map.Entry;

// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Constraints:
// n == nums.length
// 1 <= n <= 5 * 10^4
// -10^9 <= nums[i] <= 10^9

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numberToNumberOfOccurencesOfNumbers = new HashMap<>();

        for (int number : nums) {
            numberToNumberOfOccurencesOfNumbers.put(number,
                    numberToNumberOfOccurencesOfNumbers.getOrDefault(number, 0) + 1);
        }

        int halfOfNumsLength = nums.length / 2;
        for (Entry<Integer, Integer> numberToNumberOfOccurencesOfNumber : numberToNumberOfOccurencesOfNumbers.entrySet()) {
            if (numberToNumberOfOccurencesOfNumber.getValue() > halfOfNumsLength) {
                return numberToNumberOfOccurencesOfNumber.getKey();
            }
        }

        return 0;
    }
}