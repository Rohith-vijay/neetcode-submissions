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
        // 1. Create a dummy node to hold the start of the list
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
        // 2. Loop while both lists have elements remaining
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;  // Link to list1 node
                list1 = list1.next; // Move list1 pointer
            } else {
                tail.next = list2;  // Link to list2 node
                list2 = list2.next; // Move list2 pointer
            }
            tail = tail.next;       // Move tail pointer forward
        }
        
        // 3. Append the remaining elements of whichever list isn't empty
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }
        
        // 4. Return the actual head of the merged list
        return dummy.next;
    }

}