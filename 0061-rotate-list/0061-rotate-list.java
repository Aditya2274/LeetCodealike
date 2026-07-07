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
        if(head==null || head.next==null || k==0) return head;
        ListNode temp=head;int n=1,c=0;
        while(temp.next!=null){
            temp=temp.next;
            n++;
        }
        temp.next=head;
        k=k%n;
        int newtail=n-k;
        ListNode ntail=temp;
        while(newtail>0){
            ntail=ntail.next;
            newtail--;
        }
        ListNode nhead=ntail.next;
        ntail.next=null;
        return nhead;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna