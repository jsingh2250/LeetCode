import java.util.LinkedList;
import java.util.Queue;

// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

// Constraints:

// nums1.length == m + n
// nums2.length == n
// 0 <= m, n <= 200
// 1 <= m + n <= 200
// -10^9 <= nums1[i], nums2[j] <= 10^9

class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Queue<Integer> nums1Buffer = new LinkedList<>();

        int nums2Index = 0;
        
        int mergedArrayIndex;

        // Do this until the end of the elements in the original nums1 array is reached.
        for (mergedArrayIndex = 0; mergedArrayIndex < m; mergedArrayIndex++) {
            nums1Buffer.add(nums1[mergedArrayIndex]);

            if (nums2Index >= n || nums1Buffer.peek() <= nums2[nums2Index]) {
                nums1[mergedArrayIndex] = nums1Buffer.poll();
            }
            else {
                nums1[mergedArrayIndex] = nums2[nums2Index++];
            }
        }

        // Do this until the nums1 buffer is empty or all of the elements in nums2 have been moved to the merged array.
        while (!nums1Buffer.isEmpty() && nums2Index < n) {
            if (nums1Buffer.peek() <= nums2[nums2Index]) {
                nums1[mergedArrayIndex++] = nums1Buffer.poll();
            }
            else {
                nums1[mergedArrayIndex++] = nums2[nums2Index++];
            }
        }

        // Do this until the nums1 buffer is empty.
        while (!nums1Buffer.isEmpty()) {
            nums1[mergedArrayIndex++] = nums1Buffer.poll();
        }

        // Do this until all of the elements in nums2 have been moved to the merged array.
        while (nums2Index < n) {
            nums1[mergedArrayIndex++] = nums2[nums2Index++];
        }
    }
}