import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
        private String string;
        private int[][] shifts;

        public TestCase(String string, int[][] shifts) {
                this.string = string;
                this.shifts = shifts;
        }

        public String getString() {
                return string;
        }

        public void setString(String string) {
                this.string = string;
        }

        public int[][] getShifts() {
                return shifts;
        }

        public void setShifts(int[][] shifts) {
                this.shifts = shifts;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                String string0 = "abc";
                int[][] shifts0 = { { 0, 1, 0 }, { 1, 2, 1 }, { 0, 2, 1 } };
                testCases.add(new TestCase(string0, shifts0));
                String string1 = "dztz";
                int[][] shifts1 = { { 0, 0, 0 }, { 1, 1, 1 } };
                testCases.add(new TestCase(string1, shifts1));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + testCase.getString() + " " + Arrays.deepToString(testCase.getShifts()));
                        System.out.println("The output of the solution is: "
                                        + solution.shiftingLetters(testCase.getString(), testCase.getShifts()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
