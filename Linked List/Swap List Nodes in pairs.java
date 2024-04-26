/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode A) {

        if(A == null || A.next == null){
            return A;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = A;
        ListNode point = dummy;

        while(point.next != null && point.next.next != null){
        ListNode swap1 = point.next;
        ListNode swap2 = point.next.next;
        
        swap1.next = swap2.next;
        swap2.next = swap1;
        
        point.next = swap2;
        point = swap1;
        
        }
        return dummy.next;
        
        }
        
    }

