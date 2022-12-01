import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
        private int[][] matrix;
        private int[][] rotatedMatrix;

        public TestCase(int[][] matrix, int[][] rotatedMatrix) {
                this.matrix = matrix;
                this.rotatedMatrix = rotatedMatrix;
        }

        public int[][] getMatrix() {
                return this.matrix;
        }

        public int[][] getRotatedMatrix() {
                return this.rotatedMatrix;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
                                new int[][] { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } }));
                testCases.add(new TestCase(
                                new int[][] { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } },
                                new int[][] { { 15, 13, 2, 5 }, { 14, 3, 4, 1 }, { 12, 6, 8, 9 }, { 16, 7, 10, 11 } }));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + Arrays.deepToString(testCase.getMatrix()));
                        solution.rotate(testCase.getMatrix());
                        System.out.println("The output of the solution is: " + Arrays.deepToString(testCase.getMatrix())
                                        + "\n" +
                                        "The output of the solution should be: "
                                        + Arrays.deepToString(testCase.getRotatedMatrix())
                                        + "\n" +
                                        Arrays.deepEquals(testCase.getMatrix(), testCase.getRotatedMatrix()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
