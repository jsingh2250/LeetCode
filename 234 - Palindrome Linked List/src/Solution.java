import java.util.Stack;

// Given the head of a singly linked list, return true if it is a 
// palindrome or false otherwise.

// Constraints:
// The number of nodes in the list is in the range [1, 10^5].
// 0 <= Node.val <= 9

class Solution {
    public boolean isPalindrome(ListNode head) {
        int lengthOfList = 0;

        ListNode node = head;
        while (node != null) {
            lengthOfList++;
            node = node.next;
        }

        node = head;
        Stack<Integer> seenNodeValues = new Stack<>();
        for (int i = 0; i < (lengthOfList / 2); i++) {
            seenNodeValues.add(node.val);
            node = node.next;
        }

        if (lengthOfList % 2 == 1) {
            node = node.next;
        }

        while (node != null) {
            if (node.val != seenNodeValues.pop()) {
                return false;
            }
            node = node.next;
        }

        return true;
    }
}