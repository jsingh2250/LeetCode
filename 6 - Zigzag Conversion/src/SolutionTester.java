import java.util.ArrayList;

class TestCase {
        private String s;
        private int numRows;

        public TestCase(String s, int numRows) {
                this.s = s;
                this.numRows = numRows;
        }

        public String getS() {
                return s;
        }

        public int getNumRows() {
                return numRows;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase("PAYPALISHIRING", 3));
                testCases.add(new TestCase("PAYPALISHIRING", 4));
                testCases.add(new TestCase("A", 1));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + testCase.getS() + ", " + testCase.getNumRows());
                        System.out.println("The output of the solution is: "
                                        + solution.convert(testCase.getS(), testCase.getNumRows()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
