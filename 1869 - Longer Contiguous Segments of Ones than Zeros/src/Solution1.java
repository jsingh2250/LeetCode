// Given a binary string s, return true if the longest contiguous segment of 1's is strictly longer than the longest contiguous segment of 0's in s, or return false otherwise.

// For example, in s = "110100010" the longest continuous segment of 1s has length 2, and the longest continuous segment of 0s has length 3.
// Note that if there are no 0's, then the longest continuous segment of 0's is considered to have a length 0. The same applies if there is no 1's.

// Constraints:
// 1 <= s.length <= 100
// s[i] is either '0' or '1'.

class Solution1 {
    public boolean checkZeroOnes(String s) {
        int maxNumberOf0s = 0;
        int maxNumberOf1s = 0;

        int numberOfContinuous0s = 0;
        int numberOfContinuous1s = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                numberOfContinuous1s = 0;
                numberOfContinuous0s++;
            }
            else {
                numberOfContinuous0s = 0;
                numberOfContinuous1s++;
            }
            maxNumberOf0s = Math.max(maxNumberOf0s, numberOfContinuous0s);
            maxNumberOf1s = Math.max(maxNumberOf1s, numberOfContinuous1s);
        }

        return (maxNumberOf1s > maxNumberOf0s);
    }
}