public class AddTwoNumbers {

    public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = null;
        ListNode res = pre;
        int carry = 0;
        while( null!=l1 || null!=l2 || carry==1){
            int n1 = null != l1 ? l1.val : 0;
            int n2 = null != l2 ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if( sum >= 10){
                sum-=10;
                carry = 1;
            } else {
                carry = 0;
            }

            ListNode newNode = new ListNode(sum, null);
            if(null == pre){
                pre = newNode;
                res = newNode;
            } else {
                pre.next = newNode;
                pre = newNode;
            }

            l1 = null != l1 ? l1.next : null;
            l2 = null != l2 ? l2.next : null;

        }


        return res;
    }


    private ListNode mySolution(ListNode l1, ListNode l2) {
        //pointers to loop each digits
        ListNode index1 = l1;
        ListNode index2 = l2;

        int addition = 0;
        while( true ) {
            index1.val = index1.val + index2.val + addition;
            if(index1.val >= 10){
                index1.val -= 10;
                addition = 1;
            } else {
                addition = 0;
            }
            if(null == index1.next || null == index2.next){
                break;
            }
            index1 = index1.next;
            index2 = index2.next;
        }

        if(null != index2.next){
            index1.next = index2.next;
        }


        if(null != index1.next){
            index1.next.val += addition;
        } else if( 1 == addition){
            ListNode lastNode = new ListNode(1, null);
            index1.next = lastNode;
        }

        index1 = index1.next;
        boolean addAnotherOne = false;
        while(null != index1 && index1.val >= 10){
            index1.val -= 10;
            if(null != index1.next){
                index1.next.val += 1;
                index1 = index1.next;
            } else {
                addAnotherOne = true;
                break;
            }
        }

        if(addAnotherOne){
            ListNode lastNode = new ListNode(1, null);
            index1.next = lastNode;
        }


        return l1;
    }
    
}
