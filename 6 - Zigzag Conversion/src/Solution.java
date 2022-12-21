// The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

// P   A   H   N
// A P L S I I G
// Y   I   R
// And then read line by line: "PAHNAPLSIIGYIR"

// Write the code that will take a string and make this conversion given a number of rows:

// Constraints:
// 1 <= s.length <= 1000
// s consists of English letters (lower-case and upper-case), ',' and '.'.
// 1 <= numRows <= 1000

class Solution {
    public String convert(String s, int numRows) {
        // The string does not get modified if there is only one row in the zigzag pattern. Return the string as is.
        if (numRows == 1) {
            return s;
        }

        // Create a string builder variable to build the string that represents the zigzag pattern.
        StringBuilder convertedS = new StringBuilder(s.length());

        // A cycle starts at the top row where the zigzag pattern goes straight down and ends at the row below the top row where the zigzag pattern goes diagonally up and to the right.
        final int NUMBER_OF_CHARACTERS_PER_CYCLE = 2 * (numRows - 1);

        // Put the characters that would be in each row of the zigzag pattern into the string builder variable one row at a time.
        for (int row = 0; row < numRows; row++) {
            // Add all of the characters that would be in the current row of the zigzag pattern to the converted string.
            int indexOfFirstCharacterInCycle = row;
            int spacingBetweenFirstAndSecondCharacterInCycle = 2 * (numRows - 1 - row);
            while (indexOfFirstCharacterInCycle < s.length()) {
                // Add the first character in the cycle from the current row of the zigzag pattern.
                convertedS.append(s.charAt(indexOfFirstCharacterInCycle));

                // If the current row isn't the first or last row in the zigzag pattern, add the second character in the cycle from the current row of the zigzag pattern.
                if (((indexOfFirstCharacterInCycle + spacingBetweenFirstAndSecondCharacterInCycle) < s.length())
                        && (row != 0) && (row != (numRows - 1))) {
                    convertedS.append(
                            s.charAt(indexOfFirstCharacterInCycle + spacingBetweenFirstAndSecondCharacterInCycle));
                }

                // Calculate the index of the next character that would be in the current row of the zigzag pattern.
                indexOfFirstCharacterInCycle += NUMBER_OF_CHARACTERS_PER_CYCLE;
            }
        }

        // Return the converted string that represents the zigzag pattern.
        return convertedS.toString();
    }
}