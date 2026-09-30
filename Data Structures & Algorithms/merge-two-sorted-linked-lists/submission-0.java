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

        ListNode newList = new ListNode(0);
        ListNode temp = newList;

        ListNode f = list1;
        ListNode s = list2;

        while(f!= null && s != null)
        {
            if(f.val < s.val)
            {
                temp.next = f;
                f = f.next;
                
            }
            else 
            {
                temp.next = s;
                s = s.next;
                
            }
        
            temp = temp.next;
        }

        while(f!= null)
        {
            temp.next = f;
            f = f.next;
            temp = temp.next;
        }

        while(s != null)
        {
            temp.next = s;
            s = s.next;
            temp = temp.next;
        }

        return newList.next;
    }
}