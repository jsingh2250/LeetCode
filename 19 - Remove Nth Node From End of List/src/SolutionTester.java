import java.util.ArrayList;

class TestCase {
        private ListNode head;
        private int n;

        public TestCase(ListNode head, int n) {
                this.head = head;
                this.n = n;
        }

        public ListNode getHead() {
                return head;
        }

        public int getN() {
                return n;
        }
}

public class SolutionTester {
        public static void printListNodeVals(ListNode node) {
                while (node != null) {
                        System.out.print(node.val + " ");
                        node = node.next;
                }
                System.out.println();
        }

        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                ListNode head0 = new ListNode(1,
                                new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
                testCases.add(new TestCase(head0, 2));
                ListNode head1 = new ListNode(1, null);
                testCases.add(new TestCase(head1, 1));
                ListNode head2 = new ListNode(1, new ListNode(2, null));
                testCases.add(new TestCase(head2, 1));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: ");
                        printListNodeVals(testCase.getHead());
                        System.out.println("The output of the solution is: ");
                        printListNodeVals(solution.removeNthFromEnd(testCase.getHead(), testCase.getN()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
