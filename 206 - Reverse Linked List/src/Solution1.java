// Given the head of a singly linked list, reverse the list, and return the reversed list.

// Constraints:
// The number of nodes in the list is the range [0, 5000].
// -5000 <= Node.val <= 5000

import java.util.Stack;

class Solution1 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode node = head;
        Stack<ListNode> nodeOrder = new Stack<>();

        while (node.next != null) {
            nodeOrder.push(node);
            node = node.next;
        }

        head = node;

        while (!nodeOrder.empty()) {
            node.next = nodeOrder.pop();
            node = node.next;
        }
        node.next = null;

        return head;
    }
}