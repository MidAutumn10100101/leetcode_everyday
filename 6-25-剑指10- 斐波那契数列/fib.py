#使用递归，很简单，但是超出了时间限制


# class Solution:
#     def fib(self, n: int) -> int:
#         if n == 0:
#             return 0
#         if n == 1:
#             return 1
#         anw = Solution.fib(self, n-1) + Solution.fib(self, n-2)
#         return anw % int(1e9+7)

class Solution:
    def fib(self, n: int) -> int:
        if n == 0:
            return 0
        if n == 1:
            return 1
        anw = [0 for i in range(0, n+1)]
        anw[1] = 1
        i = 2
        while i <= n:
            anw[i] = anw[i-1] + anw[i-2]
            i = i + 1
        return anw[n] % int(1e9+7)

obj = Solution()
anw = obj.fib(50)
print(anw)
