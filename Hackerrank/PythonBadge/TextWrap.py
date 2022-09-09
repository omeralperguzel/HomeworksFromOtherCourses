# TEXT WRAP / EASY / PYTHON(BASIC)
# Date: 09.09.2022
# https://www.hackerrank.com/challenges/text-wrap/

import textwrap

def wrap(string, max_width):
    result = ''
    for i in range(len(string)):
        if i!=0 and i%(max_width)==0:
            result = result + '\n'
        result = result + string[i]
    return result

if __name__ == '__main__':
    string, max_width = input(), int(input())
    result = wrap(string, max_width)
    print(result)