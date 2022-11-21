
print("Ejercicio1*")

from random import randint


lista=[]

print("Mostrar todos los numeros")
for i in range(100):
    lista.append(randint(0, 1000))
print(lista)

print("El numero mayor")
def obtenerElementoMayor(lista2):
    mayor=0
    for i in range(len(lista)):
        if lista2[i]>mayor:
            mayor=lista2[i]
    return mayor

print(obtenerElementoMayor(lista))

print("El numero menor")

def obtenerElementoMenor(lista3):
    menor=1000
    for i in range(len(lista)):
        if lista3[i]<menor:
            menor=lista3[i]
    return menor

print(obtenerElementoMenor(lista))

print("Suma de numeros")

def conocerSuma(lista4):
    suma=0
    for i in range(len(lista)):
        suma+=lista[i]
    return suma

print(conocerSuma(lista))

print("Media de numeros")

def conocerMedia(lista5):
    media = conocerSuma(lista)/100
    return media

print(conocerMedia(lista))

print("Sustituir elemento")

def susutituirElemento(lista6):
    numero=int(input("Dime un nuevo valor"))
    lista[2]=numero
    return lista

print (susutituirElemento(lista))

print("--------------------------------------------------------------------------------------------------------------")
print("Ejercicio2*")

def desplazar(lista):
    escribir=0
    guardar=0
    guardar2=lista[0]
    for i in range(len(lista)):
        escribir=guardar2
        guardar=lista[((i+1)%len(lista))]
        lista[((i+1)%len(lista))]=escribir
        guardar2=guardar
    return lista


lista2=[]


tamaño=10
fin=0
while tamaño != fin:
    numero=int(input("Dime un numero"))
    fin+=1
    lista2.append(numero)
print(lista2)
print(desplazar(lista2))
    

print("--------------------------------------------------")
print("Ejercicio3*")

day= int(input("Dime un dia"))
month= int(input("Dime un mes"))
year= int(input("Dime un año"))


def bisiesto (year):
    return year%4==0 and (year%100!=0 or year%400==0)

def transformar_formato_largo(dd, mm, yyyy):
    nombre_de_meses=["Enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "nomviembre", "diciembre"]
    dias_max_mes=[31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    
    if 1<=dd <=dias_max_mes[mm-1] or (bisiesto(yyyy) and 1<=dd<=29 and mm==2) and 1<=mm<=12:
        mensaje = f"{dd} de {nombre_de_meses[mm-1]} de {yyyy}"
    else:
        mensaje= "formato no valido "
        
    return mensaje

while day>=0:
    print(transformar_formato_largo(day, month, year))
    day= int(input("Dime un dia"))
    month= int(input("Dime un mes"))
    year= int(input("Dime un año"))
    

print("-------------------------------------------")

print("Ejercicio4*")

numero=int(input("Dime un número"))
lista=[]

def numerosSucesivos(numero):
    lista.append(numero)
    return lista

def elementoMayor(lista1):
    mayor=0
    for i in range(len(lista)):
        if lista1[i]>mayor:
            mayor=lista1[i]
    return mayor

def pares (numero):
    lista2=[]
    for i in range(len(lista)):
        if lista[i]%2==0:
            lista2.append(lista[i])
    return lista2
    
while numero>0:
    print(numerosSucesivos(numero))
    numero=int(input("Dime un número"))
    
print(elementoMayor(lista), pares(lista))    
  
print("------------------------------------------------------------------")

print("Ejercicio5*")

listaNormal=['Di', 'buen', 'dia', 'a', 'papa']

def reverse (listaOriginal=[]):
    listaReverse=[]
    for i in range(len(listaOriginal)):
        listaReverse.append(listaOriginal[-(i+1)])
    return listaReverse

print(reverse(listaNormal))
    
print("----------------------------------------------")



print("Ejercicio6*")

lista6=[25, 23, 33, 40]

def estaOrdenada(list=[]):
    aux=list[0]
    estado=True
    contador=0
    for i in range(len(list[0:-1])):
        if list[i]>=aux and list[i]<list[i+1]:
            contador+=1
    if contador==len(list)-1:
        estado=True
    else:
        estado=False
    return estado
        

        
print(estaOrdenada(lista6))


print("-----------------------------------------------")

print("Ejercicio7*")
listaDom1=[4, 6]
listaDom2=[8, 5]
def encajan (listaDomino1=[], listaDomino2=[]):
    mensaje=""
    print(listaDomino1)
    print(listaDomino2)
    if (listaDomino1[-1]==listaDomino2[0]) or (listaDomino2[-1]==listaDomino1[0]):
        mensaje="Encajan"
    else:
        mensaje="No encajan"
        
    return mensaje
    
print (encajan(listaDom1, listaDom2))    

print("----------------------------------------------------")

print("Ejercicio8*")   

numero8=int(input("Dime un número"))
lista8=[]

def numeroSucesivo(lista):
    lista8.append(numero8)
    return lista

def filtrarPrimos(n):
    es_primo=True
    for i in range(2, n):
        if n%i==0:
            es_primo=False
    return es_primo  

def filtarPrimos_lista(lista):
    listaPrimos=[]
    for elemento in lista:
        if filtrarPrimos(elemento):
            listaPrimos.append(elemento)
    return listaPrimos
              
            
def Sumar(lista):
    suma=0
    for i in range(len(lista)):
        suma+=lista[i]
    return suma
def hacerPromedio (lista):
    media = Sumar(lista)/len(lista)
    return media
           
while numero8>0:
    numeroSucesivo(numero8)
    numero8=int(input("Dime un número"))   
print(lista8)
print(filtarPrimos_lista(lista8))
print(Sumar(lista8))
print(hacerPromedio(lista8))



print("--------------------------------------------")

print("Ejercicio9*")

lista9=[1, 2, 3, 4, 5, 6 ,7]
entero=2

def devolverMenores (numero, list):
    listaA=[]
    for i in range(len(list)):
        if numero>list[i]:
            listaA.append(list[i])
    return listaA 

def devolverMayores (numero, list):
    listaB=[]
    for i in range(len(list)):
        if numero<list[i]:
            listaB.append(list[i])
    return listaB

def esMultiplo (numero, list):
    listaC=[]
    for i in range(len(list)):
        if list[i]%numero==0:
            listaC.append(list[i])
    return listaC
   

print(devolverMenores(entero, lista9))
print(devolverMayores(entero, lista9))
print(esMultiplo(entero, lista9))

print("-----------------------------------------")
print("Ejercicio10*")

def reverseCadena (listaOriginal=[]):
    listaReverse=[]
    for i in range(len(listaOriginal)):
        listaReverse.append(listaOriginal[-(i+1)])
    return listaReverse

numeroBinario=input("Dime un número binario")
def conversor (numero):
    normal=""
    contador=0
    suma=0
    sumaAux=0
    consciente=0
    siguiente=0
    siguienteAux=1
    for caracter in numero:
        if caracter[-1]=="B":
            numero=reverseCadena(numero[0:-1])
            for elemento in numero:
                elemento= int(elemento)
                if elemento==1:
                    normal+=str(1*(2**contador))
                contador+=1
            for elemento in normal:
                elemento=int(elemento)
                suma+=elemento     
                
        if caracter[-1]=="D":
            sumaAux=str(sumaAux)
            sumaAux=""
            numero=numero[0:-1]
            numero=int(numero)
            suma=str(suma)
            suma=""
            while siguienteAux>0:
                consciente=numero%2
                siguiente=numero//2
                numero=siguiente
                siguienteAux=siguiente
                sumaAux+=str(consciente)              
            sumaAux=reverseCadena(sumaAux)
            for i in range(len(sumaAux)):
                suma+=str(sumaAux[i])
                
    return suma
print(conversor(numeroBinario))
 

print("-------------------------------")

print("Ejercicio11*")

lista11=[1, 2, 3, 5, 6, 7]
list11=[9, 8, 7, 6, 5]

def intersect(lista1, lista2):
    listaIntersect=[]
    for i in range(len(lista1)):
        for a in range(len(lista2)):
            if lista1[i]==lista2[a]:
                listaIntersect.append(lista1[i])
                
    return listaIntersect


print(intersect(lista11, list11))
                
print("--------------------------")


print("Ejercicio12*")

lista12=[1, 2, 3, 4, 5, 9, 10]
list12=[4, 5, 6, 7, 8, 9]

def unionListas(lista1, lista2):
    listaUnida=[]
    for elemento in lista1:
        if not(elemento in lista2):
            listaUnida.append(elemento)
    for elemento in lista2:
        if not(elemento in lista1):
            listaUnida.append(elemento)        
    return listaUnida

print(unionListas(lista12, list12))


print("-------------------------------------------------")
print("Ejercicio13*Validacion")

listaNombres=["Lucia", "Angela", "Andres", "Marcos", "Alexander"]
letra="L"

def es_letra(letra):
    listaLetra=["A", "B", 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
    valido = True
    letra = letra.upper()
    if letra not in listaLetra:
        valido=False
    return  valido   
    
def comprobarNombres(lista, l):
    listaNombresDef=[]
    for i in range(len(lista)):
        if l==lista[i][0]:
            listaNombresDef.append(lista[i])
    return listaNombresDef

print(comprobarNombres(listaNombres, letra)) 
           
print("---------------------------------")
print("Ejercicio14*")

cadena14="Hola que tal"
string14="Hola eee tal" 

def es_mas_larga(cadena1, cadena2):
    mensaje=""
    if len(cadena1)>len(cadena2):
        mensaje=cadena1
    elif len(cadena2)>len(cadena1):
        mensaje=cadena2
    else:
        l1=[]
        l2=[]
        
        for elemento in cadena1:
            if elemento not in l1:
                l1.append(elemento) 
        for elemento in cadena2:
            if elemento not in l2:
                l2.append(elemento)   
        
        if len(l1)<len(l2):
            mensaje=cadena1
        elif len(l2)<len(l1):
            mensaje=cadena2
        
    return mensaje

print(es_mas_larga(cadena14, string14))        
        
 
    
    
