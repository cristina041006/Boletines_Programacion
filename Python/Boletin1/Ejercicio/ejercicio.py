'''
Created on 22 sept 2022

@author: crist
'''


print("Ejercicio 1")

print("a) 7>=27 and not(7<=2) =", 7>=27 and not(7<=2))
print("b) 24>5 and 10<=10 or 10==5 =", 24>5 and 10<=10 or 10==5)
print("c) (10>=15 or 23==13) and not(8==8) =", (10>=15 or 23==13) and not(8==8))
print("d) not (6/3>3) or 7>7 =", not (6/3>3) or 7>7)

print("-----------------------------------")

print("Ejercicio 2")

print("a) 27%4+15/4 = ", 27%4+15/4, type(27%4+15/4))
print("b) 37/4**2-2 = ", 37/4**2-2, type(37/4**2-2))
print("c) 9*2/3*10*3 =", 9*2/3*10*3, type(9*2/3*10*3))
print("d) (7*3-4*4)**2/4*2 =", (7*3-4*4)**2/4*2, type((7*3-4*4)**2/4*2))

print("-------------------------------------------------------")

print("Ejercicio 3")

print("a)")
precio = 45
print(60 <= precio and precio <= 420)
precio = 75
print(60 <= precio and precio <= 420)

print("b)")
numero = 5
print(numero%2==0)
numero = 4
print(numero%2==0)

print("c)")
saldo = 1000
dineroSacar = 50
print(0 <= saldo and (0 < dineroSacar and dineroSacar <= saldo))
saldo = -1000
dineroSacar = 1000
print(0 <= saldo and (0 < dineroSacar and dineroSacar <= saldo))
saldo = 1000
dineroSacar = 2000
print(0 <= saldo and (0 < dineroSacar and dineroSacar <= saldo))

print("d)")
hora = 22
minutos = 40
print(0 < hora < 23 and 0 < minutos < 59)
hora = 25
minutos = 30
print(0 < hora < 23 and 0 < minutos < 59)
hora = 25
minutos = 80
print(0 < hora < 23 and 0 < minutos < 59)

print("e")
estadoCivil = "S"
print(not(estadoCivil == "S" or estadoCivil =="C" or estadoCivil == "V" or estadoCivil == "D"))
estadoCivil = "C"
print(not(estadoCivil == "S" or estadoCivil =="C" or estadoCivil == "V" or estadoCivil == "D"))
estadoCivil = "V"
print(not(estadoCivil == "S" or estadoCivil =="C" or estadoCivil == "V" or estadoCivil == "D"))
estadoCivil = "D"
print(not(estadoCivil == "S" or estadoCivil =="C" or estadoCivil == "V" or estadoCivil == "D"))

print("------------------------------------------------------------")

print("Ejercicio 4")

print("a)")
cantidad = 200
print(0 <= cantidad and cantidad <= 300)
cantidad = 500
print(0 <= cantidad and cantidad <= 300)
cantidad = -50
print(0 <= cantidad and cantidad <= 300)

print("b)")
edad = 18
print(not(16 < edad < 22) )
edad = 28
print(not(16 < edad < 22) )
edad = 10
print(not(16 < edad < 22) )

print("c)")


print("d)")
numero = 17
print(not(numero%7==0 or numero%3==0))
numero = 15
print(not(numero%7==0 or numero%3==0))
numero = 14
print(not(numero%7==0 or numero%3==0))


print("--------------------------------------------")

print("Ejercicio 5")

print("a) (A OR B) AND NOT(A)")

A = True; B= True

print((A or B) and not(A))

A = True; B= False

print((A or B) and not(A))

A = False; B= True

print((A or B) and not(A))

A = False; B= False

print((A or B) and not(A))

print("b) NOT (A OR B) AND B")

A = True; B= True

print(not (A or B) and B)

A = True; B= False

print(not (A or B) and B)

A = False; B= True

print(not (A or B) and B)

A = False; B= False

print(not (A or B) and B)

print("c) A OR NOT (B)")

A = True; B= True

print(A or not(B))

A = True; B= False

print(A or not(B))

A = False; B= True

print(A or not(B))

A = False; B= False

print(A or not(B))

print("d) NOT ((A AND B) AND (B OR A))")

A = True; B= True

print(not((A and B) and (B or A)))

A = True; B= False

print(not((A and B) and (B or A)))


A = False; B= True

print(not((A and B) and (B or A)))

A = False; B= False

print(not((A and B) and (B or A)))


