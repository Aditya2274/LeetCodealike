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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode a=list1;
        ListNode b=list2;
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        while(a!=null && b!=null){
            if(a.val<=b.val){
                curr.next=a;
                a=a.next;
            }
            else{
                curr.next=b;
                b=b.next;
            }
            curr=curr.next;
        }
        if(a==null) curr.next=b;
        if(b==null) curr.next=a;
        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna