import java.util.ArrayList;
import java.util.Arrays;

public class SolutionTester {
        // The main method for testing the solution.
        public static void main(String[] args) throws Exception {
            // Test the old Solution.
            System.out.println();
            System.out.println("Results from the old solution: ");
            Solution_old solution_old = new Solution_old();
    
            ArrayList<String> testCase = new ArrayList<>(Arrays.asList("un", "iq", "ue"));
            int returnedSolution = solution_old.maxLength(testCase);
            System.out.println(returnedSolution);
    
            testCase = new ArrayList<>(Arrays.asList("aa", "bb"));
            returnedSolution = solution_old.maxLength(testCase);
            System.out.println(returnedSolution);
    
            testCase = new ArrayList<>(Arrays.asList("abcdefghijklmnopqrstuvwxyz"));
            returnedSolution = solution_old.maxLength(testCase);
            System.out.println(returnedSolution);
    
            testCase = new ArrayList<>(Arrays.asList("cha", "r", "act", "ers"));
            returnedSolution = solution_old.maxLength(testCase);
            System.out.println(returnedSolution);

            // Test the solution.
            System.out.println();
            System.out.println("Results from the solution: ");
            Solution solution = new Solution();
    
            testCase = new ArrayList<>(Arrays.asList("un", "iq", "ue"));
            returnedSolution = solution.maxLength(testCase);
            System.out.println(returnedSolution);
    
            testCase = new ArrayList<>(Arrays.asList("aa", "bb"));
            returnedSolution = solution.maxLength(testCase);
            System.out.println(returnedSolution);
    
            testCase = new ArrayList<>(Arrays.asList("abcdefghijklmnopqrstuvwxyz"));
            returnedSolution = solution.maxLength(testCase);
            System.out.println(returnedSolution);
    
            testCase = new ArrayList<>(Arrays.asList("cha", "r", "act", "ers"));
            returnedSolution = solution.maxLength(testCase);
            System.out.println(returnedSolution);
        }
}
