import java.util.ArrayList;

class TestCase {
        private int x;

        public TestCase(int x) {
                this.x = x;
        }

        public int getX() {
                return x;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase(4));
                testCases.add(new TestCase(8));
                testCases.add(new TestCase(1));
                testCases.add(new TestCase(0));
                testCases.add(new TestCase(2147395599));
                testCases.add(new TestCase(Integer.MAX_VALUE));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + testCase.getX());
                        System.out.println("The output of the solution is: " + solution.mySqrt(testCase.getX()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
