class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Declare variables that can store which digits are in each row, column, and sub-box.
        final int NUMBER_OF_ROWS_OR_COLUMNS_OF_CELLS = 9;
        int[] binaryEncodedNumbersInRows = new int[NUMBER_OF_ROWS_OR_COLUMNS_OF_CELLS];
        int[] binaryEncodedNumbersInColumns = new int[NUMBER_OF_ROWS_OR_COLUMNS_OF_CELLS];
        final int NUMBER_OF_ROWS_OR_COLUMNS_OF_SUB_BOXES = 3;
        int[][] binaryEncodedNumbersInSubBoxes = new int[NUMBER_OF_ROWS_OR_COLUMNS_OF_SUB_BOXES][NUMBER_OF_ROWS_OR_COLUMNS_OF_SUB_BOXES];

        // If any of the rows, columns, or sub-boxes contain duplicate numbers, the sudoku is not valid. Return false.
        for (int row = 0; row < NUMBER_OF_ROWS_OR_COLUMNS_OF_CELLS; row++) {
            for (int column = 0; column < NUMBER_OF_ROWS_OR_COLUMNS_OF_CELLS; column++) {
                // Skip the current cell if it doesn't contain a digit.
                if (board[row][column] == '.') {
                    continue;
                }

                // Store an encoded version of the number from the cell by setting the bit that corresponds to the number.
                int binaryEncodedNumber = 1 << (board[row][column] - '0');

                // Check for duplicate numbers in the current row. If there aren't duplicates, set the bit corresponding to the number from the cell in the number that represents the current row.
                if ((binaryEncodedNumbersInRows[row] & binaryEncodedNumber) != 0) {
                    return false;
                }
                binaryEncodedNumbersInRows[row] |= binaryEncodedNumber;

                // Check for duplicate numbers in the current column. If there aren't duplicates, set the bit corresponding to the number from the cell in the number that represents the current column.
                if ((binaryEncodedNumbersInColumns[column] & binaryEncodedNumber) != 0) {
                    return false;
                }
                binaryEncodedNumbersInColumns[column] |= binaryEncodedNumber;

                // Check for duplicate numbers in the current sub-box. If there aren't duplicates, set the bit corresponding to the number from the cell in the number that represents the current sub-box.
                int subBoxRow = row / NUMBER_OF_ROWS_OR_COLUMNS_OF_SUB_BOXES;
                int subBoxColumn = column / NUMBER_OF_ROWS_OR_COLUMNS_OF_SUB_BOXES;
                if ((binaryEncodedNumbersInSubBoxes[subBoxRow][subBoxColumn] & binaryEncodedNumber) != 0) {
                    return false;
                }
                binaryEncodedNumbersInSubBoxes[subBoxRow][subBoxColumn] |= binaryEncodedNumber;
            }
        }

        // The rows, columns, and sub-boxes did not contain duplicate numbers. The sudoku is valid. Return true.
        return true;
    }
}