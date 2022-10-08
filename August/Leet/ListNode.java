package August.Leet;


public class ListNode {
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

class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        int middle = 0;
        ListNode temp = new ListNode();
        temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int len = 0;
       if(count%2 != 0) len = count/2 +1;
       if(count%2 == 0) len = count/2;
        while (middle < len) {
            head = head.next;
            middle++;
        }
        return head;
    }

    public static void main(String[] args) {
        System.out.println(6/2);
    }
}