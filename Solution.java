*/Definitiotion for singly-linked list.

 * public class ListNode {

 *     int val;

 *     ListNode next;

 *     ListNode(int x) { val = x; }

 * }

 */

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        

        

    }

    

    public int sum(ListNode l1, ListNode l2, ListNode result){

        int carry = 0;

        if(l1.next!=null){

            carry = sum(l1.next,l2.next,result);

        }

        

        result.next= new ListNode((l1.val+l2.val)%10);

        

        return l1.val+l2.val-(l1.val+l2.val)%10

    }

}
