import java.util.Arrays;
import java.util.List;

// Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

// Constraints:
// 0 <= rowIndex <= 33

class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer[] row = new Integer[rowIndex + 1];

        // Initialize array elements with all zeros.
        Arrays.fill(row, 0);

        // First element in the row is always 1.
        row[0] = 1;

        for (int i = 1; i <= rowIndex; i++) {
            // Calculate every element in the current row except for the first element. Each element can be calculated with data from the previous row. The data from the previous row is in the array until it is overwritten. Traverse through the array backwards to access data from the previous row before it is overwritten.
            for (int j = i; j > 0; j--) {
                row[j] = row[j - 1] + row[j];
            }
        }

        return Arrays.asList(row);
    }
}