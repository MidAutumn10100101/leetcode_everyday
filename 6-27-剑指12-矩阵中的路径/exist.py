
#将矩阵视为图，则找矩阵中的路径就是深度搜索。先将第一个字符所在位置全存储起来，后依次从第一个字符处深度搜索

class Solution:
    def exist(self, board, word: str) -> bool:
        def dfs(i, j, k):
            if not 0<=i<len(board) or not 0<=j<len(board[0]) or board[i][j]!=word[k]:
                return False
            if k == len(word)-1:
                return True
            tmp = board[i][j]
            board[i][j] = '/'
            res = dfs(i + 1, j, k + 1) or dfs(i - 1, j, k + 1) or dfs(i, j + 1, k + 1) or dfs(i, j - 1, k + 1)
            board[i][j] = tmp
            return res

        for i in range(len(board)):
            for j in range(len(board[0])):
                if dfs(i, j, 0):
                    return True
        return False


obj = Solution()
print(obj.exist([["a","b","c","e"],
["s","f","c","s"],
["a","d","e","e"]], "abfb"))

# 作者：jyd
# 链接：https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/solution/mian-shi-ti-12-ju-zhen-zhong-de-lu-jing-shen-du-yo/
# 来源：力扣（LeetCode）
# 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。