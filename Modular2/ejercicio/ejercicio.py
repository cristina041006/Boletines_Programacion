
"""
print("Ejercicio1")

def computeFactorial (number):
    mensaje=""
    factorial=1
    while number==0:
        factorial=1
    mensaje+=str(factorial) 
  
    for i in range(1, number+1):
        factorial=factorial*i   
    mensaje+=str(factorial)
    return mensaje

print(computeFactorial(5)) 

print("-----------------------------------------------")

print("Ejercicio2")

def isLeapYear (year):
    return year%4==0 and (year%100!=0 or year%400==0)

print(isLeapYear(2003))

assert year==2004
assert not(year=2001)


print("--------------------------------")



print("Ejercicio3")

def isLeapYear (year):
    return year%4==0 and (year%100!=0 or year%400==0)

mes=3
anio=2003

def computeDaysInMonth (month, year):
    mensaje=""
    if isLeapYear(year) and month==2:
        mensaje+=
        
"""
print("----------------------------")

print("Ejercicio4")
               
def getDayOfWeeken (day, month, year):
    aux=0
    aux = (14-month)/12
    year=year-aux
    month=month +12*aux-2
    day=(day+day+day/4 - day/400 + (31*month)%7)
    pass   
print(getDayOfWeeken(3, 5, 2000))   
    
    
    
    
    
    
    
    
    
    
    
    
    
    