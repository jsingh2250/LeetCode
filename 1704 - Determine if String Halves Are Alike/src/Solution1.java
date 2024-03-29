import java.util.Set;

// You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

// Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

// Return true if a and b are alike. Otherwise, return false.

// Constraints:
// 2 <= s.length <= 1000
// s.length is even.
// s consists of uppercase and lowercase letters.

class Solution1 {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int numberOfVowelsInFirstHalf = 0;
        int numberOfVowelsInSecondHalf = 0;
        int lengthOfHalfOfS = s.length() / 2;
        
        for (int i = 0; i < lengthOfHalfOfS; i++) {
            if (vowels.contains(s.charAt(i))) {
                numberOfVowelsInFirstHalf++;
            }
            if (vowels.contains(s.charAt(i + lengthOfHalfOfS))) {
                numberOfVowelsInSecondHalf++;
            }
        }

        return (numberOfVowelsInFirstHalf == numberOfVowelsInSecondHalf);
    }
}