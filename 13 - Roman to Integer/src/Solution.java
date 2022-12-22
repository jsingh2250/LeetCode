// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer.

// Constraints:
// 1 <= s.length <= 15
// s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
// It is guaranteed that s is a valid roman numeral in the range [1, 3999].

class Solution {
    public int romanToInt(String s) {
        int value = 0;

        char[] sAsCharArray = s.toCharArray();
        for (int sIndex = 0; sIndex < sAsCharArray.length; sIndex++) {
            switch (sAsCharArray[sIndex]) {
                case 'I':
                if ((sIndex < sAsCharArray.length - 1) && (sAsCharArray[sIndex + 1] == 'V' || sAsCharArray[sIndex + 1] == 'X')) {
                    value -= 1;
                }
                else {
                    value += 1;
                }
                break;

                case 'V':
                value += 5;
                break;

                case 'X':
                if ((sIndex < sAsCharArray.length - 1) && (sAsCharArray[sIndex + 1] == 'L' || sAsCharArray[sIndex + 1] == 'C')) {
                    value -= 10;
                }
                else {
                    value += 10;
                }
                break;

                case 'L':
                value += 50;
                break;

                case 'C':
                if ((sIndex < sAsCharArray.length - 1) && (sAsCharArray[sIndex + 1] == 'D' || sAsCharArray[sIndex + 1] == 'M')) {
                    value -= 100;
                }
                else {
                    value += 100;
                }
                break;
                
                case 'D':
                value += 500;
                break;
                
                case 'M':
                value += 1000;
                break;
            }
        }

        return value;
    }
}