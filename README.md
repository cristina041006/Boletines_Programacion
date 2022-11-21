# Boletines
En este repositorio se utilizara Python para poder realizar los distintos problemas plnateados

[python]:https://programacion.net/files/article/20160603020635_python-logo.png

![logo][python]

Descubre aquí los distintos **boletines de proramación**, en ellos podras encontrar  ejercicios de:
- Condicionales
- Logísticos
- Bucles

También encontraremos **funciones basicas** que nos permitiran distintas cosas:
- print ()
  - Se utiliza para imprimir una cadena de texto, numero o una lista
- int()
  - Se utiliza para indicar que la variable que vamos a utilizar es un numero entero
- input()
  - Se utiliza para indicar que la variable que vamos a utilizar es una cadena
- float()
  - Se utiliza para indicar que la variable que vamos a utilizar es un numero decimal



## Boletín 1

[boletin1]:https://github.com/cristina041006/Boletines/tree/master/Boletin1/Ejercicio

Aquí puedes encontrar los ejercicios del primer [boletin][boletin1]

En este boletin encontraras _cinco ejercicios_ donde desarrollaremos nuestras capacidades en operaciones básicas.
Las **variables** que encontraras en estos ejercicios son:

Variables | Utilidad
--------- | --------
and | Para cumplise esa condicion deben darse las dos condiciones
or | Para cumplirse esa condicion se debe dar una de las dos condiciones
not | Le da una conotacion negacion a las dos anteriores (and, or)

Las **operaciones matematicas** que encontraras son:

Operacion | Utilidad
--------- | ---------
"+" | Suma dos números
"-" | Resta dos numeros
"%" | Te da el conciente de la division
"*" | Te multiplica dos numero
"/" | Divide dos numero

Las **condiciones matematicas** que utilizaremos seran:

Condiciones | Utilidad
----------- | ---------
"<" | Menor que
">" |Mayor que
"=" | Iguales
"<=" | Menor o igual que
">=" | Mayor o igual que

- Gracias a todas estas variables y utilizandolas de _direfentes formas_ podremos resolver las cuestiones que nos plantea el ejercicio como por ejemplo
  - _**Debe ser Verdadera si las dos variables enteras saldo de una cuenta, y dineroSacar son
válidas**_.

~~~
saldo = 1000

dineroSacar = 50

print(0 <= saldo and (0 < dineroSacar and dineroSacar <= saldo))

saldo = -1000

dineroSacar = 1000

print(0 <= saldo and (0 < dineroSacar and dineroSacar <= saldo))

saldo = 1000

dineroSacar = 2000

print(0 <= saldo and (0 < dineroSacar and dineroSacar <= saldo))
~~~

## Boletín 2

[boletin2]:https://github.com/cristina041006/Boletines/tree/master/Boletin2/Ejercicio

Aquí puedes encontrar los ejercicios del segundo [boletin][boletin2]

- En este boletin **utilizaremos los comando que hemos visto anteriormente** en el boletin 1 para poder resolver los problemas planteados

  - _**Como por ejemplo**_

~~~
print("Escribir una expresión lógica que cumpla:")

print("a)")
not1 = 3
not2 = 5
not3 = 6
print(5 <= not1 <= 10 and 5 <= not2 <= 10 and 5 <= not3 <=10)
not1 = 10
not2 = 5
not3 = 7
print(5 <= not1 <= 10 and 5 <= not2 <= 10 and 5 <= not3 <=10)

print("b)")
saldo = 1000
descubierto = 4
print(1000 <= saldo and 5 > descubierto)
saldo = 500
descubierto = 4
print(1000 <= saldo and 5 > descubierto)
saldo = 1500
descubierto = 6
print(1000 <= saldo and 5 > descubierto)

print("c)")
asignaturasAprobadas = 6
asignaturasCurso = 10
print((30*asignaturasCurso)/100 < asignaturasAprobadas)
asignaturasAprobadas = 2
asignaturasCurso = 10
print((30*asignaturasCurso)/100 < asignaturasAprobadas)
~~~

## Boletín 3

[boletin3]:https://github.com/cristina041006/Boletines/tree/master/Boletin3/ejercicio

Aquí puedes encontrar los ejercicios del tercero [boletin][boletin3]

En este boletin podras encontrar dieciseis ejercicios donde utilizaremos **condicionales** junto a las variables descritas
en el boletin 1 para poder resolver los problemas planteados.
Las **condiciones** que encontraras en este ejercicio son:

Variables | Utilidad
--------- | --------
if | Comienza una condicion y el programa va a pasar por esa condicion si o si
elif | Le sigue al if, si la condicion del if no se cumple se comprobara si se cumple esta condicion 
else | Le sigue al else o al if, si alguna de las condiciones anteriores no se cumple se comprobara esta condicion 

- Dato: Si queremos que se comprueben todas las condiciones se tendra que poner varios "if"
- _**Como ejemplo tenemos:**_

~~~
alumnos= int(input("¿Cuántos alumnos son?"))

if 100<= alumnos:
    print("Cada alumno debe pagar 65 euros y el total sería", alumnos*65, "euros")
elif 50<=alumnos<=99:
    print("Cada alumno debe pagar 70 euros y el total sería", alumnos*70, "euros")
elif 30<=alumnos<=49:
    print("Cada alumno debe pagar 95 euros y el total seria", alumnos*95, "euros")
else: 
    print("La renta del autobús es de 4000 euros")
~~~

## Boletín 5

[boletin5]:https://github.com/cristina041006/Boletines/tree/master/Bolietin5/Ejercicio

Aquí puedes encontrar los ejercicios del quinto [boletin][boletin5]

- En este boletin utilizaremos todas las **condiciones anteriores** para poder resolver los cuatro ejercicios que se nos plantea.
  - _**Como por ejemplo:**_
  
~~~
grupo = input("Dime que grupo eres A/B/AB/0")
rh= input("Dime tu Rh +/-")

grupo2 =input("Dime que grupo eres A/B/AB/0")
rh2= input("Dime tu Rh +/-")

if rh== "+" and rh2=="+":
    if grupo=="A" and (grupo2=="A" or grupo2=="AB"):
        print("Compatible")
    elif grupo=="B" and (grupo2=="B" or grupo2=="AB"):
        print("Compatible")
    elif grupo=="AB" and (grupo2=="AB"):
        print("Compatible")
    else:
        print("Compatible")
elif rh== "-" and (rh2=="+" or rh2=="-"):
    if grupo=="A" and (grupo2=="A" or grupo2=="AB"):
        print("Compatible")
    elif grupo=="B" and (grupo2=="B" or grupo2=="AB"):
        print("Compatible")
    elif grupo=="AB" and (grupo2=="AB"):
        print("Compatible")
    else:
        print("Compatible")


else:
    print("No compatible")
~~~
  

## Boletín 6

[boletin6]:https://github.com/cristina041006/Boletines/tree/master/Boletin6/ejercicio

Aquí puedes encontrar los ejercicios del sexto [boletin][boletin6]

En este boletin vamos a encontrar catorce ejercicios donde se nos plantean problemas que vamos a resolver con 
un nuevo comando: **Bucles**
Existen dos tipos de bucles:

Bucle | Utilidad
----- | --------
"For i in range ():" | Se utiliza para recorrer una serie de caracter, lista, numeros; y poder realizar operaciones con cada uno de ellos, "i" seria cada uno de los elementos
"While:" | Un bucle condicional, mientas se cumpla la condicion que se le establece al bucle se cumplira repetitivamente lo que establezacas dentro

- _Dato: dentro de los bucles pueden utilizarse todas la variables y comandos para poder resolver el problema_
- _**Como por ejemplo:**_

~~~
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
~~~
