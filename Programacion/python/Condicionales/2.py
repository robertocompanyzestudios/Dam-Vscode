#Comprobacion numero mayor Roberto Company Zomeño
lista = []

num1 = int(input("Introduzca el primer numero a comparar: "))
num2 = int(input("Introduzca el segundo numero a comparar: "))
num3 = int(input("Introduzca el tercer numero a comparar: "))
lista.append(num1)
lista.append(num2)
lista.append(num3)


for i in range(0,3):
    if i == 0:
        max = lista[i]
    else:
        if lista[i] > max:
            max = lista[i]

print(f"El numero mayor es {max}")