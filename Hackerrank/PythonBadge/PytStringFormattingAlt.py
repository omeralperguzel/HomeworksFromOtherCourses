# PYTHON STRING FORMATTING (ALTERNATIVE SOLUTION) / EASY / PYTHON(BASIC)
# Date: 09.09.2022
# https://www.hackerrank.com/challenges/designer-door-mat/
# https://www.hackerrank.com/challenges/python-string-formatting/forum/comments/1156034

def print_formatted(number):
    # your code goes here
    l=len(bin(n))-2

    for i in range (1, number+1):
        decimal =str(i).rjust(l," ")
        octadecimal= str(oct(i)[2:]).rjust(l," ")
        hexadecimal = str(hex(i)[2:]).rjust(l," ")
        binary = str(bin(i)[2:]).rjust(l," ")

        hexadecimal = hexadecimal.upper()
        print(decimal, octadecimal, hexadecimal, binary)

if __name__ == '__main__':
    n = int(input())
    print_formatted(n)