// Given a binary tree, find its minimum depth.

// The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

// Note: A leaf is a node with no children.

// Constraints:
// The number of nodes in the tree is in the range [0, 105].
// -1000 <= Node.val <= 1000

class Solution1 {
    int minimumDepth;

    public void minDepth(TreeNode treeNode, int currentDepth) {
        if (treeNode == null) {
            return;
        }

        currentDepth++;

        if ((treeNode.left == null && treeNode.right == null) || (currentDepth == minimumDepth)) {
            minimumDepth = currentDepth;
            return;
        }

        minDepth(treeNode.left, currentDepth);
        minDepth(treeNode.right, currentDepth);
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        minimumDepth = Integer.MAX_VALUE;
        minDepth(root, 0);

        return minimumDepth;
    }
}