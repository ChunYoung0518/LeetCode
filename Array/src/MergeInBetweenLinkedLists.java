public class MergeInBetweenLinkedLists {
    
    public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode list2Tail = list2;
        while (list2Tail.next != null) {
            list2Tail = list2Tail.next;
        }

        ListNode index1 = list1;
        b = b- a +2;
        while (a != 1) {
            index1 = index1.next;
            a--;
        }

        ListNode index2 = index1;
        while(b != 0) {
            index2 = index2.next;
            b--;
        }

        index1.next = list2;
        list2Tail.next = index2;

        return list1;
    }
    
}
