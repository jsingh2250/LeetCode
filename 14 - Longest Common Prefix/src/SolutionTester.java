import java.util.Arrays;

public class SolutionTester {
    // The main method for testing the solution.
    public static void main(String[] args) throws Exception {
        // Define test cases.
        String[][] testCases = {
                { "flower", "flow", "flight" },
                { "dog", "racecar", "car" },
                { "", "b" },
                { "a" },
                { "a", "ac" },
                { "ab", "a" }
        };

        // Test the solution with the test cases. Print the results.
        System.out.println();
        System.out.println("Results from the solution: ");
        Solution solution = new Solution();
        for (String[] testCase : testCases) {
            long testCaseStartTimeinNs = System.nanoTime();
            System.out.printf("The longest common prefix string amongst the array of strings, %s, is \"%s\".",
                    Arrays.toString(testCase),
                    solution.longestCommonPrefix(testCase));
            long testCaseEndTimeInNs = System.nanoTime();
            long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
            System.out.println(" This test took " + testCaseTotalTimeInNs + " nanoseconds.");
        }

        // Test the solution with the test cases. Print the results.
        System.out.println();
        System.out.println("Results from the solution: ");
        Solution1 solution1 = new Solution1();
        for (String[] testCase : testCases) {
            long testCaseStartTimeinNs = System.nanoTime();
            System.out.printf("The longest common prefix string amongst the array of strings, %s, is \"%s\".",
                    Arrays.toString(testCase),
                    solution1.longestCommonPrefix(testCase));
            long testCaseEndTimeInNs = System.nanoTime();
            long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
            System.out.println(" This test took " + testCaseTotalTimeInNs + " nanoseconds.");
        }
    }
}
