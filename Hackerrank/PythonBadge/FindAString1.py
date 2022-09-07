#https://www.thelearningpoint.net/computer-science/learning-python-programming-and-data-structures/learning-python-programming-and-data-structures--tutorial-12--string-manipulation

#https://codeworld19.blogspot.com/2020/07/find-string-in-python-hacker-rank.html

def count_substring(string, sub_string):
    count = 0
    # from 0 to main string subtracted to substring
    for i in range(len(string)-len(sub_string)+1):
        # if it can find something equal to our substring counter will incrase by 1.
        if (string[i:i+len(sub_string)] == sub_string):
    
            count += 1
    return count

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)