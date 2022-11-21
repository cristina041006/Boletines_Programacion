


print("Ejercicio1")

numero1=int(input("Dime un número"))
numero2=int(input("Dime otro número"))

while 0>=numero1:
    numero1=int(input("Primer número no válido, introduce un número mayor que 0.Dime un número"))

while 0>=numero2:
    numero2=int(input("Segundo número no válido, introduce un número mayor que 0.Dime otro número"))
contador=0
resto=0

while numero1>=numero2:
    numero1= numero1-numero2
    contador= contador+1
    resto= numero1
print(contador)
print(resto)

while numero2>=numero1:
    numero2= numero2-numero1
    contador= contador+1
    resto= numero2
print(contador)
print(resto)


print("---------------------------------------------")

print("Ejercicio2")

num1=int(input("Dime un número entero"))
num2=int(input("Dime otro número entero"))

while 0>=num1:
    num1=int(input("Primer número no válido, introduce un número mayor que 0. Dime un número entero"))

while 0>=num2:
    num2=int(input("Segundo número no válido, introduce un número mayor que 0. Dime otro número entero"))

comienzo=num1-1    
contadorInicial=10
while contadorInicial>0:
    comienzo+=1
    if comienzo%num2==0:
        print(comienzo)
        contadorInicial-=1
    
inicio= 0

for i in range(num1, num1+num2):
    if i%num2==0:
        inicio=i
print(inicio)

for i in range(9):
    inicio+=num2
    print(inicio)
    
cadena=""
#for i in range(num1, num1+(num2*10):
 #   if i%multiplo==0:
  #      cadena+= str(i)


print("-------------------------------------------------")

print("Ejercicio3")

num4=int(input("Dime un número (0 para terminar la frecuencia)"))
while num4 != 0:
    mensaje=""
    if num4%2==0:
        mensaje+="es par"
    else:
        mensaje+="es impar"
    if num4>0:
        mensaje+=",es positivo"
    else:
        mensaje+=",es negativo"
    print(f"{mensaje} y su cuadrado es {num4**2}")
    
    num4=int(input("Dime un número (0 para terminar la frecuencia"))



print("----------------------------------------------------")

print("Ejercicio4")

longitud=int(input("Dime el tamaño de la secuencia"))

mensajeA=""
mensajeB=""
mensajeC=""

for i in range(longitud):
    mensajeA += str((-5)**i)
    if i!=longitud-1:
        mensajeA+=", "
        
        
        
    mensajeB+= str((i%-3)+1)
    if i!=longitud-1:
        mensajeB+=", " 
           
    mensajeC+=str(3**i)
    if i!=longitud-1:
        mensajeC+=", "
print(mensajeA)
print(mensajeB)
print(mensajeC)      




print("------------------------------")
print("Ejercicio5")


num6=int(input("Dime un número"))
numAux=num6
inicio=num6
cadena=""
while num6<0:
    num6=int(input("Numero incorrecto. Dime un número mayor que 0"))
    

while inicio != 1:
    if num6%2==0:
        num6= num6//2
        cadena+=", " + str(num6)
        inicio=num6
    
    elif num6%2 != 0:
        num6= 3*num6+1
        cadena+=", " + str(num6)
        inicio=num6

print(numAux, cadena)


print("----------------------------------------")
print("Ejercicio6")

edad=int(input("Dime la edad de Juan"))

while edad<=0:
    edad=int(input("Dato incorrecto.Dime la edad de Juan"))
puzzle=0
dinero=0
acumulaDinero=20
acumulaPuzzle=1
for i in range(1, edad+1):
    if i%2!=0:
        puzzle=puzzle+acumulaPuzzle
        acumulaPuzzle=acumulaPuzzle*2
    else:
        dinero=dinero+acumulaDinero
        acumulaDinero=acumulaDinero+15
print(puzzle, dinero)

    
print("-----------------------------------")
print("Ejercicio7")    
    
numero=int(input("Dime un número"))

for i in range(1, numero+1):
    print(str(numero)*i)


print("------------------------------------")
print("Ejercicio 8")

number=int(input("Dime un número"))
print("a)")

for i in range(1, number+1):
    print(str("*")*number)

print("b)")

for i in range(1, number+1):
    print((" ")*(number-i)+("*")*((i*2)-1))

print("c)")

for i in range(1, number+1):
    print((" ")*(number-i)+("*")*((i*2)-1))

for i in range(number-1, 0, -1):
    print((" ")*(number-i)+("*")*((i*2)-1))


print("-----------------------------------------------")

print("Ejercicio9")
number2=4

print("Cuadrado")

for i in range(1, number2+1):
    if 1<i<number2:
        print(str("*"), (" ")*((number2*2)-5), str("*")) 
    else:
        print(str("* ")*(number2))       
    
print("Triángulo")

for i in range(1, number2+1):
    if i==1 or i==number2:
        print((" ")*(number2-i)+("*")*((i*2)-1))   
    else:
        print((" ")*((number2-i)), str("*"), (" ")*((i*2)-3), str("*")) 

""" 
#1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 

longitud=(int(input("Dime la longitud")))
fibonacci=0
fibonacci2=1
auxiliar=0
cadena=""


for i in range(0, longitud+1):
    fibonacci= fibonacci2+auxiliar
    fibonacci2=auxiliar
    auxiliar=fibonacci
    if i == longitud:
        cadena+= str(fibonacci)
    else:
        cadena+= str(fibonacci) + (", ")
print(cadena)   
    
"""
    
    
    
    
    
    
    







