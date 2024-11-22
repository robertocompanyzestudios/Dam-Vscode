num = int(input("Introduce un número para mostrar todos los números anteriores: "))

total = 0
if num < 1:
    print("El número se ecuentra fuera de rango")
else:
    print(f"Numeros pares hasta {num}")
    for i in range(0, num +1):
        if i % 2 == 0:
            print(i)

    print(f"Numeros impares hasta {num}")
    for i in range(0, num +1):
        if i % 2 == 1:
            print(i)
