// Given the root of a binary tree, return the sum of all left leaves.

// A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.

// Constraints:
// The number of nodes in the tree is in the range [1, 1000].
// -1000 <= Node.val <= 1000

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sumOfLeftLeaves = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sumOfLeftLeaves = root.left.val;
        }

        return sumOfLeftLeaves + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}