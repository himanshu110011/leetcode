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
    public ListNode partition(ListNode h, int x) {
          ListNode s = new ListNode(0);
        ListNode l = new ListNode(0); 
        ListNode a = s;
        ListNode b = l;
        while (h != null) {
            if (h.val < x) {
                a.next = h;
                a = a.next;
            } else {
                b.next = h;
                b = b.next;
            }
            h = h.next;
        }
        b.next = null;
        a.next = l.next;
        return s.next;
    }
}