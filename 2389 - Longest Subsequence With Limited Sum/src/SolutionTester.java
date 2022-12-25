import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
        private int[] nums;
        private int[] queries;

        public TestCase(int[] nums, int[] queries) {
                this.nums = nums;
                this.queries = queries;
        }

        public int[] getNums() {
                return nums;
        }

        public int[] getQueries() {
                return queries;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase(new int[] { 4, 5, 2, 1 }, new int[] { 3, 10, 21 }));
                testCases.add(new TestCase(new int[] { 2, 3, 4, 5 }, new int[] { 1 }));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + Arrays.toString(testCase.getNums()));
                        System.out.println("The output of the solution is: " + Arrays
                                        .toString(solution.answerQueries(testCase.getNums(), testCase.getQueries())));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
