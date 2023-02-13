import java.util.ArrayList;
import java.util.List;

// Given an integer numRows, return the first numRows of Pascal's triangle.

// Constraints:
// 1 <= numRows <= 30

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>(numRows);

        pascalsTriangle.add(new ArrayList<>(1));
        pascalsTriangle.get(0).add(1);

        for (int rowNumber = 1; rowNumber < numRows; rowNumber++) {
            pascalsTriangle.add(new ArrayList<>(rowNumber + 1));

            // First element in this row.
            pascalsTriangle.get(rowNumber).add(1);

            for (int columnNumber = 1; columnNumber < rowNumber; columnNumber++) {
                pascalsTriangle.get(rowNumber).add(pascalsTriangle.get(rowNumber - 1).get(columnNumber - 1)
                + pascalsTriangle.get(rowNumber - 1).get(columnNumber));
            }
            // Last element in this row.
            pascalsTriangle.get(rowNumber).add(1);
        }

        return pascalsTriangle;
    }
}