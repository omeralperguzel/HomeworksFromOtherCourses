# TEXT ALIGNMENT / EASY / PYTHON(BASIC)
# Date: 09.09.2022
# https://www.hackerrank.com/challenges/text-alignment/
# https://www.hackerrank.com/challenges/text-alignment/forum/comments/1157795

# Enter your code here. Read input from STDIN. Print output to STDOUT
thickness = int(input())
c = 'H'
#Top Cone
for i in range(thickness):
    print((c*i).rjust(thickness-1)+c+(c*i).ljust(thickness-1))
#Top Pillars
for i in range(thickness+1):
    print((c*thickness).center(thickness*2)+(c*thickness).center(thickness*6))
#Middle Belt
for i in range((thickness+1)//2):
    print((c*thickness*5).center(thickness*6))
#Bottom Pillars
for i in range(thickness+1):
    print((c*thickness).center(thickness*2)+(c*thickness).center(thickness*6))
#Bottom Cone
for i in range(thickness):
    print(((c*(thickness-i-1)).rjust(thickness)+c+(c*(thickness-i-1)).ljust(thickness)).rjust(thickness*6))