// You are given a string s of lowercase English letters and a 2D integer array shifts where shifts[i] = [starti, endi, directioni]. For every i, shift the characters in s from the index starti to the index endi (inclusive) forward if directioni = 1, or shift the characters backward if directioni = 0.

// Shifting a character forward means replacing it with the next letter in the alphabet (wrapping around so that 'z' becomes 'a'). Similarly, shifting a character backward means replacing it with the previous letter in the alphabet (wrapping around so that 'a' becomes 'z').

// Return the final string after all such shifts to s are applied.

// Constraints:
// 1 <= s.length, shifts.length <= 5 * 10^4
// shifts[i].length == 3
// 0 <= starti <= endi < s.length
// 0 <= directioni <= 1
// s consists of lowercase English letters.

class Solution1 {
    public String shiftingLetters(String s, int[][] shifts) {
        // Convert the string to a char array for quicker modification of the letters.
        char[] stringAsCharArray = s.toCharArray();

        // Shift the letters according to the specified shifts.
        for (int[] shift : shifts) {
            for (int letterIndex = shift[0]; letterIndex <= shift[1]; letterIndex++) {
                stringAsCharArray[letterIndex] += (shift[2] == 1) ? 1 : -1;
                if (stringAsCharArray[letterIndex] > 'z') {
                    stringAsCharArray[letterIndex] -= 26;
                } else if (stringAsCharArray[letterIndex] < 'a') {
                    stringAsCharArray[letterIndex] += 26;
                }
            }
        }

        // Return the shifted string.
        return new String(stringAsCharArray);
    }
}