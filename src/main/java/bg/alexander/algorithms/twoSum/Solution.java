package bg.alexander.algorithms.twoSum;//Definitiotion for singly-linked list.
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
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(7);
//        ListNode n3 = new ListNode(3);
        n1.next = n2;
//        n2.next= n3;

        ListNode m1 = new ListNode(9);
        ListNode m2 = new ListNode(2);
//        ListNode m3 = new ListNode(4);
        m1.next = m2;
//        m2.next= m3;

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(n1,m1);
        System.out.println(result);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return sum(l1,l2,0);
    }

    public ListNode sum(ListNode l1, ListNode l2, int previousCarry){
        if(l1 == null && l2 == null){
            if(previousCarry == 0){
                return null;
            }
            else{
                return new ListNode(previousCarry);
            }
        }
        ListNode currentSum = null;

        int nextCarry = 0;
        if(l1 == null){
            currentSum = new ListNode((previousCarry+l2.val)%10);
            nextCarry =  (previousCarry+l2.val)/10;
        }
        else if(l2 == null){
            currentSum = new ListNode((l1.val+previousCarry)%10);
            nextCarry =  (l1.val+previousCarry)/10;
        }
        else{
            currentSum = new ListNode((l1.val+l2.val+previousCarry)%10);
            nextCarry =  (l1.val+l2.val+previousCarry)/10;
        }

        currentSum.next = sum(l1 == null ? null: l1.next,l2 == null ? null: l2.next, nextCarry);

        return currentSum;
    }
}
