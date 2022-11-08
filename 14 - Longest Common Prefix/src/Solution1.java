/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 * If there is no common prefix, return an empty string "".
 */
class Solution1 {
    public String longestCommonPrefix(String[] strs) {
        // If the first string in the string array is a string of length zero, return an empty string.
        if (strs[0].length() == 0) {
            return "";
        }

        // If the string array only has one string, return the string.
        if (strs.length == 1) {
            return strs[0];
        }
        
        // Find the longest common prefix string amongst the specified array of strings.
        String longestCommonPrefix = "";
        for (int strsIndex = 1; strsIndex < strs.length; strsIndex++) {
            // Stop adding letters to the common prefix string if the string doesn't have any more letters.
            if (strs[strsIndex].length() <= longestCommonPrefix.length()) {
                break;
            }

            // Stop adding letters to the common prefix string if the string's letter doesn't match the next string's letter.
            if (strs[strsIndex - 1].charAt(longestCommonPrefix.length()) != strs[strsIndex]
                    .charAt(longestCommonPrefix.length())) {
                break;
            }

            // Determine whether all of the strings in the specified string array have been checked for the current letter that is being considered as the next letter in the common prefix string.
            if ((strsIndex) == (strs.length - 1)) {
                // Add the letter to the common prefix string because all of the strings have this letter at this string index.
                longestCommonPrefix += strs[0].charAt(longestCommonPrefix.length());

                // If the first string in the string array has another letter, determine whether the letter is a common prefix string in the string array.
                if (strs[0].length() <= longestCommonPrefix.length()) {
                    break;
                }
                strsIndex = 0;
            }
        }

        // Return the longest common prefix string.
        return longestCommonPrefix;
    }
}