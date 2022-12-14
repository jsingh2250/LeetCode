// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.

// Constraints:
// n == height.length
// 2 <= n <= 10^5
// 0 <= height[i] <= 10^4

class Solution {
    public int maxArea(int[] height) {
        int leftLineIndex = 0;
        int rightLineIndex = height.length - 1;
        int heightOfLeftLine = height[leftLineIndex];
        int heightOfRightLine = height[rightLineIndex];
        int maxArea = 0;

        while (leftLineIndex < rightLineIndex) {
            if (heightOfLeftLine < heightOfRightLine) {
                maxArea = Math.max(maxArea, (rightLineIndex - leftLineIndex) * heightOfLeftLine);
                while (leftLineIndex < rightLineIndex && height[leftLineIndex] <= heightOfLeftLine) {
                    leftLineIndex++;
                }
                heightOfLeftLine = height[leftLineIndex];
            } else {
                maxArea = Math.max(maxArea, (rightLineIndex - leftLineIndex) * heightOfRightLine);
                while (leftLineIndex < rightLineIndex && height[rightLineIndex] <= heightOfRightLine) {
                    rightLineIndex--;
                }
                heightOfRightLine = height[rightLineIndex];
            }
        }

        return maxArea;
    }
}