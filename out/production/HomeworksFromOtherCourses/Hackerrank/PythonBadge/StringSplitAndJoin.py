# https://www.hackerrank.com/challenges/python-string-split-and-join/

# https://www.geeksforgeeks.org/python-program-split-join-string/

def split_and_join(line):
    # write your code here
    # print the string after split method
    # print(line.split(" "))
    # print the string after join method
    return ("-".join(line.split()))


if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)