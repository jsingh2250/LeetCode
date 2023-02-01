// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

// Constraints:
// 1 <= s.length <= 10^5
// s consists of only lowercase English letters.

class Solution {
    public int firstUniqChar(String s) {
        int indexOfFirstNonRepeatingCharacter = s.length();

        for (char character = 'a'; character <= 'z'; character++) {

            int firstIndexOfCharacter = s.indexOf(character);
            if ((firstIndexOfCharacter != -1) && (firstIndexOfCharacter == s.lastIndexOf(character))) {
                indexOfFirstNonRepeatingCharacter = Math.min(indexOfFirstNonRepeatingCharacter, firstIndexOfCharacter);
            }
        }

        return ((indexOfFirstNonRepeatingCharacter == s.length()) ? -1 : indexOfFirstNonRepeatingCharacter);
    }
}