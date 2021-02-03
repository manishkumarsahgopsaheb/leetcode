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
    // Solution 1
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
            return false;
        Set<ListNode> set = new HashSet<>();
        set.add(head);
        while(head.next!=null)
        {
            if(set.contains(head.next))
                return true;
            set.add(head.next);
            head = head.next;
        }
        return false;
    }
    
    // solution 2
    public boolean hasCycle(ListNode head)
    {
         final int dummyvalue = -10001;
        
        while(head!=null)
        {
            if(head.val==dummyvalue)
                return true;
            head.val = dummyvalue;
            head = head.next;
        }
        return false;
    }
}
