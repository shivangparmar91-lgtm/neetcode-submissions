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

    public ListNode midList(ListNode head)
    {
        ListNode s = head;
        ListNode f = head;

        while(f != null && f.next != null)
        {
            s = s.next;
            f = f.next.next;
        }

        return s;
    }

    public ListNode reverseList(ListNode head)
    {
        if(head == null)
        {
            return head;
        }

        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;

        while(pres != null)
        {
            pres.next = prev;
            prev = pres;
            pres = next;

            if(next != null)
            {
                next = next.next;
            }
        }
            return prev;
    }
    public void reorderList(ListNode head) {

        if(head == null || head.next == null)
        {
            return;
        }
        
        ListNode mid = midList(head);
        ListNode hf = head;
        ListNode hs = reverseList(mid.next);
        mid.next = null;

        

        while(hf != null && hs != null)
        {
            // Maintain the temp is compalsory if we not maintain the temp here then the hf and hs point the the not correct  next node so here it is need to maintain temp
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }


    }
}
