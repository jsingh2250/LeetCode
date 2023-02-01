// Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

// Constraints:
// The number of nodes in the list is in the range [0, 10^4].
// 1 <= Node.val <= 50
// 0 <= val <= 50

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode nodeBeforeHead = new ListNode();
        nodeBeforeHead.next = head;
        ListNode previousNode = new ListNode();
        previousNode = nodeBeforeHead;

        while (previousNode.next != null) {
            if (previousNode.next.val == val) {
                previousNode.next = previousNode.next.next;
            }
            else {
                previousNode = previousNode.next;
            }
        }

        return nodeBeforeHead.next;
    }
}