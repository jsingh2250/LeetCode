// You are given a string s of lowercase English letters and a 2D integer array shifts where shifts[i] = [starti, endi, directioni]. For every i, shift the characters in s from the index starti to the index endi (inclusive) forward if directioni = 1, or shift the characters backward if directioni = 0.

// Shifting a character forward means replacing it with the next letter in the alphabet (wrapping around so that 'z' becomes 'a'). Similarly, shifting a character backward means replacing it with the previous letter in the alphabet (wrapping around so that 'a' becomes 'z').

// Return the final string after all such shifts to s are applied.

// Constraints:
// 1 <= s.length, shifts.length <= 5 * 10^4
// shifts[i].length == 3
// 0 <= starti <= endi < s.length
// 0 <= directioni <= 1
// s consists of lowercase English letters.

class Solution5 {
    public String shiftingLetters(String s, int[][] shifts) {
        // Declare a variable to store the cumulative shift of the characters in the specified string.
        // Length should be one greater than string to the array to show that the last character in the string is the end point of the cumulative shift.
        int[] cumulativeShift = new int[s.length() + 1];

        // Store the cumulative shift of the characters.
        for (int[] shift : shifts) {
            // Store the amount to shift by.
            int shiftAmount = (shift[2] == 1) ? 1 : -1;

            // Mark the inclusive start index of the shift.
            cumulativeShift[shift[0]] += shiftAmount;
            
            // Mark the exclusive end index of the shift.
            cumulativeShift[shift[1] + 1] -= shiftAmount;
        }

        // Fill in the shift amounts at each index according to the shift amounts at the start and end points of each shift.
        for (int letterIndex = 1; letterIndex < cumulativeShift.length; letterIndex++) {
            cumulativeShift[letterIndex] += cumulativeShift[letterIndex - 1];
        }
        
        // Declare a string builder variable to build the shifted string.
        StringBuilder string = new StringBuilder(s.length());

        // Use a variable to keep track of the cumulative shift amount.
        int cumulativeShiftAmount = 0;

        // Use string builder to build the shifted string.
        for (int letterIndex = 0; letterIndex < s.length(); letterIndex++) {
            // Calculate the shifted char value.
            int shiftedCharValue = s.charAt(letterIndex) + (cumulativeShift[letterIndex] % 26);

            // Adjust the char value so it's within the range of the lowercase letters.
            if (shiftedCharValue < 'a') {
                shiftedCharValue += 26;
            } else if (shiftedCharValue > 'z') {
                shiftedCharValue -= 26;
            }

            // Append the char value to the string builder.
            string.append((char) shiftedCharValue);
        }

        // Return the shifted string.
        return string.toString();
    }
}