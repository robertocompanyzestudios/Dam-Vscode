num = int(input("Introduce un número para mostrar todos los números anteriores: "))

if num < 1:
    print("El número se ecuentra fuera de rango")
else:
    for i in range(1, num +1):
        print(i)
