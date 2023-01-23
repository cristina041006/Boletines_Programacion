
"""
print("Ejercicio1*")

def computeFactorial (number):
    factorial=1
    if number>=0:
        if number==0:
            factorial=1 
        for i in range(1, number+1):
            factorial=factorial*i   
        return factorial

print(computeFactorial(5)) 

print("-----------------------------------------------")

print("Ejercicio2*")

def isLeapYear (year):
    return year%4==0 and (year%100!=0 or year%400==0)

print(isLeapYear(2004))


print("--------------------------------")

print("Ejercicio3*")


mes=3
anio=2003

def isLeapYear (year):
    return year%4==0 and (year%100!=0 or year%400==0)

def computeDaysInMonth (month, year):
    dias=[31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    diass= dias[month-1]
    mensaje=""
    if isLeapYear(year) and month==2:
        mensaje+= "El mes 2 de", year, "tiene 29 dias"
    else:
        mensaje+= "El mes", month, "de", year, "tiene", diass, "dias"
    return mensaje
        
print(computeDaysInMonth(5, 2004))        
        

print("----------------------------")

print("Ejercicio4*")
               
def getDayOfWeeken (day, month, year):
    semana=["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" ]
    mensaje=""
    aux = (14-month)//12
    year=year-aux
    month=month +12*aux-2
    diaSemana= semana[(day+year+year//4 - year//100 + year//400 + (31*month)//12)%7]
    return diaSemana    
        
    
print(getDayOfWeeken(25, 11, 2022))   



print("----------------------------------")

print("Ejercicio5*")

def powerlt (number1, number2=0):
    potencia=1
    for i in range(number2):
        potencia=potencia*number1
    return potencia

print(powerlt(2, 4))


print("---------------------------------")
"""
print("Ejercicio6")

def condiciones(number):
    validacion=True 
    number=str(number)
    valores= "1234567890.-"
     
    negativo=0
    punto=0
    for i in range(len(number)):
        if number[i]==".":
            punto+=1
        elif number[i]=="-":
            negativo+=1 

    if punto>1 or ("."==number[0]) or ("."==number[-1]):
        validacion=False 
    elif negativo>1 or ("-"!=number[0] and negativo==1):
        validacion=False
    elif "-"==number[0] and "."==number[1]:
        validacion=False
    for i in range(len(number)):
        if number[i] not in valores:
            validacion=False 
            
    return validacion

def getNumberOfDigits(number):
    if condiciones(number):
        number=str(number)
        numeros="1234567890" 
        tamanio=0
        for i in range(len(number)):
            if number[i] in numeros:
                tamanio+=1
        return tamanio

           
print(getNumberOfDigits("2345..34"))


"""
print("-------------------------")

print("Ejercicio7*")


def isPrime(number):
    while number>0:
        es_primo=True
        for i in range(2, number):
            if number%i==0:
                es_primo=False
        return es_primo  
    
    
print(isPrime(-9))    
    


print("----------------------------")

print("Ejercicio8*")

def solveSecondOrderEquation(a, b, c):
    mensaje=""
    raiz1 = (b**2)-4*a*c
    raiz2 = (raiz1)**(1/2)
    solution1= -b+raiz2
    solution2= -b-raiz2
    x1=solution1/(2*a)
    x2=solution2/(2*a)
    mensaje+= str(x1) + ", " + str(x2)
    return mensaje 

print(solveSecondOrderEquation(1, 2, 2))    
    
print("-----------------------------")
print("Ejercicio9*")

def isPrime9(number):
    while number>0:
        es_primo=True
        for i in range(2, number):
            if number%i==0:
                es_primo=False
        return es_primo  
    
def getPrimeDivisors(number):
    lista=[]
    for i in range(1, number):
        if number%i==0:
            if isPrime9(i):
                lista.append(i) 
    return lista

print(getPrimeDivisors(9))       
    
print("-------------------------")
print("Ejercicio10*")

def isFriendNumber(number1, number2):
    amigos=False 
    suma1=0
    suma2=0
    for i in range(1, number1):
        if number1%i==0:
            suma1=suma1+i
    for a in range(1, number2):
        if number2%a==0:
            suma2=suma2+a
    if suma1==number2 and suma2==number1:
        amigos=True
    return amigos

print(isFriendNumber(220, 284)) 

"""    
    
    