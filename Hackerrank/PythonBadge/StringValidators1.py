# STRING VALIDATORS / EASY / PYTHON(BASIC)
# Date: 09.09.2022
# You are given a string S.
# Your task is to find out if the string S contains: alphanumeric characters, alphabetical characters, digits, lowercase and uppercase characters.

if __name__ == '__main__':
    # IMPORTANT SOURCE
    # https://stackoverflow.com/questions/16505456/how-does-this-input-work-with-the-python-any-function
    s = input()
    # https://docs.python.org/2/library/stdtypes.html#str.isalnum
    print(any(i.isalnum()for i in s))
    # https://docs.python.org/2/library/stdtypes.html#str.isalpha
    print(any(i.isalpha()for i in s))
    # https://docs.python.org/2/library/stdtypes.html#str.isdigit
    print(any(i.isdigit()for i in s))
    # https://docs.python.org/2/library/stdtypes.html#str.islower
    print(any(i.islower()for i in s))
    # https://docs.python.org/2/library/stdtypes.html#str.isupper
    print(any(i.isupper()for i in s))
    #print s.isalnum()
    #print s.isalpha()
    #print s.isdigit()
    #print s.islower()
    #print s.isupper()