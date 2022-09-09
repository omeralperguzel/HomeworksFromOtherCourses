# TEXT WRAP (ALTERNATIVE SOLUTION)/ EASY / PYTHON(BASIC)
# Date: 09.09.2022
# https://www.hackerrank.com/challenges/text-wrap/
# https://www.hackerrank.com/challenges/text-wrap/forum/comments/1160012

import textwrap

def wrap(string, max_width):
    x = int(max_width)
    start = 0
    times_looped = 0
    xyz = str()
    while times_looped <= (len(string)//x):
        xyz += (string[start:max_width])
        xyz += '\n'
        start += x
        max_width += x
        times_looped += 1
    return xyz

if __name__ == '__main__':
    string, max_width = input(), int(input())
    result = wrap(string, max_width)
    print(result)