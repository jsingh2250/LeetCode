import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TestCase {
        private List<List<Integer>> rooms;

        public TestCase(List<List<Integer>> rooms) {
                this.rooms = rooms;
        }

        public List<List<Integer>> getRooms() {
                return rooms;
        }
}

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
                // Define test cases.
                ArrayList<TestCase> testCases = new ArrayList<>();
                List<List<Integer>> rooms0 = new ArrayList<>();
                rooms0.add(new ArrayList<>());
                rooms0.add(new ArrayList<>());
                rooms0.add(new ArrayList<>());
                rooms0.add(new ArrayList<>());
                rooms0.get(0).add(1);
                rooms0.get(1).add(2);
                rooms0.get(2).add(3);
                testCases.add(new TestCase(rooms0));
                List<List<Integer>> rooms1 = new ArrayList<>();
                rooms1.add(new ArrayList<>());
                rooms1.add(new ArrayList<>());
                rooms1.add(new ArrayList<>());
                rooms1.add(new ArrayList<>());
                rooms1.get(0).add(1);
                rooms1.get(0).add(3);
                rooms1.get(1).add(3);
                rooms1.get(1).add(0);
                rooms1.get(1).add(1);
                rooms1.get(2).add(2);
                rooms1.get(3).add(0);
                testCases.add(new TestCase(rooms1));

                // Test the solution with the test cases. Print the results.
                System.out.println();
                System.out.println("Results from the solution: ");
                Solution solution = new Solution();
                for (TestCase testCase : testCases) {
                        long testCaseStartTimeinNs = System.nanoTime();
                        System.out.println();
                        System.out.println("The testcase is: " + Arrays.deepToString(testCase.getRooms().toArray()));
                        System.out.println("The output of the solution is: "
                                        + solution.canVisitAllRooms(testCase.getRooms()));
                        long testCaseEndTimeInNs = System.nanoTime();
                        long testCaseTotalTimeInNs = testCaseEndTimeInNs - testCaseStartTimeinNs;
                        System.out.println("This test took " + testCaseTotalTimeInNs + " nanoseconds.");
                }
        }
}
