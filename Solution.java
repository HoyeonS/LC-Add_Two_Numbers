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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp = new ListNode();
        ListNode result = new ListNode(0, tmp);
        int carryIn = 0;
        
        while(l1 != null || l2 != null || carryIn == 1)
        {
            tmp.val = carryIn;
            if(l1 != null)
                tmp.val += l1.val;
            if(l2 != null)
                tmp.val += l2.val;
            if(tmp.val > 9)
            {
                carryIn = 1;
                tmp.val -= 10;
            }
            else
            {
                carryIn = 0;
            }
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
            if(l1 != null || l2 != null || carryIn == 1)
                tmp.next = new ListNode();
            tmp = tmp.next;
        }
        return result.next;
    }
}