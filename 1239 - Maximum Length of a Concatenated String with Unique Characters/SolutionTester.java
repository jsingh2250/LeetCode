import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTester {
    // The main method for testing the solution.
    public static void main(String[] args) throws Exception {
        // Define test cases.
        List<List<String>> testCases = new ArrayList<>();
        testCases.add(Arrays.asList("un", "iq", "ue"));
        testCases.add(Arrays.asList("aa", "bb"));
        testCases.add(Arrays.asList("abcdefghijklmnopqrstuvwxyz"));
        testCases.add(Arrays.asList("cha", "r", "act", "ers"));

        // Test the solution with the test cases. Print the results.
        System.out.println();
        System.out.println("Results from the solution: ");
        Solution solution = new Solution();
        for (List<String> testCase : testCases) {
            long testCaseStartTimeinNs = System.nanoTime();
            System.out.print(solution.maxLength(testCase));
            long testCaseEndTimeInNs = System.nanoTime();
            long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
            System.out.println(" This test took " + testCaseTotalTimeInNs + " nanoseconds.");
        }

        // Test the solution with the test cases. Print the results.
        System.out.println();
        System.out.println("Results from the solution: ");
        Solution1 solution1 = new Solution1();
        for (List<String> testCase : testCases) {
            long testCaseStartTimeinNs = System.nanoTime();
            System.out.print(solution1.maxLength(testCase));
            long testCaseEndTimeInNs = System.nanoTime();
            long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
            System.out.println(" This test took " + testCaseTotalTimeInNs + " nanoseconds.");
        }

        // Test the solution with the test cases. Print the results.
        System.out.println();
        System.out.println("Results from the solution: ");
        Solution2 solution2 = new Solution2();
        for (List<String> testCase : testCases) {
            long testCaseStartTimeinNs = System.nanoTime();
            System.out.print(solution2.maxLength(testCase));
            long testCaseEndTimeInNs = System.nanoTime();
            long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
            System.out.println(" This test took " + testCaseTotalTimeInNs + " nanoseconds.");
        }
    }
}
