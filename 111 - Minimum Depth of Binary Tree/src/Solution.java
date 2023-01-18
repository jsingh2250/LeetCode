import java.util.LinkedList;
import java.util.Queue;

// Given a binary tree, find its minimum depth.

// The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

// Note: A leaf is a node with no children.

// Constraints:
// The number of nodes in the tree is in the range [0, 105].
// -1000 <= Node.val <= 1000

class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> bfsTreeNodeTraversalOrder = new LinkedList<>();
        bfsTreeNodeTraversalOrder.add(root);
        int currentDepth = 1;

        while (!bfsTreeNodeTraversalOrder.isEmpty()) {
            int remainingNumberOfTreeNodesAtCurrentDepth = bfsTreeNodeTraversalOrder.size();

            while (remainingNumberOfTreeNodesAtCurrentDepth-- > 0) {
                TreeNode currentTreeNode = bfsTreeNodeTraversalOrder.remove();

                // Return the depth of the first leaf node encountered during BFS traversal of the BST.
                if (currentTreeNode.left == null && currentTreeNode.right == null) {
                    return currentDepth;
                }

                if (currentTreeNode.left != null) {
                    bfsTreeNodeTraversalOrder.add(currentTreeNode.left);
                }
                if (currentTreeNode.right != null) {
                    bfsTreeNodeTraversalOrder.add(currentTreeNode.right);
                }
            }

            currentDepth++;
        }

        return currentDepth;
    }
}