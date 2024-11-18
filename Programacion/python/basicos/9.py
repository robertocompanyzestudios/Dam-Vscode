#Nos pida 5 palabras por teclado, y nos las muestre en una línea separadas por comas.

lista1 = list()
for i in range(1,6):
    palabra = input(f"Introduzca la {i}º palabra: ")
    lista1.append(palabra)

print(f"{lista1[0]}, {lista1[1]}, {lista1[2]}, {lista1[3]}, {lista1[4]}")