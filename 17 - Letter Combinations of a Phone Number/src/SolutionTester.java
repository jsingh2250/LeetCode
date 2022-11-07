public class SolutionTester {
    // The main method for testing the solution.
    public static void main(String[] args) throws Exception {
        // Define test cases.
        String[] testCases = { "2", "34", "567", "8998"};

        // Test the solution with the test cases. Print the results.
        System.out.println();
        System.out.println("Results from the solution: ");
        Solution solution = new Solution();
        for (String testCase : testCases) {
            long testCaseStartTimeinNs = System.nanoTime();
            System.out.printf("The letter combinations for the phone number %s are %s.", testCase,
                    solution.letterCombinations(testCase));
            long testCaseEndTimeInNs = System.nanoTime();
            long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
            System.out.println(" This test took " + testCaseTotalTimeInNs + " nanoseconds.");
        }
    }
}
