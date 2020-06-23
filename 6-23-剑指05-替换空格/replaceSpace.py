#直接遍历，遇见空格就将其替换为%20
class Solution:
    def replaceSpace(self, s: str) -> str:
        out = ""
        for i in range(0, len(s)):
            if s[i] != ' ':
                out = out + s[i]
            else:
                out = out + '%20'
        return out

obj = Solution()
s = "We are happy."
print(obj.replaceSpace(s))

