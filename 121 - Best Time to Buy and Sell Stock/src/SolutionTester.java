import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
        private int[] prices;

        public TestCase(int[] prices) {
                this.prices = prices;
        }

        public int[] getPrices() {
                return prices;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase(new int[] {7,1,5,3,6,4}));
                testCases.add(new TestCase(new int[] {7,6,4,3,1}));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + Arrays.toString(testCase.getPrices()));
                        System.out.println("The output of the solution is: " + solution.maxProfit(testCase.getPrices()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
