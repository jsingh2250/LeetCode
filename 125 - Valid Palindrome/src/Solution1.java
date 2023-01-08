// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

// Constraints:
// 1 <= s.length <= 2 * 10^5
// s consists only of printable ASCII characters.

class Solution1 {
    public boolean isPalindrome(String s) {
        StringBuilder modifiedS = new StringBuilder(s.length());

        for (Character character : s.toCharArray()) {
            if (Character.isLetterOrDigit(character)) {
                modifiedS.append(Character.toLowerCase(character));
            }
        }

        int halfwayIndex = modifiedS.length() / 2;
        for (int i = 0; i < halfwayIndex; i++) {
            if (modifiedS.charAt(i) != modifiedS.charAt(modifiedS.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}