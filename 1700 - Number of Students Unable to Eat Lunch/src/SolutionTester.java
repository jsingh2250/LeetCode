import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
        private int[] students;
        private int[] sandwiches;

        public TestCase(int[] students, int[] sandwiches) {
                this.students = students;
                this.sandwiches = sandwiches;
        }

        public int[] getStudents() {
                return students;
        }

        public int[] getSandwiches() {
                return sandwiches;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase(new int[] { 1, 1, 0, 0 }, new int[] { 0, 1, 0, 1 }));
                testCases.add(new TestCase(new int[] { 1, 1, 1, 0, 0, 1 }, new int[] { 1, 0, 0, 0, 1, 1 }));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println(
                                        "The testcase is: " + Arrays.toString(testCase.getStudents()) + ", " + Arrays.toString(testCase.getSandwiches()));
                        System.out.println(
                                        "The output of the solution is: "
                                                        + solution.countStudents(testCase.getStudents(),
                                                                        testCase.getSandwiches()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
