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

        // STart a Slow and fast pointer
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(slowPtr != null
            && fastPtr != null
            && fastPtr.next != null)
            {
                // Advance both the pointers
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next.next;


                // If they meet , means we found a loop
                if(slowPtr == fastPtr)
                {
                    return true;
                }
            }
        return false;
    }
}