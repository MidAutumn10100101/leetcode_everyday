#使用快慢指针
# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def getKthFromEnd(self, head: ListNode, k: int) -> ListNode:
        node1 = head
        node2 = head
        while k > 0:
            node2 = node2.next
            k = k - 1
        while node2:
            node2 = node2.next
            node1 = node1.next
        return node1