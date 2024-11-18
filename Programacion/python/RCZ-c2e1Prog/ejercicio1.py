#Roberto Company Zomeño
#Añade n elementos a lista[] y muestra lista[] al reves
lista = []

n = int(input("¿Cuántos elementos va a introducir?: "))

for i in range(0,n):
    elemento = input(f"Introduzca el {i+1}º elemento: ")
    lista.append(elemento)

lista.reverse()
print(lista)