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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // If the first list is empty, return the second list directly.
        if (l1 == null) return l2;
        // If the second list is empty, return the first list directly.
        if (l2 == null) return l1;

        // Ensure that l1 always points to the list with the smaller initial element.
        // This helps in maintaining the order without additional conditions.
        if (l1.val > l2.val) {
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }

        // Set 'res' to point to the start of the merged list, which is the smaller element.
        ListNode res = l1;

        // Iterate as long as both lists have elements.
        while (l1 != null && l2 != null) {
            ListNode tmp = null;
            // Traverse through l1 as long as its elements are less than or equal to l2's current element.
            // This loop identifies the point where the elements of l2 should be merged into l1.
            while (l1 != null && l1.val <= l2.val) {
                tmp = l1; // Keep track of the last node considered in l1.
                l1 = l1.next; // Move to the next element in l1.
            }
            // Link the last node of l1 to the current node of l2, making a connection.
            tmp.next = l2;

            // Swap l1 and l2 to continue the merge operation with the remaining parts of both lists.
            // This effectively inserts the node from l2 into the right place in the merged list and continues sorting.
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }

        // Return the head of the newly merged list.
        return res;
    }
}

