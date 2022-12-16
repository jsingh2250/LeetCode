// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

// Constraints:
// 1 <= haystack.length, needle.length <= 104
// haystack and needle consist of only lowercase English characters.

class Solution {
    public int strStr(String haystack, String needle) {
        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        int haystackIndex = 0;
        int needleIndex = 0;

        for (haystackIndex = 0; haystackIndex < haystack.length(); haystackIndex++) {
            if ((haystackIndex + needle.length()) > haystack.length()) {
                return -1;
            }

            for (needleIndex = 0; needleIndex < needle.length(); needleIndex++) {
                if (needleChars[needleIndex] != haystackChars[haystackIndex + needleIndex]) {
                    break;
                }
            }

            if (needleIndex == needle.length()) {
                return haystackIndex;
            }
        }

        return -1;
    }
}