# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head is None:
            return head

        # 哨兵节点，指向head节点
        sentinel = ListNode(-1, head)

        # 快慢指针
        fast = sentinel
        slow = sentinel

        # 快指针先走n步
        for _ in range(n):
            fast = fast.next

        # 快慢指针都往后走一步，当快指针到达链表尾部时停止
        while fast.next is not None:
            fast = fast.next
            slow = slow.next

        slow.next = slow.next.next

        return sentinel.next


if __name__ == "__main__":
    s = Solution()
