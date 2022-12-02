import java.util.ArrayList;

class TestCase {
        private double x;
        private int n;

        public TestCase(double x, int n) {
                this.x = x;
                this.n = n;
        }

        public double getX() {
                return x;
        }

        public int getN() {
                return n;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase(2.00000, 10));
                testCases.add(new TestCase(2.10000, 3));
                testCases.add(new TestCase(2.00000, -2));
                testCases.add(new TestCase(2.00000, -2147483648));
                testCases.add(new TestCase(1.00000, -2147483648));
                testCases.add(new TestCase(-1.00000, -2147483648));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + testCase.getX() + ", " + testCase.getN());
                        System.out.println(
                                        "The output of the solution is: "
                                                        + solution.myPow(testCase.getX(), testCase.getN()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
