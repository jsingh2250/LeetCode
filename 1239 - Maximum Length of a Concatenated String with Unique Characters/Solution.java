import java.util.ArrayList;
import java.util.List;

/**
 * @see https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/discuss/2737493/PythonC%2B%2BJavaRust-0-ms-bit-and-set-operations-(with-detailed-comments)
 */
class Solution {
    // Determine the length of the longest string with unique characters that could be made from concatenating subsequences of the specified list of strings.
    public int maxLength(List<String> arr) {
        // Store the string elements from the list as a binary number in an array list if the string element has unique characters. Each bit in the binary number represents whether the element has the char associated with the bit. The nth bit in the integer represents the nth letter in the alphabet (e.g. 0th bit is 'a', 25th bit is 'z').
        final int MAX_NUMBER_OF_ELEMENTS = 26;
        ArrayList<Integer> uniqueStringsAsBinaryNumber = new ArrayList<>(MAX_NUMBER_OF_ELEMENTS);
        for (String string : arr) {
            Integer stringAsBinaryNumber = 0;
            for (int i = 0; i < string.length(); i++) {
                // Set the bit associated with the character. Duplicate characters will not set additional bits.
                int characterAsBinaryNumber = 1 << (string.charAt(i) - 'a');
                stringAsBinaryNumber |= characterAsBinaryNumber;
            }
            // If the number of set bits is the same as the number of characters in the string, the string has unique characters.
            if (Integer.bitCount(stringAsBinaryNumber) == string.length()) {
                uniqueStringsAsBinaryNumber.add(stringAsBinaryNumber);
            }
        }

        // Determine the maximum number of subsequences that can be formed from the unique strings.
        int maxNumberOfSubsequences = (int) Math.pow(2, uniqueStringsAsBinaryNumber.size());

        // Create an array list to store the concatenated subsequences with unique characters as binary numbers.
        ArrayList<Integer> uniqueSubsequencesAsBinaryNumbers = new ArrayList<>(maxNumberOfSubsequences);
        uniqueSubsequencesAsBinaryNumbers.add(0);

        // Determine the length of the longest string with unique characters that could be made from concatenating subsequences of a list of strings.
        int lengthOfLongestConcatenatedSubsequence = 0;
        for (Integer stringAsBinaryNumber : uniqueStringsAsBinaryNumber) {
            for (int i = (uniqueSubsequencesAsBinaryNumbers.size() - 1); i >= 0; i--) {
                // If the characters in the subsequence are unique to the characters in the string, add a binary number to the subsequence array list to represent the new concatenated subsequence.
                if ((uniqueSubsequencesAsBinaryNumbers.get(i) & stringAsBinaryNumber) == 0) {
                    Integer newSubsequenceAsBinaryNumber = uniqueSubsequencesAsBinaryNumbers.get(i)
                            | stringAsBinaryNumber;
                    uniqueSubsequencesAsBinaryNumbers.add(newSubsequenceAsBinaryNumber);
                    lengthOfLongestConcatenatedSubsequence = Math.max(lengthOfLongestConcatenatedSubsequence,
                            Integer.bitCount(newSubsequenceAsBinaryNumber));
                }
            }
        }

        // Return the length of the longest string with unique characters that could be made from concatenating subsequences of the specified list of strings.
        return lengthOfLongestConcatenatedSubsequence;
    }
}