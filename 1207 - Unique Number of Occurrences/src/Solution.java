// Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.

// Constraints:
// 1 <= arr.length <= 1000
// -1000 <= arr[i] <= 1000

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        final int MINIMUM_VALUE = -1000;
        final int MAXIMUM_VALUE = 1000;

        // Store the number of occurences of each value in the specified array. Each element in the number of occurences array represents the number of occurences of a unique value. Offset the index value from the value whose occurences are being counted to allow for storing the number of occurences of negative values. This is done by subtracting the minimum value that could be specified from the value whose occurences are being counted.
        int[] numberOfOccurencesOfValues = new int[MAXIMUM_VALUE - MINIMUM_VALUE + 1];
        for (int value : arr) {
            numberOfOccurencesOfValues[value - MINIMUM_VALUE]++;
        }

        // Store the number of occurences of the number of occurences of each value. Return false if the number of occurences isn't unique for each value.
        int[] numberOfOccurencesOfNumberOfOccurencesOfValues = new int[arr.length + 1];
        for (int numberOfOccurencesOfValue : numberOfOccurencesOfValues) {
            if (numberOfOccurencesOfValue != 0
                    && numberOfOccurencesOfNumberOfOccurencesOfValues[numberOfOccurencesOfValue]++ > 0) {
                return false;
            }
        }

        // There aren't a duplicate number of non-zero occurences, return true.
        return true;
    }
}