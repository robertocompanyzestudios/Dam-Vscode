#Roberto Company Zomeño
#Comprueba la cantidad de cada vocal en una palabra

diccionario =  {
    'a' : 0,
    'e' : 0,
    "i" : 0,
    "o" : 0,
    "u" : 0,
}

palabra = str.lower(input("Comprobar vocales de la palabra: "))

for i in palabra:
    if i in diccionario:
        diccionario[i] = diccionario[i] +1
print(diccionario)

print("---------------------------------")
print(f"Vocales en {palabra}:")
print(f"A - {diccionario['a']}")
print(f"E - {diccionario['e']}")
print(f"I - {diccionario['i']}")
print(f"O - {diccionario['o']}")
print(f"U - {diccionario['u']}")