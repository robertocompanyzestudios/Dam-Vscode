#Nos solicite 5 números, y nos los muestre a la inversa de cómo los hemos introducido

lista1 = list()
for i in range(1,6):
    num = int(input(f"Introduzca el {i}º número: "))
    lista1.append(num)

for i in range(0,5):
    posicion = 4-i
    print(lista1[posicion])
