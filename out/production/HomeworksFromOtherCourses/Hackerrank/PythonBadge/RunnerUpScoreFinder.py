if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    
    secondnum = float('-inf') ; topnum = float('-inf')
    for i, n in enumerate(arr):
    # enumerate: birer birer sayma

      if n > topnum:
        secondnum = topnum
        topnum = n
      elif n < topnum and n > secondnum:
        secondnum = n

    print(secondnum)  