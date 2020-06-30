class Solution:
    def printNumbers(self, n: int):
        maxNum = 0
        i = 1
        while n:
            maxNum = maxNum + 9 * i
            i = i * 10
            n = n - 1
        nums = [num for num in range(1, maxNum + 1)]
        return nums

obj = Solution()
print(obj.printNumbers(3))