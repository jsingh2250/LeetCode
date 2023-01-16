import java.util.ArrayList;
import java.util.List;

// Given the root of a binary tree, return the inorder traversal of its nodes' values.

// Constraints:
// The number of nodes in the tree is in the range [0, 100].
// -100 <= Node.val <= 100

class Solution {
    ArrayList<Integer> inorderTraversalNodeValues;

    public void inorderTraversalHelper(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        inorderTraversalHelper(treeNode.left);
        inorderTraversalNodeValues.add(treeNode.val);
        inorderTraversalHelper(treeNode.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        inorderTraversalNodeValues = new ArrayList<>(100);

        inorderTraversalHelper(root);

        return inorderTraversalNodeValues;
    }
}