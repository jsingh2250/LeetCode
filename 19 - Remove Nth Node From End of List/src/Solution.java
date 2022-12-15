// Given the head of a linked list, remove the nth node from the end of the list and return its head.

// Constraints:
// The number of nodes in the list is sz.
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tailFinder = head;
        int nodeNumberOfTailFindersCurrentNode = 1;

        while (nodeNumberOfTailFindersCurrentNode != n) {
            tailFinder = tailFinder.next;
            nodeNumberOfTailFindersCurrentNode++;
        }

        ListNode nodeBeforeNodeToRemove = new ListNode(0, head);

        while (tailFinder.next != null) {
            tailFinder = tailFinder.next;
            nodeBeforeNodeToRemove = nodeBeforeNodeToRemove.next;
        }

        // If the node that needs to be removed is the head, return the node after the head.
        if (nodeBeforeNodeToRemove.next == head) {
            return head.next;
        }

        nodeBeforeNodeToRemove.next = nodeBeforeNodeToRemove.next.next;

        return head;
    }
}