// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

// Constraints:
// 1 <= s.length <= 2 * 10^5
// s consists only of printable ASCII characters.

class Solution {
    public boolean isPalindrome(String s) {
        int leftCharIndex = 0;
        int rightCharIndex = s.length() - 1;

        while (leftCharIndex < rightCharIndex) {
            char leftChar = Character.toLowerCase(s.charAt(leftCharIndex));
            char rightChar = Character.toLowerCase(s.charAt(rightCharIndex));

            while (leftCharIndex < rightCharIndex && !Character.isLetterOrDigit(leftChar)) {
                leftChar = Character.toLowerCase(s.charAt(++leftCharIndex));
            }

            while (leftCharIndex < rightCharIndex && !Character.isLetterOrDigit(rightChar)) {
                rightChar = Character.toLowerCase(s.charAt(--rightCharIndex));
            }

            if (leftCharIndex++ < rightCharIndex-- && leftChar != rightChar) {
                return false;
            }
        }

        return true;
    }
}