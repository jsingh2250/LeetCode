import java.util.ArrayList;

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

class Solution1 {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        
        char[] sAsCharArray = s.toCharArray();

        ArrayList<ArrayList<Character>> zigzagS = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            zigzagS.add(new ArrayList<>(s.length() / numRows + 1));
        }

        int charArrayIndex = 0;
        int currentRow = 0;
        while (charArrayIndex < sAsCharArray.length) {
            while (charArrayIndex < sAsCharArray.length && currentRow < numRows - 1) {
                zigzagS.get(currentRow).add(sAsCharArray[charArrayIndex]);
                charArrayIndex++;
                currentRow++;
            }

            while (charArrayIndex < sAsCharArray.length && currentRow > 0) {
                zigzagS.get(currentRow).add(sAsCharArray[charArrayIndex]);
                charArrayIndex++;
                currentRow--;
            }
        }

        char[] convertedS = new char[sAsCharArray.length];
        int convertedSIndex = 0;
        for (int row = 0; row < zigzagS.size(); row++) {
            for (int character = 0; character < zigzagS.get(row).size(); character++) {
                convertedS[convertedSIndex++] = zigzagS.get(row).get(character);
            }
        }

        return new String(convertedS);
    }
}