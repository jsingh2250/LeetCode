import java.util.ArrayList;
import java.util.List;

// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

// Constraints:
// n == nums.length
// 1 <= n <= 10^5
// 1 <= nums[i] <= n

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] isNumberInNumsByNumber = new boolean[nums.length + 1];

        ArrayList<Integer> disappearedNumbers = new ArrayList<>(nums.length);

        for (int number : nums) {
            isNumberInNumsByNumber[number] = true;
        }

        for (int number = 1; number <= nums.length; number++) {
            if (!isNumberInNumsByNumber[number]) {
                disappearedNumbers.add(number);
            }
        }

        return disappearedNumbers;
    }
}