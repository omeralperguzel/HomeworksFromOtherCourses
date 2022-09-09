# PYTHON STRING FORMATTING (Works but not what this question wanted) / EASY / PYTHON(BASIC)
# Date: 09.09.2022
# https://www.hackerrank.com/challenges/designer-door-mat/

def print_formatted(number):
    # your code goes here
    for i in range(1, number+1):
        txt1 = "{0}  "
        txt2 = "{0:o}  "
        txt3 = "{0:X}  "
        txt4 = "{0:b}"
        print(txt1.format(i)+txt2.format(i)+txt3.format(i)+txt4.format(i))

if __name__ == '__main__':
    n = int(input())
    print_formatted(n)