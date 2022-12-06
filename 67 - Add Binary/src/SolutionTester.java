import java.util.ArrayList;

class TestCase {
        private String a;
        private String b;

        public TestCase(String a, String b) {
                this.a = a;
                this.b = b;
        }

        public String getA() {
                return a;
        }

        public String getB() {
                return b;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase("11", "1"));
                testCases.add(new TestCase("1010", "1011"));
                testCases.add(new TestCase("0", "0"));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + testCase.getA() + ", " + testCase.getB());
                        System.out.println("The output of the solution is: "
                                        + solution.addBinary(testCase.getA(), testCase.getB()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
