def is_leap(year):
    leap = False
    
    # Write your logic here
    if int(year%4)==0:
      if(year%100!=0 or year%400==0): 
        leap = True
    
    return leap

year = int(input())
print(is_leap(year))