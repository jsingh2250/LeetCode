import java.util.ArrayList;

// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

// Constraints:
// 1 <= n <= 45

class Solution2 {
    // Store the number of ways to climb n stairs to make recursion faster.
    ArrayList<Integer> numberOfWaysToClimbStairsByN = new ArrayList<>();
    final int SMALLEST_STORED_N = 3;

    public int climbStairs(int n) {
        if (n <= 1) {
            return n;
        } else if (n == 2) {
            return 2;
        }

        if (numberOfWaysToClimbStairsByN.size() <= (n - SMALLEST_STORED_N)) {
            numberOfWaysToClimbStairsByN.add(climbStairs(n - 2) + climbStairs(n - 1));
        }

        return numberOfWaysToClimbStairsByN.get(n - SMALLEST_STORED_N);
    }
}