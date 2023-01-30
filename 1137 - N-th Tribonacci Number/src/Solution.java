class Solution {
    private int[] tribonacciNumberByIndex;

    public int tribonacci(int n) {
        tribonacciNumberByIndex = new int[Math.max(3, n + 1)];
        tribonacciNumberByIndex[1] = 1;
        tribonacciNumberByIndex[2] = 1;

        for (int i = 3; i <= n; i++) {
            tribonacciNumberByIndex[i] = tribonacciNumberByIndex[i - 1] + tribonacciNumberByIndex[i - 2] + tribonacciNumberByIndex[i - 3];
        }

        return tribonacciNumberByIndex[n];
    }
}