import java.util.ArrayList;
import java.util.List;

// Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

// Constraints:
// 0 <= rowIndex <= 33

class Solution1 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> previousRow = row;
            row = new ArrayList<>(rowIndex + 1);

            row.add(1);
            for (int j = 1; j <= (i - 1); j++) {
                row.add(previousRow.get(j - 1) + previousRow.get(j));
            }
            row.add(1);
        }

        return row;
    }
}