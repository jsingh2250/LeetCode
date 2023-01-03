import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
        private int[] nums1;
        private int m;
        private int[] nums2;
        private int n;

        public TestCase(int[] nums1, int m, int[] nums2, int n) {
                this.nums1 = nums1;
                this.m = m;
                this.nums2 = nums2;
                this.n = n;
        }

        public int[] getNums1() {
                return nums1;
        }

        public int getM() {
                return m;
        }

        public int[] getNums2() {
                return nums2;
        }

        public int getN() {
                return n;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                testCases.add(new TestCase(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3));
                testCases.add(new TestCase(new int[] { 1 }, 1, new int[] {}, 0));
                testCases.add(new TestCase(new int[] { 0 }, 0, new int[] { 1 }, 1));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + Arrays.toString(testCase.getNums1()) + ", "
                                        + testCase.getM() + ", " + Arrays.toString(testCase.getNums2()) + ", "
                                        + testCase.getN());
                        solution.merge(testCase.getNums1(), testCase.getM(), testCase.getNums2(), testCase.getN());
                        System.out.println("The output of the solution is: "
                                        + Arrays.toString(testCase.getNums1()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
