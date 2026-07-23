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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        // step 1 find length and last elem
        int len=1;
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }

        //Step 2 Reduce unnecessary roatations
        k=k%len;
        if(k==0){
            return head;
        }
        
        // step 3 make the list circular
        tail.next=head;

        // step 4 find new tail
        int steps=len-k;
        ListNode newTail=head;
        for(int i=1;i<steps;i++){
            newTail=newTail.next;
        }

        //step 5 Break the circle
        ListNode newHead=newTail.next;
        newTail.next=null;

        return newHead;
    }
}