/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode A, int B) {
        if(A == null){
            return A;
        }
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode tleft = left;
        ListNode tright = right;
        
        while(A != null){
            if(A.val >= B){
                tright.next = A;
                tright = tright.next;
            }else{
                tleft.next = A;
                tleft = tleft.next;
            }
            A = A.next;
        }
        tleft.next = right.next;
        tright.next = null;
        return left.next;
    }
}
