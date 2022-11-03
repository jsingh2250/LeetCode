import java.util.HashMap;

/*
You are given an array of strings words. Each element of words consists of two lowercase English letters.

Create the longest possible palindrome by selecting some elements from words and concatenating them in any order. Each element can be selected at most once.

Return the length of the longest palindrome that you can create. If it is impossible to create any palindrome, return 0.

A palindrome is a string that reads the same forward and backward.
*/
class Solution {
    public int longestPalindrome(String[] words) {
        // Store the number of letters per word.
        final int NUMBER_OF_LETTERS_PER_WORD = 2;

        // Declare a variable to store the length of the longest palindrome that could be made.
        int lengthOfLongestPalindrome = 0;

        // Use a hash map to store the number of occurences of each word in the string array. Store each unique word as a key in the hash map. Store the number of occurences of each word as the value in the hash map.
        HashMap<String, Integer> numberOfUnmatchedOccurencesOfEachWord = new HashMap<>();
        for (String word : words) {
            String reversedWord = word.substring(1) + word.substring(0, 1);
            int numberOfUnmatchedOccurencesOfReversedWord = numberOfUnmatchedOccurencesOfEachWord
                    .getOrDefault(reversedWord, 0);
            if (numberOfUnmatchedOccurencesOfReversedWord > 0) {
                lengthOfLongestPalindrome += (2 * NUMBER_OF_LETTERS_PER_WORD);
                numberOfUnmatchedOccurencesOfEachWord.replace(reversedWord,
                        numberOfUnmatchedOccurencesOfReversedWord - 1);
            } else {
                numberOfUnmatchedOccurencesOfEachWord.put(word,
                        numberOfUnmatchedOccurencesOfEachWord.getOrDefault(word, 0) + 1);
            }
        }

        // Add two to the length of the longest palindrome if there is at least one unmatched word that is a palindrome itself. This palindromic word could be put in the middle of the palindrome created from concatenating words.
        final int NUMBER_OF_LETTERS_IN_ALPHABET = 26;
        for (Character i = 'a'; i < (NUMBER_OF_LETTERS_IN_ALPHABET + 'a'); i++) {
            String palindromicWord = i.toString() + i.toString();
            if (numberOfUnmatchedOccurencesOfEachWord.getOrDefault(palindromicWord, 0) > 0) {
                lengthOfLongestPalindrome += NUMBER_OF_LETTERS_PER_WORD;
                break;
            }
        }

        // Return the length of the longest palindrome that could be made.
        return lengthOfLongestPalindrome;
    }
}