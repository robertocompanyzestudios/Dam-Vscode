#Roberto Company Zomeño
# Muestra todos los numeros multiplos de 3 entre num1 y num2

print("-------------------------------")
print("Mostrar todos los multiplos de 3 entre A y B")
num1 = int(input("Introduzca el valor A: "))
num2 = int(input("Introduzca el valor B: "))
print("-------------------------------")

if num1 < num2:
    print(f"Mostrando multiplos de 3 entre {num1} y {num2}:")
    for i in range(num1, num2):
        if i % 3 == 0:
            print(i)
else:
    print("Numero fuera de rango")
    print("A tiene que ser menor que B")