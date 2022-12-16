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
    public ListNode swapPairs(ListNode head) {
        ListNode nodeBeforeHeadNode = new ListNode(0, head);
        ListNode nodeBeforeLeftNode = nodeBeforeHeadNode;

        while (nodeBeforeLeftNode.next != null && nodeBeforeLeftNode.next.next != null) {
            ListNode leftNode = nodeBeforeLeftNode.next;
            nodeBeforeLeftNode.next = leftNode.next;
            leftNode.next = nodeBeforeLeftNode.next.next;
            nodeBeforeLeftNode.next.next = leftNode;

            nodeBeforeLeftNode = leftNode;
        }

        head = nodeBeforeHeadNode.next;

        return head;
    }
}