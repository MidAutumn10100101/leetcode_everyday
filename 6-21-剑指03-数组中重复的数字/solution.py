# from collections import Counter
# import random
# class Solution:
#     def findRepeatNumber(self, nums) -> int:
#         d = dict(Counter(nums)) #Counter目的是用来跟踪值出现的次数。它是一个无序的容器类型，以字典的键值对形式存储，其中元素作为key，其计数作为value。
#         repeat_num = [key for key,value in d.items() if value > 1]
#         print(random.choice(repeat_num))
#这里理解错了题目意思，应该是输出任何一个重复的数就可以了，我是将所有的重复数都找出了

class Solution:
     def findRepeatNumber(self, nums) -> int:
         find_set = set()
         for num in nums:
             if num in find_set:
                 return num
             else:
                 find_set.add(num)

obj = Solution()
num = obj.findRepeatNumber([2, 3, 1, 0, 2, 5, 3])
print(num)