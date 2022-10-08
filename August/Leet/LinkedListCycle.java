package August.Leet;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {
        if(!containCycle(head)) return null;
        if(containCycle(head)) {
            Map<ListNode, Integer> listVal = new HashMap<>();
            while (head != null) {
                if(listVal.containsKey(head)) return head;
                listVal.put(head, 1);
                head = head.next;
            }
        }
        return null;

    }
    public boolean containCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }
        ListNode fast = new ListNode();
        ListNode slow = new ListNode();
        slow = head;
        fast = head.next;
        while (slow != fast){
            if(fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
