import java.util.List;

class Solution {
    // Determine the length of the longest string with unique characters that could be made by concatenating subsequences of the specified list of strings.
    public int maxLengthHelper(List<String> arr, int arrIndex, String concatenatedSubsequence,
            int lengthOfLongestConcatenatedSubsequence) {
        // If the list index is equal to the size of the list, return the length of the longest concatenated subsequence.
        if (arrIndex == arr.size()) {
            return lengthOfLongestConcatenatedSubsequence;
        }

        // Determine the length of each concatenated subsequence that has unique characters.
        for (int i = arrIndex; i < arr.size(); i++) {
            // Store the string from the list of strings.
            String string = arr.get(i);

            // Determine whether the characters in the string are unique within the string and within the subsequence.
            boolean areCharactersUnique = false;
            for (int stringIndex = 0; stringIndex < string.length(); stringIndex++) {
                // Get a character from the string.
                String character = string.substring(stringIndex, stringIndex + 1);

                // Determine whether the character is unique within the string.
                boolean isCharacterUniqueInString = (string.lastIndexOf(character)) == stringIndex;

                // Determine whether the character is unique within the concatenated subsequence.
                boolean isCharacterUniqueInSubsequence = !concatenatedSubsequence.contains(character);

                // Store whether the character is unique within the string and within the subsequence.
                areCharactersUnique = isCharacterUniqueInString && isCharacterUniqueInSubsequence;

                // If the character isn't unique, don't check the rest of the characters in the string.
                if (!areCharactersUnique) {
                    break;
                }
            }

            // If the characters in the string are unique, add them to the concatenated subsequence.
            if (areCharactersUnique) {
                concatenatedSubsequence += string;

                // Update the length of the longest concatenated subsequence if the new concatenated subsequence is longer than the previous concatenated subsequences.
                lengthOfLongestConcatenatedSubsequence = Math.max(lengthOfLongestConcatenatedSubsequence,
                        concatenatedSubsequence.length());
            }

            // Determine the length of the longest string with unique characters that could be made by concatenating subsequences of the specified list of strings.
            lengthOfLongestConcatenatedSubsequence = maxLengthHelper(arr, arrIndex + 1, concatenatedSubsequence,
                    lengthOfLongestConcatenatedSubsequence);

            // If the characters in the string are unique, remove them from the concatenated subsequence.
            if (areCharactersUnique) {
                concatenatedSubsequence = concatenatedSubsequence.substring(0, concatenatedSubsequence.length() - string.length());
            }
        }

        // Return the length of the longest string with unique characters that could be made by concatenating subsequences of the specified list of strings.
        return lengthOfLongestConcatenatedSubsequence;
    }

    // Determine the length of the longest string with unique characters that could be made by concatenating subsequences of the specified list of strings.
    public int maxLength(List<String> arr) {
        int arrIndex = 0;
        String concatenatedSubsequence = "";
        int lengthOfLongestConcatenatedSubsequence = 0;
        return maxLengthHelper(arr, arrIndex, concatenatedSubsequence, lengthOfLongestConcatenatedSubsequence);
    }
}