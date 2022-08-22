# https://www.hackerrank.com/challenges/finding-the-percentage/problem

if __name__ == '__main__':
    
    from statistics import mean
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    # select a name for finding mean value of it
    query_name = input() 
    # find mean value
    # https://www.geeksforgeeks.org/python-dictionary-keys-method/
    if query_name in list (student_marks.keys()): 
        mean_of_marks = mean (student_marks[query_name])
        print ("{:.2f}".format(mean_of_marks))
