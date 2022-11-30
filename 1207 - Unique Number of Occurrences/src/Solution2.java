import java.util.HashMap;
import java.util.HashSet;

// Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.

// Constraints:
// 1 <= arr.length <= 1000
// -1000 <= arr[i] <= 1000

class Solution2 {
    public boolean uniqueOccurrences(int[] arr) {
        final int MINIMUM_VALUE = -1000;
        final int MAXIMUM_VALUE = 1000;

        // Store the number of occurences of each value from the specified array.
        HashMap<Integer, Integer> numberOfOccurencesOfValues = new HashMap<>(MAXIMUM_VALUE - MINIMUM_VALUE + 1);
        for (int value : arr) {
            numberOfOccurencesOfValues.put(value, numberOfOccurencesOfValues.getOrDefault(value, 0) + 1);
        }

        // Return false if there are any duplicate number of occurences.
        HashSet<Integer> numberOfNumberOfOccurencesOfValues = new HashSet<>(numberOfOccurencesOfValues.size());
        for (Integer value : numberOfOccurencesOfValues.keySet()) {
            if (!numberOfNumberOfOccurencesOfValues.add(numberOfOccurencesOfValues.get(value))) {
                return false;
            }
        }

        // There aren't a duplicate number of occurences, return true.
        return true;
    }
}