class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode c = head;
        
        while (c != null && c.next != null) {
            if (c.val == c.next.val) {
                c.next = c.next.next;
            } else {
                c = c.next;
            }
        }
        
        return head;
    }
}