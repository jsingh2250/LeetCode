import java.util.ArrayList;

// You are given an array of n strings strs, all of the same length.

// We may choose any deletion indices, and we delete all the characters in those indices for each string.

// For example, if we have strs = ["abcdef","uvwxyz"] and deletion indices {0, 2, 3}, then the final array after deletions is ["bef", "vyz"].

// Suppose we chose a set of deletion indices answer such that after deletions, the final array has its elements in lexicographic order (i.e., strs[0] <= strs[1] <= strs[2] <= ... <= strs[n - 1]). Return the minimum possible value of answer.length.

// Constraints:
// n == strs.length
// 1 <= n <= 100
// 1 <= strs[i].length <= 100
// strs[i] consists of lowercase English letters.

class Solution {
    public int minDeletionSize(String[] strs) {
        // Declare a variable to store the minimum number of deletion indices are needed to put the final array in lexicographic order.
        int minimumNumberOfDeletionIndices = 0;

        // Declare a variable to store which strings are in lexicographic order.
        boolean[] isStrsInLexicographicOrder = new boolean[strs.length];
        isStrsInLexicographicOrder[0] = true;

        // Count the number of deletion indices required to put the string array in lexicographic order.
        for (int charsIndex = 0; charsIndex < strs[0].length(); charsIndex++) {
            // Declare a variable to store which strings are in lexicographic order for the current char.
            ArrayList<Integer> indicesOfStringsInLexicographicOrderForCurrentChar = new ArrayList<>(strs.length);

            // Go through all of the strings in the string array that aren't already in lexicographic order to determine which ones are in lexicographic order for the current char.
            int stringsIndex;
            for (stringsIndex = 1; stringsIndex < strs.length; stringsIndex++) {
                if (isStrsInLexicographicOrder[stringsIndex]) {
                    continue;
                }

                char previousStringsChar = strs[stringsIndex - 1].charAt(charsIndex);
                char currentStringsChar = strs[stringsIndex].charAt(charsIndex);

                // If the current string is in lexicographic order for the current char, store the string's index.
                if (previousStringsChar < currentStringsChar) {
                    indicesOfStringsInLexicographicOrderForCurrentChar.add(stringsIndex);

                // If the current string is not in lexicographic order, this char index would be added to the deletion indices. Increment the number of deletion indices. The remaining strings don't need to be checked for lexicographic order for the current char since this char would be deleted anyway.
                } else if (previousStringsChar > currentStringsChar) {
                    minimumNumberOfDeletionIndices++;
                    break;
                }
            }

            // If all of the strings in the string array were checked for whether they were in lexicographic order for the current char, the strings in lexicographic order for the current char are in lexicographic order in general. Store that these strings are in lexicographic order.
            if (stringsIndex == strs.length) {
                for (int strsIndex : indicesOfStringsInLexicographicOrderForCurrentChar) {
                    isStrsInLexicographicOrder[strsIndex] = true;
                }
            }

        }

        // Return the minimum number of deletion indices.
        return minimumNumberOfDeletionIndices;
    }
}