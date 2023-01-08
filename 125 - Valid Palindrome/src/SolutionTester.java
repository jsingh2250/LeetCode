import java.util.ArrayList;

class TestCase {
        private String s;

        public TestCase(String s) {
                this.s = s;
        }

        public String getS() {
                return s;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase("A man, a plan, a canal: Panama"));
                testCases.add(new TestCase("race a car"));
                testCases.add(new TestCase(" "));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + testCase.getS());
                        System.out.println("The output of the solution is: "
                                        + solution.isPalindrome(testCase.getS()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
