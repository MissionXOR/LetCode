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
        if(head==null){
            return false;
        }
        ListNode hear=head;
        ListNode tot=head;
        
        while(hear!=null && hear.next!=null){
            hear=hear.next.next;
            tot=tot.next;
            if(hear==tot){
                return true;
            }
        }
        return false;
        
    }
}