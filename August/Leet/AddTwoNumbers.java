package August.Leet;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode sum = temp;

        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1Val = (l1 != null) ? l1.val:0;
            int l2Val = (l2 != null) ? l2.val:0;

            int currentSum = l1Val + l2Val + carry;
            carry = currentSum/10;
            int lastDigit = currentSum %10;

            ListNode  newNode = new ListNode(lastDigit);
            sum.next = newNode;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            sum = sum.next;
        }
        if(carry > 0) {
            ListNode newNode = new ListNode(carry);
            sum.next = newNode;
            sum = sum.next;
        }
        return temp.next;
    }
   /* public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode(0);
        int dig = 0;
        while (l1 == null && l2.next == null) {
            int n = 0;
            if(l1 == null) n = l2.val;
            if(l2 == null) n = l1.val;
            else n = l1.val + l2.val;

            int remainder = 0;
            if (sum.next != null) {
                if (n > 9) {
                    remainder = n % 10;
                    dig = n / 10;
                    sum = new ListNode(remainder);
                    sum.next = new ListNode(dig);
                } else sum = new ListNode(n);
            }
            else {
                if (n > 9) {
                    remainder = n % 10;
                    dig = n / 10;
                    sum.val += remainder;
                    sum.next = new ListNode(dig);
                } else sum.val += n;
            }
            l1 = l1.next;
            l2 = l2.next;
            sum = sum.next;

        }
        return sum;
    }*/
}
