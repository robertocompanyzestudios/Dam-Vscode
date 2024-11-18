#Roberto Company Zomeño
#Solicitar entero positivo y contar los pares/impares hasta introducir 0

num = 1
pares = 0
impares = 0
while num != 0:
    print("Para finalizar el programa introduzca 0")
    num = int(input("Introduzca un número positivo: "))

    if num > 0:
        if num % 2 == 0:
            pares = pares + 1
        else:
            impares = impares + 1
    elif num < 0:
        print("El numero debe ser positivo (mayor que 0)")


print(f"Ha introducido {pares} numeros pares")
print(f"Ha introducido {impares} numeros impares")