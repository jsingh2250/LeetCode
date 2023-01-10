import java.util.ArrayList;

class TestCase {
        private TreeNode root;
        private int targetSum;

        public TestCase(TreeNode root, int targetSum) {
                this.root = root;
                this.targetSum = targetSum;
        }

        public TreeNode getRoot() {
                return root;
        }

        public int getTargetSum() {
                return targetSum;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase());

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + testCase.getRoot());
                        System.out.println("The output of the solution is: "
                                        + solution.hasPathSum(testCase.getRoot(), testCase.getTargetSum()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
