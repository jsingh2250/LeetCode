// We define the usage of capitals in a word to be right when one of the following cases holds:

// All letters in this word are capitals, like "USA".
// All letters in this word are not capitals, like "leetcode".
// Only the first letter in this word is capital, like "Google".
// Given a string word, return true if the usage of capitals in it is right.

// Constraints:
// 1 <= word.length <= 100
// word consists of lowercase and uppercase English letters.

class Solution1 {

    public boolean detectCapitalUse(String word) {
        String wordAfterFirstLetter = word.substring(1);

        if (wordAfterFirstLetter.equals(wordAfterFirstLetter.toLowerCase())) {
            return true;
        }
        else if (word.equals(word.toUpperCase())) {
            return true;
        }

        return false;
    }
}