#两个指针一头一尾，相向遍历，若头指针元素为偶，尾指针元素为奇，交换元素位置，直到头尾指针相遇

class Solution:
    def exchange(self, nums) :
        head = 0
        tail = len(nums)-1
        while head < tail:
            if nums[head] % 2 == 0 and nums[tail] % 2 == 1:
                temp = nums[head]
                nums[head] = nums[tail]
                nums[tail] = temp
            if nums[head] % 2 == 1:
                head = head + 1
            if nums[tail] % 2 == 0:
                tail = tail - 1
        return nums

obj = Solution()
s = obj.exchange([1,2,1])
print(s)