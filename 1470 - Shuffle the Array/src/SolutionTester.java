import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
        private int[] nums;
        private int n;

        public TestCase(int[] nums, int n) {
                this.nums = nums;
                this.n = n;
        }

        public int[] getNums() {
                return nums;
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
                testCases.add(new TestCase(new int[] { 2, 5, 1, 3, 4, 7 }, 3));
                testCases.add(new TestCase(new int[] { 1, 2, 3, 4, 4, 3, 2, 1 }, 4));
                testCases.add(new TestCase(new int[] { 1, 1, 2, 2 }, 2));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + Arrays.toString(testCase.getNums()));
                        System.out.println("The output of the solution is: "
                                        + Arrays.toString(solution.shuffle(testCase.getNums(), testCase.getN())));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
