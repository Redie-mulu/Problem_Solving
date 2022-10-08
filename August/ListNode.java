package August;

//import geeksforgeeks.LinkedList.LinkedList;

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

class MergeTwoSortedLists {


    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 != null || list2 == null) return list1;
        if (list1 == null || list2 != null) return list2;

        ListNode temp = new ListNode();
        while (list1 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;

            }
            if (list1.val > list2.val) {
                temp.next = list2;
                list2 = list2.next;

            }
            temp = temp.next;
        }
        while (list2 != null) {
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }

        return temp;
    }

    public static int getCountRec(ListNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + getCountRec(node.next);
    }
    // past solution
    /*
    * public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if(list1 == null && list2 == null) return null;
            ListNode current_node = new ListNode();
            ListNode temp = current_node;

           while (list1 != null && list2 != null) {
               if(list1.val < list2.val) {
                   temp.next = list1;
                   list1 = list1.next;
               }
               else {
                   temp.next = list2;
                    list2 = list2.next;
               }
               temp = temp.next;
           }
           if(list2 !=  null) {
               temp.next = list2;
                list2 = list2.next;
           }
           if(list1 != null) {
               temp.next = list1;
               list1 = list1.next;
           }
           return current_node.next;
        }*/
}
