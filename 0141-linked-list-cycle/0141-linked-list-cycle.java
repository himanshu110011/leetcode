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
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode temp=head;
        ListNode prev=head;
        while(temp!=null && temp.next!=null){
            prev=prev.next;
            temp=temp.next.next;
        
        if(temp==prev){
            return true;
        }
        }
        return false;
    }
}