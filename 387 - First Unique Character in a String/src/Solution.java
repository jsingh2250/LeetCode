import java.util.HashMap;

// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

// Constraints:
// 1 <= s.length <= 10^5
// s consists of only lowercase English letters.

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> firstIndexByCharacter = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentCharacter = s.charAt(i);

            if (firstIndexByCharacter.containsKey(currentCharacter)) {
                firstIndexByCharacter.put(currentCharacter, s.length());
            }
            else {
                firstIndexByCharacter.put(currentCharacter, i);
            }
        }

        int indexOfFirstNonRepeatingCharacter = s.length();
        for (int index : firstIndexByCharacter.values()) {
            indexOfFirstNonRepeatingCharacter = Math.min(index, indexOfFirstNonRepeatingCharacter);
        }

        return (indexOfFirstNonRepeatingCharacter == s.length()) ? -1 : indexOfFirstNonRepeatingCharacter;
    }
}