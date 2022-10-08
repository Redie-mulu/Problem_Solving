package march17;

import java.util.Arrays;

public class DeleteNode {
//Definition for singly-linked list.
    public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
    class Solution {
        public void deleteNode(ListNode node) {

            node.val = node.next.val;
            node.next = node.next.next;

        }
    }
}
