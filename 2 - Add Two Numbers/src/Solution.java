/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        int carry = sum / 10;
        sum %= 10;
        ListNode result = new ListNode(sum);
        ListNode resultHead = result;
        while ((l1.next != null) && (l2.next != null)) {
            l1 = l1.next;
            l2 = l2.next;
            result.next = new ListNode();
            result = result.next;
            sum = l1.val + l2.val + carry;
            carry = sum / 10;
            sum %= 10;
            result.val = sum;
        }
        while (l1.next != null) {
            l1 = l1.next;
            result.next = new ListNode();
            result = result.next;
            sum = l1.val + carry;
            carry = sum / 10;
            sum %= 10;
            result.val = sum;
        }
        while (l2.next != null) {
            l2 = l2.next;
            result.next = new ListNode();
            result = result.next;
            sum = l2.val + carry;
            carry = sum / 10;
            sum %= 10;
            result.val = sum;
        }
        if (carry != 0) {
            result.next = new ListNode(1);
        }
        return resultHead;
    }
}