import java.util.ArrayList;

class TestCase {
        private String columnTitle;

        public TestCase(String columnTitle) {
                this.columnTitle = columnTitle;
        }

        public String getColumnTitle() {
                return columnTitle;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase("A"));
                testCases.add(new TestCase("AB"));
                testCases.add(new TestCase("ZY"));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + testCase.getColumnTitle());
                        System.out.println("The output of the solution is: "
                                        + solution.titleToNumber(testCase.getColumnTitle()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
