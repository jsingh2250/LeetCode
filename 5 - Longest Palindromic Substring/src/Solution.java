class Solution {
    public String longestPalindrome(String s, String longestPalindrome, int leftIndex, int rightIndex) {
        while ((leftIndex >= 0) && (rightIndex < s.length()) && (s.charAt(leftIndex) == s.charAt(rightIndex))) {
            if (longestPalindrome.length() < (rightIndex - leftIndex + 1)) {
                longestPalindrome = s.substring(leftIndex, rightIndex + 1);
            }
            leftIndex--;
            rightIndex++;
        }
        return longestPalindrome;
    }

    public String longestPalindrome(String s) {
        // Store the first character as the longest palindrome so one character palindromes don't need to be checked in the following steps.
        String longestPalindrome = Character.toString(s.charAt(0));

        // Find the longest palindrome if one exists of length greater than one character.
        for (int palindromeMidpoint = 0; palindromeMidpoint < s.length() - 1; palindromeMidpoint++) {
            int leftIndex = palindromeMidpoint;
            int rightIndex = palindromeMidpoint + 1;
            // Check for a longer even length palindrome.
            longestPalindrome = longestPalindrome(s, longestPalindrome, leftIndex, rightIndex);
            // Check for a longer odd length palindrome.
            rightIndex++;
            longestPalindrome = longestPalindrome(s, longestPalindrome, leftIndex, rightIndex);
        }

        return longestPalindrome;
    }
}