#Solicite que introduzcamos 5 palabras por teclado, y después nos las muestre a la inversa de cómo las hemos introducido.

lista1 = list()
for i in range(1,6):
    palabra = input(f"Introduzca la {i}º palabra: ")
    lista1.append(palabra)


for i in range(0,5):
    posicion = 4-i
    print(lista1[posicion])
