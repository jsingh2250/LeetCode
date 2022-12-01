// You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

// You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

// Constraints:
// n == matrix.length == matrix[i].length
// 1 <= n <= 20
// -1000 <= matrix[i][j] <= 1000

class Solution {
    private void rotateBorder(int[][] matrix, int borderLevel) {
        // The outside border of the matrix is border level zero. Inner borders are higher levels. Each step closer to the center increments the border level by one.
        // Return after all of the border levels have been rotated.
        if (borderLevel == (matrix.length / 2)) {
            return;
        }

        final int START_INDEX = borderLevel;
        final int END_INDEX = matrix.length - 1 - borderLevel;

        for (int startFromColumn = START_INDEX; startFromColumn < END_INDEX; startFromColumn++) {
            int fromRow = START_INDEX;
            int fromColumn = startFromColumn;
            int valueBeingMoved = matrix[fromRow][fromColumn];
            int valueBeingOverwritten;

            int toRow = -1;
            int toColumn = -1;

            do {
                if (fromRow == START_INDEX && fromColumn < END_INDEX) {
                    toRow = fromColumn;
                    toColumn = END_INDEX;
                    // fromColumn++;
                } else if (fromRow < END_INDEX && fromColumn == END_INDEX) {
                    toRow = END_INDEX;
                    toColumn = END_INDEX - (fromRow - borderLevel);
                    // fromRow++;
                } else if (fromRow == END_INDEX && fromColumn > START_INDEX) {
                    toRow = fromColumn;
                    toColumn = START_INDEX;
                    // fromColumn--;
                } else if (fromRow > START_INDEX && fromColumn == START_INDEX) {
                    toRow = START_INDEX;
                    toColumn = END_INDEX - (fromRow - borderLevel);
                    // fromRow--;
                }

                valueBeingOverwritten = matrix[toRow][toColumn];
                matrix[toRow][toColumn] = valueBeingMoved;

                fromRow = toRow;
                fromColumn = toColumn;
                valueBeingMoved = valueBeingOverwritten;
            } while (toRow != START_INDEX || toColumn != startFromColumn);
        }

        rotateBorder(matrix, borderLevel + 1);
    }

    public void rotate(int[][] matrix) {
        rotateBorder(matrix, 0);
    }
}