import java.util.ArrayList;

class TestCase {
        private int dividend;
        private int divisor;

        public TestCase(int dividend, int divisor) {
                this.dividend = dividend;
                this.divisor = divisor;
        }

        public int getDividend() {
                return dividend;
        }

        public int getDivisor() {
                return divisor;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase(10, 3));
                testCases.add(new TestCase(7, -3));
                testCases.add(new TestCase(-2147483648, -1));
                testCases.add(new TestCase(-1010369383, -2147483648));
                testCases.add(new TestCase(1, 1));
                testCases.add(new TestCase(2147483647, -1));
                testCases.add(new TestCase(2147483647, 2));
                testCases.add(new TestCase(0, 2));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + testCase.getDividend() + ", " + testCase.getDivisor());
                        System.out.println("The output of the solution is: "
                                        + solution.divide(testCase.getDividend(), testCase.getDivisor()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
