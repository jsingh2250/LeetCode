import java.util.ArrayList;
import java.util.List;

// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

// Constraints:
// 1 <= n <= 8

class Solution {
    int n;
    List<String> parenthesesCombinations;
    StringBuilder currentParenthesesCombination;
    int numberOfOpeningParentheses;
    int numberOfClosingParentheses;

    public void generateParenthesisCombination() {
        if (currentParenthesesCombination.length() == 2 * n) {
            parenthesesCombinations.add(currentParenthesesCombination.toString());
            return;
        }

        if (numberOfOpeningParentheses < n) {
            currentParenthesesCombination.append('(');
            numberOfOpeningParentheses++;
            generateParenthesisCombination();
            currentParenthesesCombination.deleteCharAt(currentParenthesesCombination.length() - 1);
            numberOfOpeningParentheses--;
        }

        if (numberOfClosingParentheses < numberOfOpeningParentheses) {
            currentParenthesesCombination.append(')');
            numberOfClosingParentheses++;
            generateParenthesisCombination();
            currentParenthesesCombination.deleteCharAt(currentParenthesesCombination.length() - 1);
            numberOfClosingParentheses--;
        }
    }

    public List<String> generateParenthesis(int n) {
        this.n = n;
        parenthesesCombinations = new ArrayList<String>();
        currentParenthesesCombination = new StringBuilder(2 * n);
        generateParenthesisCombination();
        return parenthesesCombinations;
    }
}