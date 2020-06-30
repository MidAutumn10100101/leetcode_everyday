# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def deleteNode(self, head: ListNode, val: int) -> ListNode:
        node1 = head
        node2 = ListNode()
        node2.next = head
        #删除头结点
        if head.val == val:
            head = head.next
        while node1:
            if node1.val == val:
                node2.next = node1.next
                break
            node1 = node1.next
            node2 = node2.next
        return head
