import java.util.ArrayList;

class TestCase {
        private int rowIndex;

        public TestCase(int rowIndex) {
                this.rowIndex = rowIndex;
        }

        public int getRowIndex() {
                return rowIndex;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase(3));
                testCases.add(new TestCase(0));
                testCases.add(new TestCase(1));
                testCases.add(new TestCase(33));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + testCase.getRowIndex());
                        System.out.println("The output of the solution is: " + solution.getRow(testCase.getRowIndex()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
