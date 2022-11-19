import java.util.Arrays;

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                int[][][] testCases = {
                                {
                                                { 1, 2, 3 },
                                                { 3, 1, 2 },
                                                { 2, 3, 1 }
                                },
                                {
                                                { 1, 1, 1 },
                                                { 1, 2, 3 },
                                                { 1, 2, 3 }
                                }
                };

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (int testCase[][] : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.printf("The matrix below is valid: %b. %n%s%n", solution.checkValid(testCase),
                                        Arrays.deepToString(testCase));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
