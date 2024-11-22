#Añade a una lista las posiciones pares de list1 y las posiciones impares de list2

list1 = []
list2 = []
num = -1
while True:
    print("Introduce 0 si has acabado con la lista")
    num = int(input("Introduzca un numero para añadirlo a la lista 1: "))
    if num == 0:
        break
    list1.append(num)

while True:
    print("Introduce 0 si has acabado con la lista")
    num = int(input("Introduzca un numero para añadirlo a la lista: "))
    if num == 0:
        break
    list2.append(num)

list3 = []
for i in range(0,len(list1)):
    if i % 2 == 0:
        list3.append(list1[i])
    else:
        list3.append(list2[i])

print(list3)
