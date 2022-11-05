public class SolutionTester {
    // The main method for testing the solution.
    public static void main(String[] args) throws Exception {
        // Define test cases.
        int[] testCases = { -101, 0, 5, 10, 100, 121, 987656789, 123456789 };

        // Test the solution with the test cases. Print the results.
        System.out.println();
        System.out.println("Results from the solution: ");
        Solution solution = new Solution();
        for (int testCase : testCases) {
            long testCaseStartTimeinNs = System.nanoTime();
            System.out.printf("%d is%s a palindrome.", testCase, (solution.isPalindrome(testCase) ? "" : " not"));
            long testCaseEndTimeInNs = System.nanoTime();
            long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
            System.out.println(" This test took " + testCaseTotalTimeInNs + " nanoseconds.");
        }

        // Test the solution with the test cases. Print the results.
        System.out.println();
        System.out.println("Results from the solution: ");
        Solution1 solution1 = new Solution1();
        for (int testCase : testCases) {
            long testCaseStartTimeinNs = System.nanoTime();
            System.out.printf("%d is%s a palindrome.", testCase, (solution1.isPalindrome(testCase) ? "" : " not"));
            long testCaseEndTimeInNs = System.nanoTime();
            long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
            System.out.println(" This test took " + testCaseTotalTimeInNs + " nanoseconds.");
        }
    }
}
