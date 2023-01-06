import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
        private int[] deck;

        public TestCase(int[] deck) {
                this.deck = deck;
        }

        public int[] getDeck() {
                return deck;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase(new int[] { 1, 2, 3, 4, 4, 3, 2, 1 }));
                testCases.add(new TestCase(new int[] { 1, 1, 1, 2, 2, 2, 3, 3 }));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + Arrays.toString(testCase.getDeck()));
                        System.out.println("The output of the solution is: "
                                        + solution.hasGroupsSizeX(testCase.getDeck()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
