package leetcode.addtwonumbers;

import leetcode.util.ListNode;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode solution = new ListNode();
        ListNode current = solution;
        int carry = 0;
        while (l1.next != null || l2.next != null || carry != 0){
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new ListNode(sum);
            current = current.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return solution;
    }

}