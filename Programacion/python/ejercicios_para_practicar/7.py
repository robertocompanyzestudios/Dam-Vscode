#imprime una escalera de x numeros
n = int(input("¿Cuantos escalones quiere que tenga su escalera?: "))

for i in range(1,n+1):
    for j in range(0,i):
        print(i, end="")
    print("")