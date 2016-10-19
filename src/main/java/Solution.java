//Definitiotion for singly-linked list.
//
//    public class ListNode {
//
//    int val;
//    ListNode next;
//    ListNode(int x) { val = x; }
//}


public class Solution {

    public static void main(String[] args) {
//        (2 -> 4 -> 3) + (5 -> 6 -> 4)
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next= n3;

        ListNode m1 = new ListNode(5);
        ListNode m2 = new ListNode(6);
        ListNode m3 = new ListNode(4);
        m1.next = m2;
        m2.next= m3;

        Solution solution = new Solution();
        solution.addTwoNumbers(n1,m1);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return sum(l1,l2);
    }

    public ListNode sum(ListNode l1, ListNode l2){
        int carry = 0;

        ListNode nextSum = null;

        if(l1.next!=null){
            nextSum = sum(l1.next,l2.next);
            carry =  (l1.next.val+l2.next.val)/10;
        }

        ListNode result = new ListNode((l1.val+l2.val+carry)%10);
        result.next = nextSum;

        return result;
    }

}
