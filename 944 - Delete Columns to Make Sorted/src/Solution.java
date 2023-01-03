// You are given an array of n strings strs, all of the same length.

// The strings can be arranged such that there is one on each line, making a grid. For example, strs = ["abc", "bce", "cae"] can be arranged as:

// abc
// bce
// cae
// You want to delete the columns that are not sorted lexicographically. In the above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted while column 1 ('b', 'c', 'a') is not, so you would delete column 1.

// Return the number of columns that you will delete.

// Constraints:
// n == strs.length
// 1 <= n <= 100
// 1 <= strs[i].length <= 1000
// strs[i] consists of lowercase English letters.

class Solution {
    public int minDeletionSize(String[] strs) {
        if (strs.length == 1) {
            return 0;
        }

        int numberOfColumnsToDelete = 0;

        for (int columnNumber = 0; columnNumber < strs[0].length(); columnNumber++) {
            for (int rowNumber = 1; rowNumber < strs.length; rowNumber++) {
                if (strs[rowNumber].charAt(columnNumber) < strs[rowNumber - 1].charAt(columnNumber)) {
                    numberOfColumnsToDelete++;
                    break;
                }
            }
        }

        return numberOfColumnsToDelete;
    }
}