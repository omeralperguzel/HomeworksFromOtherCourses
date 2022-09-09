# DESIGNER DOOR MAT / EASY / PYTHON(BASIC)
# Date: 09.09.2022
# https://www.hackerrank.com/challenges/designer-door-mat/
# https://www.hackerrank.com/challenges/designer-door-mat/forum/comments/1162741

# Enter your code here. Read input from STDIN. Print output to STDOUT
height,width = map(int, input().split())
s1 = ".|."
s2 = "WELCOME"
for i in range(height//2):
    print((s1 * ((i * 2) + 1)).center(width, '-'))
print(s2.center(width, '-'))
for i in range(height//2-1, -1, -1):
    print((s1 * ((i * 2) + 1)).center(width, '-'))
