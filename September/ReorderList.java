package September;

public class ReorderList {

}

// * Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution3 {
    public void reorderList(ListNode head) {
        ListNode temp = head;
        ListNode reverse = reverseList(temp);
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int i = 0;

        while (i < count/2) {
            ListNode tempNext = head.next;
           head.next = reverse;
           head.next.next = tempNext;
           reverse = reverse.next;
            i += 2;
        }
        if(count % 2 == 0) head.next = null;
        else head.next.next = null;

    }
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
