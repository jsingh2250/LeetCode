// Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

// After doing so, return the array.

// Constraints:
// 1 <= arr.length <= 10^4
// 1 <= arr[i] <= 10^5

class Solution1 {
    public int[] replaceElements(int[] arr) {
        int index = arr.length - 1;
        int greatestElement = arr[index];
        arr[index] = -1;
        index--;

        for (; index >= 0; index--) {
            int currentElement = arr[index];
            arr[index] = greatestElement;
            greatestElement = Math.max(greatestElement, currentElement);
        }

        return arr;
    }
}