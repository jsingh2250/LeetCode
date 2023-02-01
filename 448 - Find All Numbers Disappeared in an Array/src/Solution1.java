import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

// Constraints:
// n == nums.length
// 1 <= n <= 10^5
// 1 <= nums[i] <= n

class Solution1 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> disappearedNumbers = new ArrayList<>(nums.length);
        HashSet<Integer> nonDisappearedNumbers = new HashSet<>(nums.length);

        for (int number : nums) {
            nonDisappearedNumbers.add(number);
        }

        for (int number = 1; number <= nums.length; number++) {
            if (!nonDisappearedNumbers.contains(number)) {
                disappearedNumbers.add(number);
            }
        }

        return disappearedNumbers;
    }
}