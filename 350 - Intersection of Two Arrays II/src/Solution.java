import java.util.ArrayList;

// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

// Constraints:
// 1 <= nums1.length, nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 1000

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] numberOfOccurencesByNumber = new int[1001];

        for (int number : nums1) {
            numberOfOccurencesByNumber[number]++;
        }

        ArrayList<Integer> intersectionOfNums1AndNums2AsArrayList = new ArrayList<>();
        for (int number : nums2) {
            if (numberOfOccurencesByNumber[number] != 0) {
                intersectionOfNums1AndNums2AsArrayList.add(number);
                numberOfOccurencesByNumber[number]--;
            }
        }

        int[] intersectionOfNums1AndNums2AsArray = new int[intersectionOfNums1AndNums2AsArrayList.size()];
        for (int i = 0; i < intersectionOfNums1AndNums2AsArray.length; i++) {
            intersectionOfNums1AndNums2AsArray[i] = intersectionOfNums1AndNums2AsArrayList.get(i);
        }

        return intersectionOfNums1AndNums2AsArray;
    }
}