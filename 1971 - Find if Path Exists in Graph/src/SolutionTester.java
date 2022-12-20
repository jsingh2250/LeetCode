import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
        private int n;
        private int[][] edges;
        private int source;
        private int destination;

        public TestCase(int n, int[][] edges, int source, int destination) {
                this.n = n;
                this.edges = edges;
                this.source = source;
                this.destination = destination;
        }

        public int getN() {
                return n;
        }

        public int[][] getEdges() {
                return edges;
        }

        public int getSource() {
                return source;
        }

        public int getDestination() {
                return destination;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase(3, new int[][] { { 0, 1 }, { 1, 2 }, { 2, 0 } }, 0, 2));
                testCases.add(new TestCase(6, new int[][] { { 0, 1 }, { 0, 2 }, { 3, 5 }, { 5, 4 }, { 4, 3 } }, 0, 5));
                testCases.add(new TestCase(1, new int[][] { {} }, 0, 0));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + testCase.getN() + ", "
                                        + Arrays.deepToString(testCase.getEdges()) + ", " + testCase.getSource() + ", "
                                        + testCase.getDestination());
                        System.out.println("The output of the solution is: "
                                        + solution.validPath(testCase.getN(), testCase.getEdges(), testCase.getSource(),
                                                        testCase.getDestination()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
