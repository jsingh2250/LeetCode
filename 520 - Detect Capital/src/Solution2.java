// We define the usage of capitals in a word to be right when one of the following cases holds:

// All letters in this word are capitals, like "USA".
// All letters in this word are not capitals, like "leetcode".
// Only the first letter in this word is capital, like "Google".
// Given a string word, return true if the usage of capitals in it is right.

// Constraints:
// 1 <= word.length <= 100
// word consists of lowercase and uppercase English letters.

class Solution2 {
    public boolean detectCapitalUse(String word) {
        int numberOfCapitalLetters = 0;

        char[] wordAsCharArray = word.toCharArray();
        for (int i = 0; i < wordAsCharArray.length; i++) {
            if (Character.isUpperCase(wordAsCharArray[i])) {
                numberOfCapitalLetters++;
            }
        }

        if (numberOfCapitalLetters == 0 || numberOfCapitalLetters == word.length()) {
            return true;
        }

        if (numberOfCapitalLetters == 1 && Character.isUpperCase(wordAsCharArray[0])) {
            return true;
        }

        return false;
    }
}