// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

// Constraints:
// 1 <= n <= 45

class Solution1 {
    public int climbStairs(int n, int numberOfWaysToClimbStairs) {
        if (n == 0) {
            return ++numberOfWaysToClimbStairs;
        } else if (n < 0) {
            return numberOfWaysToClimbStairs;
        }

        return climbStairs(n - 1, climbStairs(n - 2, numberOfWaysToClimbStairs));
    }

    public int climbStairs(int n) {
        return climbStairs(n, 0);
    }
}