num = int(input("Introduce un número para mostrar la suma de todos los pares e impares hasta ese numero: "))

totalpar = 0
totalimpar = 0
if num < 1:
    print("El número se ecuentra fuera de rango")
else:
    print(f"Numeros pares hasta {num}")
    for i in range(0, num +1):
        if i % 2 == 0:
            totalpar = totalpar + i
        else:
            totalimpar = totalimpar + i

    print(f"La suma de todos los numeros pares es {totalpar}")
    print(f"La suma de todos los numeros impares es {totalimpar}")