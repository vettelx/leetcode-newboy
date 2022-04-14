package linkedlist;

/**
 * LeetCode206
 * <p>
 * Reverse Linked List
 *
 * @author qiang.xu
 * @since 2022/3/29
 */
public class LeetCode206 {

    public static void main(String[] args) {

    }

    /**
     * 头插法
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode tmpHead = new ListNode(Integer.MIN_VALUE);
        while (head != null) {
            ListNode tmp = head;
            head = head.next;
            tmp.next = tmpHead.next;
            tmpHead.next = tmp;
        }
        return tmpHead.next;
    }

}
