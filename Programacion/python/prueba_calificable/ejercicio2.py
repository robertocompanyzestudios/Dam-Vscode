#Roberto Company Zomeño
# Muestra n datos de la secuencia de Fibonacci

print("-------------------------------")
num = int(input("¿Cuantos datos de la secuencia de fibonacci quiere mostrar?: "))
print("-------------------------------")

contador = 0
num1 = 0
num2 = 0
num3 = 0
if num > 0:
    while contador < num:
        if contador == 1:
            num1 = 0
            num2 = 1
        else:
            num1 = num2
            num2 = num3

        contador = contador +1
        num3 = num1 + num2
        print(num3)
else:
    print("La cantidad debe ser mayor que 0.")
