// Write a function that reverses a string. The input string is given as an array of characters s.

// You must do this by modifying the input array in-place with O(1) extra memory.

// Constraints:
// 1 <= s.length <= 10^5
// s[i] is a printable ascii character.

class Solution {
    public void reverseString(char[] s) {
        int lowIndex = 0;
        int highIndex = s.length - 1;

        while (lowIndex < highIndex) {
            char temp = s[lowIndex];
            s[lowIndex++] = s[highIndex];
            s[highIndex--] = temp;
        }
    }
}