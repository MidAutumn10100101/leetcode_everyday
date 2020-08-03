class MinStack:

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.A = []
        self.B = []

    def push(self, x: int) -> None:
        self.A.append(x)
        if not self.B or x <= self.B[-1]:
            self.B.append(x)

    def pop(self) -> None:
        x = self.A.pop()
        if self.B[-1] == x:
            self.B.pop()

    def top(self) -> int:
        return self.A[-1]

    def min(self) -> int:
        return self.B[-1]


#要使所有操作的时间复杂度为O（1）,需要空间换时间
#精髓在于使用两个栈，一个正常操作，一个栈顶存储最小元素