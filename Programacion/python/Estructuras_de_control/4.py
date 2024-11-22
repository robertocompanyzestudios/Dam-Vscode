num = int(input("¿Hasta que numero desea imprimir las tablas de multiplicar?: "))

if num > 0:
    for i in range(1,11):
        print(f"{num} x {i} = {num * i}")
else:
    print("Numero no válido")