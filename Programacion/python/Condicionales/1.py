#Comparacion numeros menor Roberto Company Zomeño
num1 = int(input("Introduzca el primer numero a comparar: "))
num2 = int(input("Introduzca el segundo numero a comparar: "))

if num1 > num2:
    print(f"{num1} es mayor que {num2}")
elif num1 < num2:
    print(f"{num2} es mayor que {num1}")
else:
    print("Ambos números son iguales")