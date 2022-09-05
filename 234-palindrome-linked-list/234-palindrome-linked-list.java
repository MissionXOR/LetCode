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
    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
    public ListNode findMid(ListNode head){
        ListNode h=head;
        ListNode t=head;
        while(h.next!=null && h.next.next!=null){
            h=h.next.next;
            t=t.next;
        }
        return t;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null && head.next==null){
            return true;
        }
        ListNode mid=findMid(head);
        ListNode sH=reverse(mid.next);
        ListNode fH=head; //first half
        while(sH!=null){
           if(fH.val!=sH.val){
               return false;
           } 
            fH=fH.next;
            sH=sH.next;
        }
        return true;
    }
}