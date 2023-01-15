import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
        private int[] numbers;
        private int target;

        public TestCase(int[] numbers, int target) {
                this.numbers = numbers;
                this.target = target;
        }

        public int[] getNumbers() {
                return numbers;
        }

        public int getTarget() {
                return target;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase(new int[] { 2, 7, 11, 15 }, 9));
                testCases.add(new TestCase(new int[] { 2, 3, 4 }, 6));
                testCases.add(new TestCase(new int[] { -1, 0 }, -1));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + Arrays.toString(testCase.getNumbers()) + ", "
                                        + testCase.getTarget());
                        System.out.println("The output of the solution is: "
                                        + Arrays.toString(
                                                        solution.twoSum(testCase.getNumbers(), testCase.getTarget())));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
