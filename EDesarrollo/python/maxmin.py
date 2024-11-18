#pide 10 números
for i in range(0,10):
    num=int(input("Introduce un número: "))

    #Asigna num en la primera ejecucion del bucle a las variables a comparar más tarde
    if i == 0:
        max = num
        min = num
    #Compara num y lo almacena como mayor o menor
    if max < num:
        max = num
    elif min > num:
        min = num

print(f"Numero máximo = {max}")
print(f"Numero mínimo = {min}")