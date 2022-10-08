package march17;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }


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
/*class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) {
            return true;
        }
        if(head.next.next == null) {
            if(head.val == head.next.val) return true;
            if(head.val != head.next.val) return false;
        }

        ListNode temp = head;
        int count = 0;

        while (temp.next != null && temp.next.next != null) {
            if(temp.next == temp.next.next) {
                temp = temp.next.next.next;
            }
            else {
                temp = temp.next;
            }
            count++;
        }

        if(temp.next.next != null) return false;
        if(count %2 != 0) return false;
        return true;
    }
}*/
    public boolean removeElements(ListNode head, int val) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reversed(slow);
        fast = head;
        while (slow != null) {
            if(slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    public ListNode reversed(ListNode head) {
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