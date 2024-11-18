#Nos solicite 5 números, y posteriormente nos los muestre.

lista1 = list()
for i in range(1,6):
    num = int(input(f"Introduzca el {i}º número"))
    lista1.append(num)

for i in range(0,5):
    print(lista1[i])