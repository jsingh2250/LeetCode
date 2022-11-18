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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if ((list1 == null) && (list2 == null)) {return null;}
        if (list1 == null) {return list2;}
        if (list2 == null) {return list1;}
        
        ListNode mergedListHead = new ListNode();
        ListNode mergedList = mergedListHead;
        
        if (list1.val <= list2.val) {
            mergedList.val = list1.val;
            list1 = list1.next;
        }
        else {
            mergedList.val = list2.val;
            list2 = list2.next;
        }
        
        while ((list1 != null) && (list2 != null)) {
            if (list1.val <= list2.val) {
                mergedList.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            else {
                mergedList.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            mergedList = mergedList.next;
        }
                
        while (list1 != null) {
            mergedList.next = new ListNode(list1.val);
            list1 = list1.next;
            mergedList = mergedList.next;
        }
                        
        while (list2 != null) {
            mergedList.next = new ListNode(list2.val);
            list2 = list2.next;
            mergedList = mergedList.next;
        }
        
        return mergedListHead;
    }
}