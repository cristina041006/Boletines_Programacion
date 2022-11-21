
print("Ejercicio 17 (boletín 4)")

num = int(input("Dime un número"))
num2 = int(input("Dime otro número"))

for i in range (num, num2+1):
    if i%2==0:
        print(i)


print("--------------------------------------------------")
print("Ejercicio 18")

limiteInferior = int(input("Dime un límete inferior"))
limiteSuperior = int(input("Dime un límete superior"))
numerosFuera=0
numerosIguales=False
sumaNumeros=0

while limiteInferior>=limiteSuperior:
    limiteInferior = int(input("No puede ser mayor que el Limite superior. Dime un límete inferior"))
    
numeros = int(input("Dime un número dentro de los límites"))
    
while numeros != 0: 
      
    if limiteInferior < numeros < limiteSuperior:
        sumaNumeros += numeros
    elif numeros < limiteInferior or numeros > limiteSuperior:
        numerosFuera+=1
    else:
        numerosIguales=True
        
    numeros = int(input("Dime un número dentro de los límites"))
    
print("La suma de números es", sumaNumeros)
print("Hay", numerosFuera, "números fuera de los intervalos")
if numerosIguales:
    print("Hay al menos un número iguale al intervalo")


print("----------------------------------------------------")
print("Ejercicio 19")

base=int(input("Dime un número real"))
exponente=int(input("Dime un número entero positivo:"))
potencia=1
for i in range(exponente):
    potencia= potencia*base
print(potencia)

print("--------------------------------------")
print("Ejercicio 20")

cuota=10
suma=cuota
print("El pago del mes 1 es", cuota)
for i in range(2, 21):
    cuota=cuota*2
    suma=suma+cuota
    print("El pago del mes", i, "es", cuota)
    
    
print("El total es", suma)
 

print("--------------------------------------")
print("Ejercicio 21")

cantidad= int(input("Dime la cantidad de números primos: "))
cantidad2= 0

while cantidad2<cantidad:
    for i in range(1,20):
        if i%2==0:
            cantidad2=cantidad2+1
            print(i)


print(".................................................")




print("Ejercicio1")

for i in range(0, 101):
    
    if i%7==0 and i%13==0:
        print("El numero", i,"es multiplo de 7 y de 13")
    elif i%7==0:
        print("El número", i, "es multiplo de 7")
    elif i%13==0:
        print("El numero", i,"es multiplo de 13")
        
    



print("-----------------------------------------------")

print("Ejercicio2")

numero =int(input("Dime un numero entre 0 y 10: "))

if 0<=numero<=10:
    for i in range(0, 10+1):
        print(numero, "*", i, "=", i*numero)
else:
    print("El número esta fuera de los limites")
    

print("---------------------------------------------")
print("Ejercicio3")

cantidad = int(input("Cuantos números quieres introducir"))
cantidad2 = 0

while 0>=cantidad:
    cantidad = int(input("Introduce un número mayor que 0. ¿Cuantos números quieres introducir?"))

    
while cantidad2<cantidad:
    numero=int(input("Introduce un número mayor a 0"))
    while numero<=0:
       numero = int(input("No es válido. Introduce un numero mayor a 0")) 
    if numero%2 == 0:
        print("El numero es par")
    else:
        print("El numero no es par")
    cantidad2+=1
       
    

    
    
 
print("---------------------------------------------------")
print("Ejercicio 4")  
    
number=int(input("¿Hasta que número quieres contar?"))
suma =0

while 0>=number:
    number=int(input("No es correcto, introduce un número mayor que 0. ¿Hasta que número quieres contar?"))
    
for i in range(1, number+1):
    suma=suma+i
    
    
print("La suma de números desde el numero", number, "es", suma)


print("---------------------------------------------------")
print("Ejercicio 5")

numeros2= int(input("Intruduce un número (uno negativo para terminar)"))
numerosPositivos= 0
while numeros2>0:
    numeros2= int(input("Intruduce un número (uno negativo para terminar)"))
    numerosPositivos = numerosPositivos+1
print("Has introducido", numerosPositivos, "números positivos")    

print("------------------------------------")
print("Ejercicio 6")  

numeroA= int(input("Dime un número"))
numeroB= int(input("Dime otro numero"))
producto=0
for i in range(abs(numeroA)):
    producto= producto + numeroB
if numeroA<0:
     producto= -producto
print("El producto es", -producto)  
       


print("-----------------------------------------")
print("Ejercicio 7")

cantidades= int(input("¿Cuántos números quieres introducir?"))

while cantidades<=0:
    cantidades= int(input("Número incorrecto ¿Cuántos números quieres introducir?"))
    
numbers=int(input("Introduce un número mayor que 0"))

while 0>=numbers:
    numbers=int(input("Número incorrecto.Introduce un número mayor que 0"))
    
media=numbers
cantidades2=0
while cantidades2!=cantidades-1:
    numbers=int(input("Introduce un número mayor que 0"))
    while numbers <=0:
        numbers=int(input("Es erroneo introduce un número mayor que 0"))
    media=media+numbers
    cantidades2= cantidades2+1
print("La media de los numeros es", media/cantidades)  


print("-----------------------------")
print("Ejercicio 8")

num3 =int(input("Introduce un número"))
pequeño=num3
condicion=input("¿Quieres introducir mas números?")
while  condicion. upper()=="Y":
    condicion=input("¿Quieres introducir mas números?")
    num3 =int(input("Introduce un número"))
    if num3<pequeño:
        pequeño=num3
        
print("El numero mas pequeño es", pequeño)

print("-----------------------------------------")
print("Ejercicio 9")

num4= int(input("Introcude un numero positivo mayor que 0"))

while num4<=0:
    num4=int(input("El número no es valido, intentalo de nuevo"))
    
sumaDivisores=0

for i in range (1, (num4//2)+1):
    if num4%i==0:
        sumaDivisores+=i

if sumaDivisores==num4:
    print("perfecto")
else:
    print("no")
    

print("----------------------------------------")
print("Ejercicio 10")

num5=int(input("Introduce un número positivo"))
factorial=1
while num5<0:
    num5=int(input("El número no es válido, intentalo de nuevo"))
    
while num5==0:
    factorial=1
print(factorial) 
  
for i in range(1, num5+1):
    factorial=factorial*i
    
print(factorial)
     




    
   
   
    
   