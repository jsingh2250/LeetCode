import java.util.Arrays;

// Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.

// Constraints:
// 1 <= arr.length <= 1000
// -1000 <= arr[i] <= 1000

class Solution1 {
    public boolean uniqueOccurrences(int[] arr) {
        final int MINIMUM_VALUE = -1000;
        final int MAXIMUM_VALUE = 1000;
        int[] numberOfOccurencesByValue = new int[MAXIMUM_VALUE - MINIMUM_VALUE + 1];

        // Store the number of occurences of each value in the specified array. Each element in the number of occurences array represents the number of occurences of a unique value. Offset the index value from the value whose occurences are being counted to allow for storing the number of occurences of negative values. This is done by subtracting the minimum value that could be specified from the value whose occurences are being counted.
        for (int value : arr) {
            numberOfOccurencesByValue[value - MINIMUM_VALUE]++;
        }

        // Sort the array by increasing number of occurences.
        Arrays.sort(numberOfOccurencesByValue);

        // Set the index to the first non-zero value in the array.
        int indexOfNumberOfOccurencesByValue = 0;
        for (; indexOfNumberOfOccurencesByValue < numberOfOccurencesByValue.length; indexOfNumberOfOccurencesByValue++) {
            if (numberOfOccurencesByValue[indexOfNumberOfOccurencesByValue] != 0) {
                indexOfNumberOfOccurencesByValue++;
                break;
            }
        }

        // If there are a duplicate number of non-zero occurences, return false.
        for (; indexOfNumberOfOccurencesByValue < numberOfOccurencesByValue.length; indexOfNumberOfOccurencesByValue++) {
            if (numberOfOccurencesByValue[indexOfNumberOfOccurencesByValue - 1] == numberOfOccurencesByValue[indexOfNumberOfOccurencesByValue]) {
                return false;
            }
        }

        // There aren't a duplicate number of non-zero occurences, return true.
        return true;
    }
}