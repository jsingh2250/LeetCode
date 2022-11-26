public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                int[][][] testCases = {
                                {
                                                { 1, 2, 2, 1 },
                                                { 1 },
                                },
                                {
                                                { 1, 3 },
                                                { 3 },
                                },
                                {
                                                { 3, 2, 1, 5, 4 },
                                                { 2 },
                                },
                                {
                                                { 9, 3, 1, 1, 4, 5, 4, 9, 5, 10 },
                                                { 1 }
                                }
                };

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (int[][] testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + testCase);
                        System.out.println("The output of the solution is: "
                                        + solution.countKDifference(testCase[0], testCase[1][0]));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
