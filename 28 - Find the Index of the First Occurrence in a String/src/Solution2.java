// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

// Constraints:
// 1 <= haystack.length, needle.length <= 104
// haystack and needle consist of only lowercase English characters.

class Solution2 {
    public int strStr(String haystack, String needle) {
        int haystackIndex = 0;

        for (int i = 0; i < needle.length(); i++) {
            if (haystackIndex >= haystack.length()) {
                return -1;
            }

            if (needle.charAt(i) != haystack.charAt(haystackIndex)) {
                haystackIndex -= i;
                i = -1;
            }

            haystackIndex++;
        }

        return haystackIndex - needle.length();
    }
}