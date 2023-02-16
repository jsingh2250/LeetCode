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
    int diameterOfBinaryTree;

    public int lengthOfPath(TreeNode root) {
        if (root == null) {
            return -1;
        }

        int lengthOfLeftPath = lengthOfPath(root.left) + 1;
        int lengthOfRightPath = lengthOfPath(root.right) + 1;
        
        diameterOfBinaryTree = Math.max(diameterOfBinaryTree, lengthOfLeftPath + lengthOfRightPath);

        return Math.max(lengthOfLeftPath, lengthOfRightPath);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        diameterOfBinaryTree = 0;
        lengthOfPath(root);
        return diameterOfBinaryTree;
    }
}