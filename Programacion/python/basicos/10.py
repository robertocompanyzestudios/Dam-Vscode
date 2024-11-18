#Nos pida 5 números por teclado, y nos los muestre en una línea separados por comas.

lista1 = list()
for i in range(1,6):
    num = input(f"Introduzca el {i}º número: ")
    lista1.append(num)

print(f"{lista1[0]}, {lista1[1]}, {lista1[2]}, {lista1[3]}, {lista1[4]}")