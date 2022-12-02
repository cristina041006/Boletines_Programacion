
print ("Ejercicio1*")

cadena="hola queeeee tal"
caracter="e"

def charactersInString (string, character):
    list=[]
    for i in range(len(string)):
        if character.upper() in string[i].upper():
            list.append(string[i])
    return len(list)

print(charactersInString(cadena, caracter))

print("-------------------------------")

print("Ejercicio2*")

cadena2="Hola QUE tal"

def lowCaseInString (string):
    list=0
    espacios=" "
    for i in range(len(string)):
        if string[i] not in espacios:
            if string[i]==string[i].lower():
                list+=1
    
    return list

print (lowCaseInString(cadena2))

print("Ejercicio3*")

cadena3="HOLA que TAL"

def upperCaseInString (string):
    list=0
    espacios=" "
    for i in range(len(string)):
        if string[i] not in espacios:
            if string[i]==string[i].upper():
                list+=1
            
    return list

print (upperCaseInString(cadena3))    

print("-------------------------------------")
print("Ejercicio4*")

cadena4="12hola34231413"

def numberInString (string):
    numero="1234567890"
    list_n=[]
    for i in range(len(string)):
        if string[i] in numero:
            list_n.append(string[i])
    return len(list_n)

print (numberInString(cadena4))
        

print ("-----------------------")
print("Ejercicio5*")

cadena5="anilina"
cadena5_1="dabale arroz a la zorra el abad"

def reverseCadena (listaOriginal=[]):
    listaReverse=[]
    for i in range(len(listaOriginal)):
        listaReverse.append(listaOriginal[-(i+1)])
    return listaReverse


def palindrome (string):
    palindromo=False
    espacio=" "
    newString=[]
    for i in range (len(string)):
        if string[i] not in espacio:
            newString.append(string[i])  
    stringReverse=reverseCadena(newString) 
    if stringReverse==newString:
        palindromo=True
    return palindromo

print(palindrome(cadena5_1))

print("---------------------------------------")

print("Ejercicio6*")

escondida="syhobaxlna"
encontrada="hola"

def palabraEscondida (palabra1, palabra2):
    palabra=""
    contador1=0
    esta=True
    for i in range(len(palabra1)):
        if palabra1[i] == palabra2[contador1]:
            palabra+= str(palabra1[i])
            contador1+=1
    if palabra != palabra2:
        esta=False 
    return esta

print (palabraEscondida(escondida, encontrada))
  
print("--------------------------")
print("Ejercicio7")

cadena7="Hola me llamo cristina"
palabraEncontrar="cristina"
palabraSustituir="Maria"

def sustituir (cadena1, cadena2, cadena3):
    cambio=cadena1[cadena2]
    if cadena2 in cadena1:
        cadena2=cadena3
    return cadena1 

print(sustituir(cadena7, palabraEncontrar, palabraSustituir))  


print("-------------------------------------")

print("Ejercicio8*")

cadena8="abaaaaaaco"

def cuantasVocales (cadena):
    vocales="aeiou".upper()
    listaAux=[]
    lista_v=[]
    for i in range(len(cadena)):
        if cadena[i] not in listaAux:
            listaAux.append(cadena[i])
    for i in range(len(listaAux)):
        if listaAux[i].upper() in vocales: 
            lista_v.append(cadena[i])
    return len(lista_v)

print(cuantasVocales(cadena8))


print("-----------------------------")

print("Ejercicio9*")

def desordenar (cadena):
    consonantes="qwrtypsdfghjklñzxcvbnm"
    vocales="aeiou"
    espacio=" "
    vocal=""
    consonante=""
    cadenaNueva=""
    
    for i in range(len(cadena)):
        if cadena[i] not in espacio:
            cadenaNueva+= str(cadena[i])
    for i in range(len(cadenaNueva)):
        if cadenaNueva[i] in consonantes:
            consonante+= str(cadenaNueva[i])
        elif cadenaNueva[i] in vocales:
            vocal+= str(cadenaNueva[i])
    final= consonante + vocal 
    return final 

print(desordenar("curso de programacion"))       
    
print("------------------------")
print("Ejercicio10")

def cuantasPalabras (cadena):
    espacio=" "
    letras="qwertyuiopasdfghjklñzxcvbnm"
    palabras=1
    for i in range(len(cadena)):
        if cadena[i] in espacio and cadena[(i+1)] in letras:
            palabras+=1
    return palabras

print(cuantasPalabras("He estudiado mucho     para el examen"))                        
'''       