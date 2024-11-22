print("Programa de comprobación de digitos")
num = int(input("Numero a comprobar: "))
print("------------------------")

comprobar = num
contador = 0
if num > 0:
    while comprobar >= 1:
        contador = contador + 1
        comprobar = comprobar /10

    print(f"El numero {num} tiene {contador} digitos")

else:
    print("El numero debe ser mayor que 0")