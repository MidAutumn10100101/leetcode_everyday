# Definition for singly-linked list.
class ListNode:
     def __init__(self, x):
         self.val = x
         self.next = None

class Solution:
    def reversePrint(self, head: ListNode) :
        revlist = []
        while head != None:
            revlist.insert(0,head.val)
            head = head.next
        return revlist

head = ListNode(1)
node1 = ListNode(2)

head.next = node1

node1.next = None

obj = Solution()
out = obj.reversePrint(head)
print(out)
