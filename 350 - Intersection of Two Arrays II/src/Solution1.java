import java.util.ArrayList;
import java.util.HashMap;

// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

// Constraints:
// 1 <= nums1.length, nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 1000

class Solution1 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> numberOfOccurencesByNums1Numbers = new HashMap<>();
        HashMap<Integer, Integer> numberOfOccurencesByNums2Numbers = new HashMap<>();

        for (int number : nums1) {
            numberOfOccurencesByNums1Numbers.put(number, numberOfOccurencesByNums1Numbers.getOrDefault(number, 0) + 1);
        }

        for (int number : nums2) {
            numberOfOccurencesByNums2Numbers.put(number, numberOfOccurencesByNums2Numbers.getOrDefault(number, 0) + 1);
        }

        ArrayList<Integer> intersectionOfNums1AndNums2 = new ArrayList<>();
        numberOfOccurencesByNums1Numbers.forEach((number, numberOfOccurencesInNums1) -> {
            if (numberOfOccurencesByNums2Numbers.containsKey(number)) {
                int numberOfOccurencesInIntersection = Math.min(numberOfOccurencesInNums1, numberOfOccurencesByNums2Numbers.get(number));
                
                for (int i = 0; i < numberOfOccurencesInIntersection; i++) {
                    intersectionOfNums1AndNums2.add(number);
                }
            }
        });

        int[] intersectionOfNums1AndNums2AsArray = new int[intersectionOfNums1AndNums2.size()];
        for (int i = 0; i < intersectionOfNums1AndNums2AsArray.length; i++) {
            intersectionOfNums1AndNums2AsArray[i] = intersectionOfNums1AndNums2.get(i);
        }

        return intersectionOfNums1AndNums2AsArray;
    }
}