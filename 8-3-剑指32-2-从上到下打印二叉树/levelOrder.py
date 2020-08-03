# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def levelOrder(self, root: TreeNode):
        if not root:
            return []
        reslut = []
        queue = []
        queue.append(root)
        while queue:
            res = []
            length = len(queue)
            i = 0
            while i < length:
                node = queue.pop(0)
                res.append(node.val)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
                i = i + 1
            reslut.append(res)
        return reslut