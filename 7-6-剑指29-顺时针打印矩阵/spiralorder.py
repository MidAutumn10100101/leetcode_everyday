#可视为深度优先遍历

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        ouput = []
        def dfs(i, j, output):
            if not 0<=i<len(matrix) or not 0<=j<len(matrix[0]) or matrix[i][j] == '/':
                return
            ouput.append(matrix[i][j])
            matrix[i][j] = '/'
            dfs(i, j+1, ouput)
            dfs(i+1, j, ouput)
            dfs(i, j-1,)


        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                dfs(i, j, ouput)
        return ouput