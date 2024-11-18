#Roberto Company Zomeño
#Muestra las tablas de multiplicar entre 2 numeros
#Faltas de ortografia(tildes) para evitar errores de legibilidad

def tablaMultiplicar(num):
    multiplo = 0
    print(f"La tabla de multiplicar del {num}, desde 10 hasta el 1, es:")
    print("--------------------------------------------------")
    for i in range(10,0,-1):
        multiplo = i*num
        print(f"{num}x{i}={multiplo}")
print("Se mostraran las tablas de multiplicar entre 2 numeros")


while True:
    inicio = int(input("Introduzca el primer numero: "))
    fin = int(input("Introduzca el segundo numero: "))

    if inicio > 0 and fin > 0 and inicio<fin:
        for i in range(inicio, fin+1):
            tablaMultiplicar(i)
        break
    else:
        print("--------------------------------------------------")
        print("ERROR")
        print("-El primer numero debe ser menor que el segundo")
        print("-Ambos numeros deben ser positivos(mayores que 12)")
        print("--------------------------------------------------")