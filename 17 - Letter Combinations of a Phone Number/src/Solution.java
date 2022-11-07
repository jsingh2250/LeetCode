import java.util.LinkedList;
import java.util.List;

// Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
class Solution {
    // Stores the letter groups associated with phone number digits two through nine.
    private static String[][] letterGroups = { { "a", "b", "c" }, { "d", "e", "f" }, { "g", "h", "i" },
            { "j", "k", "l" }, { "m", "n", "o" }, { "p", "q", "r", "s" }, { "t", "u", "v" }, { "w", "x", "y", "z" } };

    // Returns the letter group associated with the specified digit.
    private static String[] getLetterGroup(int number) {
        return letterGroups[number - 2];
    }

    // Returns a list of letter combinations made by concatenating each letter in the specified letter group with each letter combination in the specified list of letter combinations. If the specified list of letter combinations is empty, a list with each letter in the specified letter group is returned.
    public List<String> addLetterGroupToLetterCombinations(List<String> letterCombinations, String[] letterGroupToAdd) {
        List<String> newLetterCombinations = new LinkedList<>();

        if (letterCombinations.isEmpty()) {
            for (String letter : letterGroupToAdd) {
                newLetterCombinations.add(letter);
            }
        } else {
            for (String letter : letterGroupToAdd) {
                for (String letterCombination : letterCombinations) {
                    newLetterCombinations.add(letterCombination + letter);
                }
            }
        }

        return newLetterCombinations;
    }

    public List<String> letterCombinations(String digits) {
        // Create and store the letter combinations associated with the specified phone number digits.
        List<String> letterCombinations = new LinkedList<>();
        for (int digitsIndex = 0; digitsIndex < digits.length(); digitsIndex++) {
            int digit = digits.charAt(digitsIndex) - '0';
            letterCombinations = addLetterGroupToLetterCombinations(letterCombinations, getLetterGroup(digit));
        }

        // Return the letter combinations associated with the specified phone number digits.
        return letterCombinations;
    }
}