#Roberto Company Zomeño
#Transformador decimal a binario y viceversa
def binario(num):

    #calcula el numero de que tendrá el numero en binario
    condicion = True
    exponente = 0
    while condicion:
        potencia = 2**exponente
        if potencia > num:
            break

        exponente = exponente + 1

    print(f"el numero en binario tiene {exponente} cifras")

    #va restando y escribiendo el valor de las "celdas" del numero binario
    binario = ""
    for i in range(exponente-1, -1, -1):
        if num >= 2**i:
            num = num - 2**i
            binario = binario + "1"
        else:
            binario = binario + "0"
    #return binario

    decimal = ""
    for i in range(-1, (exponente * -1), -1):
        if binario[i] == 1:
            num = num - 2**
            binario = binario + "1"
        else:
            binario = binario + "0"

num = int(input("Que numero desea pasar a binario: "))
binario(num)