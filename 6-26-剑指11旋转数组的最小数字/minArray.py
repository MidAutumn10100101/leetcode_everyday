#由题目特性，直接遍历，遇到小数为止

class Solution:
    def minArray(self, numbers) -> int:
        for i in range(0, len(numbers)-1):
            if numbers[i+1] < numbers[i]:
                return numbers[i+1]
        return numbers[0]

obj = Solution()
print(obj.minArray([]))

# 注：此题也可用二分法解决，将线性时间复杂度降至对数级别