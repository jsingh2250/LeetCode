class Solution {
    public boolean checkValid(int[][] matrix) {
        // Declare variables that can store which numbers are in each row and column.
        final int NUMBER_OF_ROWS_OR_COLUMNS = matrix.length;
        boolean[][] numbersInRows = new boolean[NUMBER_OF_ROWS_OR_COLUMNS][NUMBER_OF_ROWS_OR_COLUMNS];
        boolean[][] numbersInColumns = new boolean[NUMBER_OF_ROWS_OR_COLUMNS][NUMBER_OF_ROWS_OR_COLUMNS];

        // If any of the rows or columns contain duplicate numbers, the matrix is not valid. Return false.
        for (int row = 0; row < NUMBER_OF_ROWS_OR_COLUMNS; row++) {
            for (int column = 0; column < NUMBER_OF_ROWS_OR_COLUMNS; column++) {
                // Store the current number from the matrix. Subtract one from the number before storing it to make it easy to use as an index.
                int number = matrix[row][column] - 1;

                // Check for duplicate numbers in the current row. If there aren't duplicates, store that the number is in the current row.
                if (numbersInRows[row][number]) {
                    return false;
                }
                numbersInRows[row][number] = true;

                // Check for duplicate numbers in the current column. If there aren't duplicates, store that the number is in the current column.
                if (numbersInColumns[column][number]) {
                    return false;
                }
                numbersInColumns[column][number] = true;
            }
        }

        // The rows and columns did not contain duplicate numbers. The matrix is valid. Return true.
        return true;
    }
}