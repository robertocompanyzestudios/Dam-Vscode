import operaciones as op

print("(a) CALCULADORA")
print("(b) TABLAS DE MULTIPLICAR")
print("(c) MCD")
print("(d) MCM")
choice =  str.lower(input("Que modo desea usar: "))

if choice == 'a':
    #A calculadora
    print("(a) SUMA")
    print("(b) RESTA")
    print("(c) MULTIPLICACION")
    print("(d) DIVISION")
    choice =  str.lower(input("Que operacion desea hacer: "))

    num1 = float(input("Introduzca el primer número de la operacion: "))
    num2 = float(input("Introduzca el segundo número de la operacion: "))

    if choice == 'a':
        op.suma(num1, num2)
    elif choice == 'b':
        op.resta(num1, num2)
    elif choice == 'c':
        op.multiplicacion(num1, num2)
    elif choice == 'd':
        op.division(num1, num2)


elif choice == 'b':
    num = int(input("Mostrar la tabla de multiplicar del numero: "))
    for i in range(1,11):
        print(f"{num} x {i} = {num * i}")


elif choice == 'c':
    num1 = int(input("Introduzca el primer numero a comparar para el MCD: "))
    num2 = int(input("Introduzca el segundo numero a comparar para el MCD: "))
    op.mcd(num1, num2)


elif choice == 'd':
    num1 = int(input("Introduzca el primer numero a comparar para el MCM: "))
    num2 = int(input("Introduzca el segundo numero a comparar para el MCM: "))
    op.mcm(num1, num2)


else:
    print("Eleccion no valida, elija: (a), (b), (c) o (d)")