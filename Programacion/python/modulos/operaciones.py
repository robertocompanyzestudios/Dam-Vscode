def suma(x,y):
    resultado = x + y
    print(f"Resultado = {resultado}")

def resta(x,y):
    resultado = x - y
    print(f"Resultado = {resultado}")

def multiplicacion(x,y):
    resultado = x * y
    print(f"Resultado = {resultado}")

def division(x,y):
    resultado = x / y
    print(f"Resultado = {resultado}")

def mcm(x, y):
    MCM = 0
    encontrado = False
    while encontrado == False:
        MCM = MCM + 1
        if MCM % x == 0 and MCM % y == 0:
            break
    print(f"MCM = {MCM}")


def mcd(x, y):
    for i in range(x, 0, -1):
        if x % i == 0 and y % i == 0:
            MCD = i
            break
    print(f"MCD = {MCD}")