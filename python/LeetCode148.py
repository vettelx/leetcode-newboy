from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def sortList2(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return head
        val_list = []
        res = head
        while head is not None:
            val_list.append(head.val)
            head = head.next
        head = res
        val_list.sort()
        for val in val_list:
            head.val = val
            head = head.next
        return res

    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        left = head
        right = self.getMid(head)
        tmp = right.next
        right.next = None
        right = tmp

        left = self.sortList(left)
        right = self.sortList(right)

        return self.merge(left, right)

    def getMid(self, head: ListNode):
        fast = head.next
        slow = head
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
        return slow

    def merge(self, list1: ListNode, list2: ListNode):
        if not list1 or not list2:
            return list1 or list2
        dummy = res = ListNode(-1)
        while list1 and list2:
            if list1.val <= list2.val:
                dummy.next = list1
                list1 = list1.next
            else:
                dummy.next = list2
                list2 = list2.next
            dummy = dummy.next

        if list1:
            dummy.next = list1

        if list2:
            dummy.next = list2

        return res.next


if __name__ == "__main__":
    s = Solution()
    head = ListNode(5, ListNode(4, ListNode(3, ListNode(2, ListNode(1, None)))))
    s.sortList(head)
