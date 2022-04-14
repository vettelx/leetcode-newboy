package linkedlist;

/**
 * ListNode
 *
 * @author qiang.xu
 * @since 2022/3/29
 */
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
