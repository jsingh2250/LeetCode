/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBST(int[] nums, int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) {
            return null;
        }

        int middleIndex = (rightIndex - leftIndex) / 2 + leftIndex;
        TreeNode treeNode = new TreeNode(nums[middleIndex]);

        treeNode.left = createBST(nums, leftIndex, middleIndex - 1);
        treeNode.right = createBST(nums, middleIndex + 1, rightIndex);

        return treeNode;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length - 1);
    }
}