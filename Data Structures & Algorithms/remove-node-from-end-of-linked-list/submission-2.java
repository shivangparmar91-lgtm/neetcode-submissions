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

        ListNode temp1 = head;
        int len = 0;

        while(temp1 != null)
        {
            len++;
            temp1 = temp1.next;
        }

        if(len == 1)
        {
            return null;
        }

        if(n == len)
        {
            return head.next;
        }

        ListNode temp2 = head;

        for(int i = 1;i< len - n;i++)
        {
            temp2 = temp2.next;
        }

        temp2.next = temp2.next.next;

        return head;


    }
}
