import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
        private int[] arr;

        public TestCase(int[] arr) {
                this.arr = arr;
        }

        public int[] getArr() {
                return this.arr;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase(new int[] { 1, 2, 2, 1, 1, 3 }));
                testCases.add(new TestCase(new int[] { 1, 2 }));
                testCases.add(new TestCase(new int[] { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 }));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + Arrays.toString(testCase.getArr()));
                        System.out.println("The output of the solution is: "
                                        + solution.uniqueOccurrences(testCase.getArr()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
