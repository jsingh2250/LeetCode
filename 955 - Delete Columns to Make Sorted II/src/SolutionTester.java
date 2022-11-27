public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                String[][] testCases = {
                                { "ca", "bb", "ac" },

                                { "xc", "yb", "za" },

                                { "zyx", "wvu", "tsr" }
                };

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (String[] testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + testCase);
                        System.out.println("The output of the solution is: "
                                        + solution.minDeletionSize(testCase));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
