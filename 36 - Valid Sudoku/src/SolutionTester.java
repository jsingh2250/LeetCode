import java.util.Arrays;

public class SolutionTester {
    // The main method for testing the solution.
    public static void main(String[] args) throws Exception {
        // Define test cases.
        char[][][] testCases = {
                {
                        { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                        { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                        { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                        { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                        { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                        { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                        { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                        { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                        { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
                },
                {
                        { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
                        { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                        { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                        { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                        { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                        { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                        { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                        { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                        { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
                }
        };

        // Test the solution with the test cases. Print the results.
        System.out.println();
        System.out.println("Results from the solution: ");
        Solution solution = new Solution();
        for (char testCase[][] : testCases) {
            long testCaseStartTimeinNs = System.nanoTime();
            System.out.println();
            System.out.printf("The sudoku board below is valid: %b. %n%s%n", solution.isValidSudoku(testCase),
                    Arrays.deepToString(testCase));
            long testCaseEndTimeInNs = System.nanoTime();
            long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
            System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
        }
    }
}
