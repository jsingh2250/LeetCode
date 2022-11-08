import java.util.Arrays;

/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 * If there is no common prefix, return an empty string "".
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Determine the length of the shortest string.
        int lengthOfShortestString = strs[0].length();
        for (int strsIndex = 1; strsIndex < strs.length; strsIndex++) {
            lengthOfShortestString = Math.min(lengthOfShortestString, strs[strsIndex].length());
        }

        // Sort the specified string array.
        Arrays.sort(strs);

        // Find the longest common prefix string amongst the specified array of strings.
        int stringIndex;
        for (stringIndex = 0; stringIndex < lengthOfShortestString; stringIndex++) {
            if (strs[0].charAt(stringIndex) != strs[strs.length - 1].charAt(stringIndex)) {
                break;
            }
        }
        
        // Return the longest common prefix string amongst the specified array of strings.
        return strs[0].substring(0, stringIndex);
    }
}