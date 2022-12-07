// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

// Constraints:
// 1 <= n <= 45

class Solution {
    public int climbStairs(int n) {
        int[] numberOfWaysToClimbStairsByN = new int[n + 1];
        numberOfWaysToClimbStairsByN[0] = 1; // This element's value is never outputted because n is never zero. This element's value is just used for calculating the values of elements at higher indices.
        numberOfWaysToClimbStairsByN[1] = 1;

        for (int i = 2; i <= n; i++) {
            numberOfWaysToClimbStairsByN[i] = numberOfWaysToClimbStairsByN[i - 2] + numberOfWaysToClimbStairsByN[i - 1];
        }

        return numberOfWaysToClimbStairsByN[n];
    }
}