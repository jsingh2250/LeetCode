import java.util.ArrayList;

class TestCase {
        private String haystack;
        private String needle;

        public TestCase(String haystack, String needle) {
                this.haystack = haystack;
                this.needle = needle;
        }

        public String getHaystack() {
                return haystack;
        }

        public String getNeedle() {
                return needle;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase("sadbutsad", "sad"));
                testCases.add(new TestCase("leetcode", "leeto"));
                testCases.add(new TestCase("mississippi", "issip"));
                testCases.add(new TestCase("abc", "c"));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + testCase.getHaystack() + ", " + testCase.getNeedle());
                        System.out.println("The output of the solution is: "
                                        + solution.strStr(testCase.getHaystack(), testCase.getNeedle()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
