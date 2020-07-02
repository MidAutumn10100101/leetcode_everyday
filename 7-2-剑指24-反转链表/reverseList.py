# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        node1 = head
        node3 = None
        while node1:
            node2 = node1.next
            node1.next = node3
            node3 = node1
            node1 = node2
        return node3


