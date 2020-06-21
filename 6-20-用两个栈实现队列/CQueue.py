#stack_in只负责进栈；stack_out只负责出栈；当stack_out为空时，才将stack_in的内容导入进stack_out
class CQueue:

    def __init__(self):
        self.stack_in = []
        self.stack_out = []

    def appendTail(self, value: int) -> None:
        self.stack_in.append(value)

    def deleteHead(self) -> int:
        if len(self.stack_out) > 0:
            return self.stack_out.pop()
        else:
            if len(self.stack_in) == 0:
                return -1
            else:
                while len(self.stack_in) > 0:
                    self.stack_out.append(self.stack_in.pop())
                return self.stack_out.pop()


obj = CQueue()
obj.appendTail(5)
obj.appendTail(2)
param1 = obj.deleteHead()
param2 = obj.deleteHead()
print(param1)
print(param2)