import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution1 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> seenListNodes = new HashSet<>();

        while (head != null) {
            if (!seenListNodes.add(head)) {
                return true;
            }

            head = head.next;
        }

        return false;
    }
}