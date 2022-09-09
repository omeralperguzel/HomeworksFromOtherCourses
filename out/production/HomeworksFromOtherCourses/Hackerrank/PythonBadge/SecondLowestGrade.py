# https://www.hackerrank.com/challenges/nested-list/

if __name__ == '__main__':
    list1 = []
    list_of_names_of_second_lowest_grade = []
    
    # taking names and scores onto list1
    for i in range(int(input())):
        name = input()
        score = float(input())
        list1.append([name , score])
    set1 = set()
        
    # initializing second lowest grade
    for j in range (0,len(list1)):
        set1.add (list1 [j][1] )
        sorted_list_of_grades = sorted(list(set1))
    second_lowest_grade = sorted_list_of_grades[1]

    # finding other second lowest grade owners and putting them in order
    for a in range (0, len(list1)): 
        if list1[a][1] == second_lowest_grade:
            list_of_names_of_second_lowest_grade.append(list1 [a][0])
            final_list = sorted(list_of_names_of_second_lowest_grade)
    
    # printing their names in alphabetical order
    for names in final_list:
            print(names)
        
   