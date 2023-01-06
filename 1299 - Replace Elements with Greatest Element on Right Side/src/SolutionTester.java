import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
        private int[] arr;

        public TestCase(int[] arr) {
                this.arr = arr;
        }

        public int[] getArr() {
                return arr;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase(new int[] { 17, 18, 5, 4, 6, 1 }));
                testCases.add(new TestCase(new int[] { 400 }));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + Arrays.toString(testCase.getArr()));
                        System.out.println("The output of the solution is: "
                                        + Arrays.toString(solution.replaceElements(testCase.getArr())));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
