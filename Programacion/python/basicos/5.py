#Solicite que introduzcamos 5 palabras por teclado, y después nos las muestre.

lista1 = list()
for i in range(1,6):
    palabra = str(input(f"Introduzca la {i}º palabra: "))
    lista1.append(palabra)

for i in range(0,5):
    print(lista1[i])