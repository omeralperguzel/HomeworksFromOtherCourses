# https://www.tutorialspoint.com/What-does-colon-operator-do-in-Python

def mutate_string(string, position, character):
    #string[position] = character
    result = string[:position] + character + string[position+1:]
    return result

# The : symbol is used for more than one purpose in Python
# As slice operator with sequence −
# The − operator slices a part from a sequence object such as list, tuple or string. It takes two arguments. First is the index of start of slice and second is index of end of slice. Both operands are optional. If first operand is omitted, it is 0 by default. If second is omitted, it is set to end of sequence.

if __name__ == '__main__':
    s = input()
    i, c = input().split()
    s_new = mutate_string(s, int(i), c)
    print(s_new)