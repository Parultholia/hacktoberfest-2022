# This is Balance paranthesis

from collections import deque

class Stack:
    def _init_(self):
        self.container = deque()

    def push(self, val):
        self.container.append(val)

    def pop(self):
        return self.container.pop()

    def popleft(self):
        return self.container.popleft()

    def peek(self):
        return self.container[-1]

    def is_empty(self):
        return len(self.container) == 0

    def size(self):
        return len(self.container)

def is_match(ch1, ch2):
    match_dict = {
        '}': '{',
        ']': '[',
        ')': '('
    }
    return match_dict[ch1] == ch2


def is_balanced(pstr):
    stack = Stack()

    for ch in pstr:
        if ch == '(' or ch =='[' or ch == '{':
            stack.push(ch)
        if ch == ')' or ch =='}' or ch == ']':
            if stack.size()==0:
                return False

            if not is_match(ch, stack.pop()):
                return False

    return stack.size() == 0

if _name_ == "_main_":
    print(is_balanced("({a+b})"))
    print(is_balanced("))((a+b}{"))
    print(is_balanced("((a+b))"))
    print(is_balanced("((a+g))"))
    print(is_balanced("))"))
    print(is_balanced("[a+b](x+2y){gg+kk}"))