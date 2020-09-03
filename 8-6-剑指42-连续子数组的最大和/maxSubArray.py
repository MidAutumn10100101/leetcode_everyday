#思路一：暴力
class Solution:
    def maxSubArray(self, nums):
        max_sum = nums[0];
        for i in range(0, len(nums)):
            for j in range(i, len(nums)):
                nums_cut = nums[i:j+1]
                s = sum(nums_cut)
                if s > max_sum:
                    max_sum = s
                    res = nums_cut
        return res


import redis

pedis = redis.Redis(host='10.249.44.135',port=6379,decode_response=True)

a =pedis.hget('realtime-000001.SZ','sellprice1')
isinstance(a, dict)
a['db']