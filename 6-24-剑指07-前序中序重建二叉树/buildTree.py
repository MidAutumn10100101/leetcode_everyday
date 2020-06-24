#经典题，前序、中序构造二叉树，递归构造即可

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def buildTree(self, preorder, inorder) -> TreeNode:
        node = TreeNode(-1)
        pre_len = len(preorder)
        in_len = len(inorder)
        if pre_len == 0 or in_len == 0:
            return None
        root_value = preorder[0]
        root_index = inorder.index(root_value)
        node.val = root_value
        if pre_len == 1 or in_len == 1:
            node.left = None
            node.right = None
            return node
        node.left = Solution.buildTree(self, preorder[1:root_index+1], inorder[0:root_index])
        node.right = Solution.buildTree(self, preorder[root_index+1:], inorder[root_index+1:])
        return node


obj = Solution()
obj.buildTree([3,9,20,15,7], [9,3,15,20,7])
