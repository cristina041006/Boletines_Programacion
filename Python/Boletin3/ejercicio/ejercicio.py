
print("Ejercicio1")

cateto1 = int(input("Dime un número: "))
cateto2 = int(input("Dime otro número: "))

print("Su hipotenusa es", (cateto1**2 + cateto2**2)**0.5)

print("--------------------------------------------")

print("Ejercicio2")

gradoFahrenheit = int(input("Dime un número: "))

print("Son", (gradoFahrenheit-32) * 5//9, "grados Celsius")



print("-------------------------------------")

print("Ejercicio3")

num1 = int(input("Dime un número: "))
num2 = int(input("Dime un número: "))
num3 = int(input("Dime un número: "))

print((num1+num2+num3)/3)

print("-------------------------------")
print("Ejercicio4")

precio = int(input("¿Cuánto te cuesta?"))
descuento = precio*15/100

print("Su descuento es", descuento,"el precio final es", precio-descuento)


print("-----------------------------------")

print("Ejercicio5")

numero1 = int(input("Dime un número: "))
numero2 = int(input("Dime un número: "))
distancia = numero1 - numero2

print("La distancia entre los número es de", abs(distancia))



print("-------------------------------")
print("Ejercicio6")

x1 = int(input("Dime un número x1: "))
y1 = int(input("Dime un número y1: "))
x2 = int(input("Dime un número x2: "))
y2 = int(input("Dime un número y2: "))

print("Su distancia es", ((x2-x1)**2 + (y2-y1)**2)**0.5)

print("--------------------------------")

print("Ejercicio7")
numero = int(input("Dime un número: "))

print("Su raíz cuadrada es", numero**(1/2), "y su raíz cubíca", numero**(1/3))


print("--------------------------------------")

print("Ejercicio8")

euros2 = int(input("¿Cuantas monedas de 2 euros tienes?"))
euros1 = int(input("¿Cuantas monedas de 1 euros tienes?"))
centimos50 = int(input("¿Cuantas monedas de 50 centimos tienes?"))
centimos20 = int(input("¿Cuantas monedas de 20 centimos tienes?"))
centimos10 = int(input("¿Cuantas monedas de 10 centimos tienes?"))

print("El dinero que tienes es", euros2*2 + euros1*1 + centimos50/2 + centimos20/5 + centimos10/10,"euros y", euros2/200 + euros1/100 + centimos50*2 + centimos20*5 + centimos10*10)


print("-------------------------------------------")

print("Ejercicio9")

base = int(input("Dime la base: "))
exponente = int(input("Dime el exponente: "))

if 0<exponente:
    print(base**exponente)
elif 0>exponente:
    print("1/", base**(-exponente))
    

print("----------------------------")

print("Ejercicio10")

lado1 = int(input("¿Cuánto mide el primer lado?: "))
lado2 = int(input("¿Cuánto mide el segundo lado?: "))
lado3 = int(input("¿Cuánto mide el tercer lado?: "))

if lado1 == lado2 and lado2 == lado3:
    print("Es un triangulo equilátero")
elif lado1 == lado2 or lado2 == lado3 or lado1 == lado3:
    print("Es un triángulo isosceles")
elif lado1**2 + lado2**2 == lado3**2 or lado1**2 + lado3**2 == lado2**2 or lado1**2 + lado2**3 == lado1**2 :
    print("Es un triangulo rectángulo")
else:
    print("Es un triangulo escaleno")



print("------------------------------------")

print("Ejercicio11")

año = int(input("Dime un año: "))

if año%4 ==0 and año%100 !=0 and año%400 !=0:
    print("Es un año bisiesto")
elif año%4 ==0 and año%100 ==0 and año%400 ==0:
    print("Es un año bisiesto")
else:
    print("El año no es bisiesto")



print("---------------------------------------")

print("Ejercicio12")

tipo=input("¿Que tipo quieres A o B?")
tamaño =int(input("¿Que tamaño quieres 1 o 2?"))

if tipo=="A" and tamaño== 1:
    print("La carga serían 20 céntimos y la ganancia seria de 20 céntimos")
elif tipo=="A" and tamaño==2:
    print("La carga sería de 30 céntimos y la ganancia sería de 30 céntimos")
elif tipo=="B" and tamaño==1:
    print("El precio se rebaja 30 céntimos y la ganancia seria de -30 céntimos")
else:
    print("El precio se rebaja 50 y la ganancia sería de -50 céntimos")
    
print("-----------------------------------------")

print("Ejercicio13")

alumnos= int(input("¿Cuántos alumnos son?"))

if 100<= alumnos:
    print("Cada alumno debe pagar 65 euros y el total sería", alumnos*65, "euros")
elif 50<=alumnos<=99:
    print("Cada alumno debe pagar 70 euros y el total sería", alumnos*70, "euros")
elif 30<=alumnos<=49:
    print("Cada alumno debe pagar 95 euros y el total seria", alumnos*95, "euros")
else: 
    print("La renta del autobús es de 4000 euros")


from _pydecimal import _log10_digits
print("-------------------------------------------")

print("Ejercicio14")

tiempoLlamada = int(input("¿Cuanto tiempo llamaste?"))
precio = 0
dia= input("¿Que día es?")
turno= input("¿Que turno es de mañana o tarde?")

if 0<tiempoLlamada <=5:
    precio = precio+(tiempoLlamada*1)
if 5< tiempoLlamada <=8:
    precio = precio+(tiempoLlamada*0.8)
if 8< tiempoLlamada <=10:
    precio = precio+(tiempoLlamada*0.7)
if 10< tiempoLlamada:
    precio = precio+(tiempoLlamada*0.5)

if dia == "domingo":
    precio = precio+((precio*3)/100)    
if turno == "mañana":
    precio = precio+((precio*15)/100)
elif turno =="tarde":
    precio = precio+((precio*10)/100)
    
print(precio)
    

print("---------------------------------")
print("Ejercicio15")

diaSemana= int(input("Dime un dia de la semana 1-7: "))

if 1<= diaSemana<=7:
    if diaSemana ==1:
        print("El día es lunes")
    elif diaSemana ==2:
        print("El día es martes")
    elif diaSemana ==3:
        print("El día es miercoles")
    elif diaSemana ==4:
        print("El día es jueves")
    elif diaSemana ==5:
        print("El día es viernes")
    elif diaSemana ==6:
        print("El día es sabado")
    else:
        print("El día es domingo")
else:
    print("Error")

print("-----------------------------------------------")

print("ejercicio16")

mes= int(input("Dime un número del 1-12: "))

if 1<=mes<=12:
    if mes==1:
        print("El mes es enero y tiene 31 días")
    elif mes==2:
        print("El mes es febrero y tiene 28 o 29 días")
    elif mes==3:
        print("El mes es marzo y tiene 31 días")
    elif mes==4:
        print("El mes es abril y tiene 30 días")
    elif mes==5:
        print("El mes es mayo y tiene 31 días")
    elif mes==6:
        print("El mes es junio y tiene 30 días")
    elif mes==7:
        print("El mes es julio y tiene 31 días")
    elif mes==8:
        print("El mes es agosto y tiene 31 días")
    elif mes==9:
        print("El mes es septiembre y tiene 30 días")
    elif mes==10:
        print("El mes es octubre y tiene 31 días")
    elif mes==11:
        print("El mes es nomviembre y tiene 30 días")
    else:
        print("El mes es diciembre y tiene 31 días")
    









