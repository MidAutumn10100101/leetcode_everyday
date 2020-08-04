class Solution:
    def majorityElement(self, nums):
        i = 1
        res = nums[0]
        count = 1
        while i < len(nums):
            if nums[i] == res:
                count = count + 1
            else:
                count = count - 1
                if count <= 0:
                    res = nums[i]
                    count = 1
            i = i + 1
        return res

obj = Solution()
res = obj.majorityElement([8,8,7,7,7])
print(res)