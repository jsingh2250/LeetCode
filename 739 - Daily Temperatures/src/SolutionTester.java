import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
        private int[] temperatures;

        public TestCase(int[] temperatures) {
                this.temperatures = temperatures;
        }

        public int[] getTemperatures() {
                return temperatures;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase(new int[] { 73, 74, 75, 71, 69, 72, 76, 73 }));
                testCases.add(new TestCase(new int[] { 30, 40, 50, 60 }));
                testCases.add(new TestCase(new int[] { 30, 60, 90 }));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + Arrays.toString(testCase.getTemperatures()));
                        System.out.println("The output of the solution is: "
                                        + Arrays.toString(solution.dailyTemperatures(testCase.getTemperatures())));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
