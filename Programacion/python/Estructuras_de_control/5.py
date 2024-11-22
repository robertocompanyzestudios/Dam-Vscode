num1 = int(input("Introduzca el valor inicial del rango: "))
num2 = int(input("¿Hasta que numero desea imprimir las tablas de multiplicar?: "))

if num2 > num1 :
    for i in range(num1, num2):
        print("-------------------")
        print(f"Tabla del {i}: ")
        for j in range(1,11):
            print(f"{i} x {j} = {i * j}")
else:
    print("Numero fuera de rango")