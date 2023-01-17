import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> visitedListNodes = new HashSet<>();

        while (headA != null && headB != null) {
            if (!visitedListNodes.add(headA)) {
                return headA;
            }
            if (!visitedListNodes.add(headB)) {
                return headB;
            }

            headA = headA.next;
            headB = headB.next;
        }

        while (headA != null) {
            if (!visitedListNodes.add(headA)) {
                return headA;
            }

            headA = headA.next;
        }

        while (headB != null) {
            if (!visitedListNodes.add(headB)) {
                return headB;
            }

            headB = headB.next;
        }

        return null;
    }
}