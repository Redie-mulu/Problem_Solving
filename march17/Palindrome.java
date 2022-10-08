package march17;

public class Palindrome {
    ////Definition for singly-linked list.
public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    class SolutionA {
        public boolean isPalindrome(ListNode head) {
            if(head.next == null) {
                return false;
            }
            if(head.next == null || head.next.next == null) {
                if(head.next != head.next.next) return false;
            }
            ListNode temp = head;
            while (temp.next != null && temp.next.next != null) {
                if(temp.next == temp.next.next) {
                    temp = temp.next.next.next;
                }
                else {
                    temp = temp.next;
                }
            }
            if(temp.next != null) return false;
            return true;
        }
    }

}
