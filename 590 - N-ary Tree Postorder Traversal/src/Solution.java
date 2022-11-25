import java.util.LinkedList;
import java.util.List;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    // Declare a list to store the node values encountered, in order, during a postorder traversal of the specified n-ary tree.
    private List<Integer> postorderTraversalOfNodeValues = new LinkedList<>();

    public List<Integer> postorder(Node root) {
        // If the specified n-ary tree is empty, return an empty list.
        if (root == null) {
            return postorderTraversalOfNodeValues;
        }

        depthFirstSearch(root);

        return postorderTraversalOfNodeValues;
    }

    public void depthFirstSearch(Node node) {
        for (Node childNode : node.children) {
            depthFirstSearch(childNode);
        }

        postorderTraversalOfNodeValues.add(node.val);
    }
}