# 这个题本质上也是菲波那切数列，跳n个台阶：第一次跳1级台阶，剩下的是n-1个台阶的跳法；第一次跳2级台阶，剩下的n-2个台阶的跳法

class Solution:
    def numWays(self, n: int) -> int:
        if n == 0:
            return 1
        if n == 1:
            return 1
        if n == 2:
            return 2
        anw = [0 for i in range(0, n + 1)]
        anw[1] = 1
        anw[2] = 2
        i = 3
        while i <= n:
            anw[i] = anw[i - 1] + anw[i - 2]
            i = i + 1
        return anw[n] % int(1e9 + 7)

