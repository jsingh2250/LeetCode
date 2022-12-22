import java.util.ArrayList;

class TestCase {
        private String s;
        private String p;

        public TestCase(String s, String p) {
                this.s = s;
                this.p = p;
        }

        public String getS() {
                return s;
        }

        public String getP() {
                return p;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase("aa", "a"));
                testCases.add(new TestCase("aa", "a*"));
                testCases.add(new TestCase("ab", ".*"));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + testCase.getS() + ", " + testCase.getP());
                        System.out.println("The output of the solution is: "
                                        + solution.isMatch(testCase.getS(), testCase.getP()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
