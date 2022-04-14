package linkedlist;

/**
 * LeetCode002
 * <p>
 * Add Two Numbers
 *
 * @author qiang.xu
 * @since 2022/3/29
 */
public class LeetCode002 {

    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmpHead = new ListNode(Integer.MIN_VALUE);
        ListNode current = tmpHead;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            carry = sum / 10;
            sum = sum % 10;
            current.next = new ListNode(sum);
            current = current.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry != 0) {
            current.next = new ListNode(carry);
        }
        return tmpHead.next;
    }
}
