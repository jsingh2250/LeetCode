import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
        private String[] strs;

        public TestCase(String[] word) {
                this.strs = word;
        }

        public String[] getStrs() {
                return strs;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase(new String[] { "cba", "daf", "ghi" }));
                testCases.add(new TestCase(new String[] { "a","b" }));
                testCases.add(new TestCase(new String[] { "zyx","wvu","tsr" }));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + Arrays.toString(testCase.getStrs()));
                        System.out.println("The output of the solution is: "
                                        + solution.minDeletionSize(testCase.getStrs()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
