#思路一：快排，取前K个，O（NlogN)

class Solution:
    def getLeastNumbers(self, arr, k) :
        arr.sort()
        return arr[:k]