// You are given a string s of lowercase English letters and a 2D integer array shifts where shifts[i] = [starti, endi, directioni]. For every i, shift the characters in s from the index starti to the index endi (inclusive) forward if directioni = 1, or shift the characters backward if directioni = 0.

// Shifting a character forward means replacing it with the next letter in the alphabet (wrapping around so that 'z' becomes 'a'). Similarly, shifting a character backward means replacing it with the previous letter in the alphabet (wrapping around so that 'a' becomes 'z').

// Return the final string after all such shifts to s are applied.

// Constraints:
// 1 <= s.length, shifts.length <= 5 * 10^4
// shifts[i].length == 3
// 0 <= starti <= endi < s.length
// 0 <= directioni <= 1
// s consists of lowercase English letters.

class Solution3 {
    public String shiftingLetters(String s, int[][] shifts) {
        // Declare a string builder variable to build the shifted string.
        StringBuilder string = new StringBuilder(s.length());

        // Declare a variable to store the cumulative shift of the characters in the specified string.
        int[] cumulativeShift = new int[s.length()];

        // Store the cumulative shift of the characters.
        for (int[] shift : shifts) {
            for (int letterIndex = shift[0]; letterIndex <= shift[1]; letterIndex++) {
                cumulativeShift[letterIndex] += (shift[2] == 1) ? 1 : -1;
            }
        }

        // Use string builder to build the shifted string.
        for (int letterIndex = 0; letterIndex < s.length(); letterIndex++) {
            int shiftedCharValue = s.charAt(letterIndex) + (cumulativeShift[letterIndex] % 26);
            
            if (shiftedCharValue < 'a') {
                shiftedCharValue += 26;
            }
            else if (shiftedCharValue > 'z') {
                shiftedCharValue -= 26;
            }

            string.append((char) shiftedCharValue);
        }

        // Return the shifted string.
        return string.toString();
    }
}