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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode RevHead = reverseList(head);
        if (n == 1) {
            RevHead = RevHead.next;
        } else {
            ListNode dum = RevHead;
            for (int i = n - 1; i > 1; i--) {
                dum = dum.next;
            }
            dum.next = dum.next.next;
        }
        RevHead = reverseList(RevHead);
        return RevHead;
    }
    public static ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode newHead = head;
        if(head.next!=null){
            newHead = reverseList(head.next);
            head.next.next = head;
        }
        head.next = null;
        return newHead;
    }

}
