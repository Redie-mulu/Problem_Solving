package August.Leet;

public class RemoveNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode left = dummy;
        ListNode right = head;

        while (n > 0 && right != null) {
            right = right.next;
            n -= 1;
        }
        while (right != null) {
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return dummy.next;
    }
    /*public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode();
        temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if(length == 1) return null;
        int frontIndex = length - n-1;


        int i = 0;
        temp = head;
        while (i < frontIndex && temp.next != null) {
            temp = temp.next;
            i++;
        }

        if(temp.next != null && temp.next.next != null) {
            temp.next = temp.next.next;
        }
        else temp.next = null;
        return head;
    }*/
}
