// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.

// Constraints:
// n == height.length
// 2 <= n <= 10^5
// 0 <= height[i] <= 10^4

class Solution1 {
    public int maxArea(int[] height) {
        int leftLineIndex = 0;
        int rightLineIndex = height.length - 1;
        int maxArea = 0;
        while (leftLineIndex < rightLineIndex) {
            int heightOfShorterLine = Math.min(height[leftLineIndex], height[rightLineIndex]);
            maxArea = Math.max(maxArea, (rightLineIndex - leftLineIndex) * heightOfShorterLine);

            if (height[leftLineIndex] < height[rightLineIndex]) {
                while (leftLineIndex < rightLineIndex && height[leftLineIndex] <= heightOfShorterLine) {
                    leftLineIndex++;
                }
            } else {
                while (leftLineIndex < rightLineIndex && height[rightLineIndex] <= heightOfShorterLine) {
                    rightLineIndex--;
                }
            }
        }
        return maxArea;
    }
}