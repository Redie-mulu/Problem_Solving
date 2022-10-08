package August;



public class LinkedListCycle {
    public boolean hasCycle2(ListNode head) {
        if(head == null) return true;
        ListNode node = head.next;
        // this loop will iterate through the linked list until the list run out of element
        // and if ths list is circular
        while (node != null && node != head) {
            node = node.next;
        }
        return (node == head);
    }
    public boolean hasCycle(ListNode head) {
        if(head == null ) return false;
        ListNode tortoise = head;
        ListNode hare = head.next;

        while (tortoise != hare) {
            if(hare == null || hare.next == null) return false;

            tortoise = tortoise.next;
            hare = hare.next;
        }
        return true;

    }
}
