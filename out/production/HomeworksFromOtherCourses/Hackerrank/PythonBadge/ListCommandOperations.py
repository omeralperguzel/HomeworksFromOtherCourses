# https://www.hackerrank.com/challenges/python-lists/

if __name__ == '__main__':
    N = int(input())
    list_1 = []    
    for i in range (N) : 
        input1 = input()
        # https://oguzcelikarslan.medium.com/pythonda-yıldız-i̇şaretlerinin-5-kullanımı-7914e9574017 case 2
        function_name , *list1 = input1.split()
        # https://www.geeksforgeeks.org/python-map-function/
        list2 = list(map(int, list1))

        if function_name == 'insert' :
            list_1.insert(*list2) 
        elif function_name == 'print' :
            print (list_1)
        elif function_name == 'remove' :
            list_1.remove (*list2)
        elif function_name == 'append' :
            list_1.append (*list2)
        elif function_name == 'sort' :
            list_1.sort()
        elif function_name == 'pop' :
            list_1.pop()
        elif function_name == 'reverse' :
            list_1.reverse() 
