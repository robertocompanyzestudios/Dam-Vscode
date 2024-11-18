#Roberto Company Zomeño
#Escribir los cubos del 1 al numero elegido

num = int(input("Mostrar los cubos del 1 al: "))

if num > 1:
    cubo = 0
    for i in range(1, num+1):
        cubo = i**3
        print(f"Numero {i}. Su cubo es {cubo}")
else:
    print("El numero debe ser mayor que 1")