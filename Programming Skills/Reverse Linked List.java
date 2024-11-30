class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode after = null;
        ListNode previous = null;
        ListNode current = head;
        while(current != null){
            after = current.next;
            current.next = previous;
            previous = current;
            current = after;
        }
        return previous;

    }
}
