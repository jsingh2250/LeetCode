import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {
    // Determine the length of the longest string with unique characters that could be made by concatenating subsequences of the specified list of strings.
    public int maxLengthHelper(List<String> arr, int arrIndex, HashSet<Character> charactersInConcatenatedString,
            int lengthOfLongestConcatenatedString) {
        // If the list index is equal to the size of the list, return the length of the longest concatenated string found so far.
        if (arrIndex == arr.size()) {
            return lengthOfLongestConcatenatedString;
        }

        // Check the length of each concatenated subsequence of string elements that has unique characters.
        for (int i = arrIndex; i < arr.size(); i++) {
            // Store the a string from the list of strings.
            String string = arr.get(i);

            // Create a new set to store the characters in the concatenated string.
            int numberOfLettersInAlphabet = 26;
            HashSet<Character> charactersInNewConcatenatedString = new HashSet<>(numberOfLettersInAlphabet);
            charactersInNewConcatenatedString.addAll(charactersInConcatenatedString);

            // Create a new set to store the characters in the string.
            HashSet<Character> charactersInString = new HashSet<>(numberOfLettersInAlphabet);

            // If the characters in the string are unique, add them to the new character set.
            boolean charactersInStringAreUnique = true;
            for (int stringIndex = 0; stringIndex < string.length(); stringIndex++) {
                Character character = string.charAt(stringIndex);
                if (charactersInConcatenatedString.contains(character) || charactersInString.contains(character)) {
                    charactersInStringAreUnique = false;
                    break;
                }
                charactersInString.add(character);
            }
            if (charactersInStringAreUnique) {
                for (int stringIndex = 0; stringIndex < string.length(); stringIndex++) {
                    charactersInNewConcatenatedString.add(string.charAt(stringIndex));
                }
            }

            // Update the length of the longest concatenated string.
            lengthOfLongestConcatenatedString = Math.max(lengthOfLongestConcatenatedString,
                    charactersInNewConcatenatedString.size());

            // Determine the length of the longest string with unique characters that could be made by concatenating subsequences of the specified list of strings.
            lengthOfLongestConcatenatedString = maxLengthHelper(arr, arrIndex + 1, charactersInNewConcatenatedString,
                    lengthOfLongestConcatenatedString);
        }

        // Return the length of the longest string with unique characters that could be made by concatenating subsequences of the specified list of strings.
        return lengthOfLongestConcatenatedString;
    }

    // Determine the length of the longest string with unique characters that could be made by concatenating subsequences of the specified list of strings.
    public int maxLength(List<String> arr) {
        // Create a set to store the characters in the concatenated string.
        HashSet<Character> charactersInConcatenatedString = new HashSet<>();

        // Declare a variable for storing the length of the longest string with unique characters that could be made by concatenating subsequences of the specified list of strings.
        int lengthOfLongestConcatenatedString = 0;

        // Determine the length of the longest string with unique characters that could be made by concatenating subsequences of the specified list of strings.
        int arrIndex = 0;
        return maxLengthHelper(arr, arrIndex, charactersInConcatenatedString, lengthOfLongestConcatenatedString);
    }

    // The main method for testing the solution.
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        ArrayList<String> testCase = new ArrayList<>(Arrays.asList("un", "iq", "ue"));
        int returnedSolution = solution.maxLength(testCase);
        System.out.println(returnedSolution);

        testCase = new ArrayList<>(Arrays.asList("aa", "bb"));
        returnedSolution = solution.maxLength(testCase);
        System.out.println(returnedSolution);

        testCase = new ArrayList<>(Arrays.asList("abcdefghijklmnopqrstuvwxyz"));
        returnedSolution = solution.maxLength(testCase);
        System.out.println(returnedSolution);
    }
}