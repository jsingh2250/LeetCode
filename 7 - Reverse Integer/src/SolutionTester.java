public class SolutionTester {
    // The main method for testing the solution.
    public static void main(String[] args) throws Exception {
        // Define test cases.
        Integer[] testCases = { 0, 5, -5, 10, 100, 123, -123, 1111111111, 1234567899 };

        // Test the solution with the test cases. Print the results.
        System.out.println();
        System.out.println("Results from the solution: ");
        Solution solution = new Solution();
        for (Integer testCase : testCases) {
            long testCaseStartTimeinNs = System.nanoTime();
            System.out.printf("%d reversed is %d.", testCase,
                    solution.reverse(testCase));
            long testCaseEndTimeInNs = System.nanoTime();
            long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
            System.out.println(" This test took " + testCaseTotalTimeInNs + " nanoseconds.");
        }
    }
}
