#思路一：暴力解决，时间复杂度O(n)
#思路二：观察到二维数组从左至右、从上到下，数值都是递增的。所以先遍历右上角元素，若target比其小，
# 则往左查找；若target比其大，则往下查找

# class Solution:
#     def findNumberIn2DArray(self, matrix, target: int) -> bool:
#         for i in matrix:
#             for j in i:
#                 if target == j:
#                     return True
#         return False

class Solution:
    def findNumberIn2DArray(self, matrix, target: int) -> bool:

        if matrix == [] or len(matrix) == 0 or len(matrix[0]) == 0:
            return False
        n = len(matrix)
        m = len(matrix[0])
        i = 0
        j = m - 1
        while i < n and j >= 0:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] > target:
                j = j - 1
            else:
                i = i + 1
        return False
obj = Solution()
matrix = [

]
A = obj.findNumberIn2DArray(matrix, 20)
print(A)
