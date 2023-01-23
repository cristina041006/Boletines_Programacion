"""
print("Ejercicio1")

calificacion=int(input("Dime tu nota"))

if 100 >=calificacion >= 90:
    print("Sobresaliente")
elif 89  >=calificacion >=70:
    print("Notable")
elif 69 >=calificacion  >=60:
    print("Bien")
elif 59 >= calificacion >= 50:
    print("Suficiente")
else:
    print("Suspenso")
    
print("------------------------------------------")

print("Ejercicio2")
dia= int(input("Dime un día"))
mes=int(input("Dime el número del mes"))
hemisferio=input("Dime un hemisferio: Norte/Sur")


if hemisferio== "Norte":
    if (mes == 9 and  23 <= dia <=31) or (9 < mes <= 11 and 1 <= dia <=31) or (mes==12 and 21>dia>=31):
        print("Otoño")
    elif (mes == 12 and  21 <= dia <=31) or (12 < mes <= 2 and 1 <= dia <=31) or (mes==3 and 21>dia):
        print("Invierno")
    elif (mes == 3 and  21 <= dia <=31) or (3 < mes <= 5 and 1 <= dia <=31) or (mes==6 and 21>dia):
        print("Primavera")
    else:
        print("Verano")
    
    
else:
    if (mes == 9 and  23 <= dia <=31) or (9 < mes <= 11 and 1 <= dia <=31) or (mes==12 and 21>dia>=31):
        print("Primavera")
    elif (mes == 12 and  21 <= dia <=31) or (12 < mes <= 2 and 1 <= dia <=31) or (mes==3 and 21>dia):
        print("Verano")
    elif (mes == 3 and  21 <= dia <=31) or (3 < mes <= 5 and 1 <= dia <=31) or (mes==6 and 21>dia):
        print("Otoño")
    else:
        print("Ivierno")

print("---------------------------------------------------------")
print("Ejercicio3")

dia=int(input("Dime un dia"))
mes=int(input("Dime un mes"))
año=int(input("Dime un año"))
bisiesto = (año%4 ==0 and año%100 !=0 and año%400 !=0) or (año%4 ==0 and año%100 ==0 and año%400 ==0)


#Esta estructura es el intento de depuración pero no consigo hacerlo
if (año%4 ==0 and año%100 !=0 and año%400 !=0) or (año%4 ==0 and año%100 ==0 and año%400 ==0):
    if mes==1 or mes==3 or mes==5 or mes == 7 or mes==8 or mes==10 or mes==12:
        dia = dia +(30*(mes-2) +29)
        print("Han pasado", dia, "dias")
    elif mes==2:
        dia = dia + 29
        print("Han pasado", dia,"dias")
    else:
        dia= dia + (30*mes)
        print("Han pasado", dia, "dias")
else:
    if mes==1 or mes==3 or mes==5 or mes == 7 or mes==8 or mes==10 or mes==12:
        dia = dia +(30*mes)
        print("Han pasado", dia, "dias")
    elif mes==2:
        dia = dia + 28
        print("Han pasado", dia,"dias")
    else:
        dia= dia + (30*mes)
        print("Han pasado", dia, "dias")
       
       
if bisiesto == True:
    if mes ==1:
        print(dia) 
    elif mes==2:
        dia = dia+ 31
    elif mes==3:
        dia = dia+ 31 + 29
    elif mes==4:
        dia = dia+ 31 + 29 + 31
    elif mes==5:
        dia = dia+ 31 + 29 + 31 + 30 
    elif mes==6:
        dia = dia+ 31 + 29 + 31+ 30+31
    elif mes==7:
        dia = dia+ 31 + 29 + 31+30+31+30
    elif mes==8:
        dia = dia+ 31 + 29+31+30+31+30+31
    elif mes==9:
        dia = dia+ 31 + 29+31+30+31+30+31+31
    elif mes==10:
        dia== dia+ 31 + 29+31+30+31+30+31+31+30
    elif mes==11:
        dia = dia+ 31 + 29+31+30+31+30+31+31+30+31
    elif mes==12:
        dia = dia+ 31 + 29+31+30+31+30+31+31+30+31+30
if bisiesto == False:
    if mes ==1:
        print(dia) 
    elif mes==2:
        dia = dia+ 31
    elif mes==3:
        dia = dia+ 31 + 28
    elif mes==4:
        dia = dia+ 31 + 28 + 31
    elif mes==5:
        dia = dia+ 31 + 28 + 31 + 30 
    elif mes==6:
        dia = dia+ 31 + 28 + 31+ 30+31
    elif mes==7:
        dia = dia+ 31 + 28 + 31+30+31+30
    elif mes==8:
        dia = dia+ 31 + 28+31+30+31+30+31
    elif mes==9:
        dia = dia+ 31 + 28+31+30+31+30+31+31
    elif mes==10:
        dia== dia+ 31 + 28+31+30+31+30+31+31+30
    elif mes==11:
        dia = dia+ 31 + 28+31+30+31+30+31+31+30+31
    elif mes==12:
        dia = dia+ 31 + 28+31+30+31+30+31+31+30+31+30
      


print("--------------------------------------------")
print("Ejercicio 4")   
"""
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


        