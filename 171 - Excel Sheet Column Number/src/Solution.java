// Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

// Constraints:
// 1 <= columnTitle.length <= 7
// columnTitle consists only of uppercase English letters.
// columnTitle is in the range ["A", "FXSHRXW"].

class Solution {
    public int titleToNumber(String columnTitle) {
        // Use an approach that's similar to the approach of converting a hex number to decimal number.
        int columnNumber = 0;

        int weightOfDigit = 1;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            // '@' is the symbol before 'A' in the ascii table.
            columnNumber += (columnTitle.charAt(i) - '@') * weightOfDigit;

            // Multiply by 26 to get the weight of the next base-26 digit.
            weightOfDigit *= 26;
        }

        return columnNumber;
    }
}